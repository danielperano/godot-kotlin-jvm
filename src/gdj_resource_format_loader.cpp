#include "gdj_resource_format_loader.h"

#include "godotkotlin_defs.h"
#include "kotlin_language.h"
#include "kotlin_script.h"
#include "kotlin_script_cache.h"
#include "logging.h"

Error kt_read_all_file_utf8(const String& p_path, String& r_content) {
    Vector<uint8_t> sourcef;
    Error err;
    Ref<FileAccess> file_access {FileAccess::open(p_path, FileAccess::READ, &err)};
    JVM_ERR_FAIL_COND_V_MSG(err != OK, err, "Cannot open file '" + p_path + "'.");

    uint64_t len = file_access->get_length();
    sourcef.resize(len + 1);
    uint8_t* w = sourcef.ptrw();
    int r = file_access->get_buffer(w, len);
    ERR_FAIL_COND_V(r != len, ERR_CANT_OPEN);
    w[len] = 0;

    String source;
    if (source.parse_utf8((const char*) w)) { ERR_FAIL_V(ERR_INVALID_DATA); }

    r_content = source;
    return OK;
}

Ref<Resource> GdjResourceFormatLoader::load(const String& p_path, const String& p_original_path, Error* r_error, bool p_use_sub_threads, float* r_progress, CacheMode p_cache_mode) {
#ifdef TOOLS_ENABLED
    // TODO: check if we need to take CacheMode into account like GDScript does
    Ref<KotlinScript> ref = KotlinScriptCache::get_or_create_script(p_path);
#else
    Ref<KotlinScript> ref {memnew(KotlinScript)};
#endif

    ref->set_path(p_original_path, true);
    ref->reload(false);

#if defined(DEBUG_ENABLED) || defined(TOOLS_ENABLED)
    String source_code;
    Error load_err {kt_read_all_file_utf8(p_original_path, source_code)};
    ref->set_source_code(source_code);
    if (r_error) { *r_error = load_err; }
#else
    if (r_error) { *r_error = OK; }
#endif

    return ref;
}

void GdjResourceFormatLoader::get_recognized_extensions(List<String>* p_extensions) const {
    p_extensions->push_back(GODOT_KOTLIN_REGISTRATION_FILE_EXTENSION);
}

bool GdjResourceFormatLoader::handles_type(const String& p_type) const {
    return p_type == "Script" || p_type == KotlinLanguage::get_instance()->get_type();
}

String GdjResourceFormatLoader::get_resource_type(const String& p_path) const {
    return p_path.get_extension().to_lower() == GODOT_KOTLIN_REGISTRATION_FILE_EXTENSION
           ? KotlinLanguage::get_instance()->get_type()
           : "";
}