#ifndef GODOT_JVM_KOTLIN_CALLABLE_CUSTOM_H
#define GODOT_JVM_KOTLIN_CALLABLE_CUSTOM_H


#include "jvm_wrapper/jvm_instance_wrapper.h"
#include "core/variant/callable.h"

JVM_INSTANCE_WRAPPER(KtCallable, "godot.core.callable.KtCallable") {
    JVM_CLASS(KtCallable)
    // clang-format off

    JNI_METHOD(INVOKE_NO_RETURN)
    JNI_METHOD(INVOKE_WITH_RETURN)
    JNI_METHOD(GET_RETURN_VARIANT_TYPE)
    JNI_METHOD(HASH_CODE)

    INIT_JNI_BINDINGS(
        INIT_JNI_METHOD(INVOKE_NO_RETURN, "invokeNoReturn", "()V")
        INIT_JNI_METHOD(INVOKE_WITH_RETURN, "invokeWithReturn", "()Ljava/lang/Object;")
        INIT_JNI_METHOD(GET_RETURN_VARIANT_TYPE, "getReturnVariantType", "()I")
        INIT_JNI_METHOD(HASH_CODE, "hashCode", "()I")
    )

    // clang-format on

public:
    void invoke(jni::Env& p_env, const Variant** p_args, int args_count, Variant& r_ret) const;
    int get_hash_code() const;
    bool equals(const KtCallable& other) const;

    KtCallable(jni::Env& p_env, jni::JObject p_wrapped, Variant::Type return_type, int p_hash_code);

private:
    int hash_code;
    bool has_return_value;
};

class KotlinCallableCustom : public CallableCustom {
public:
    void call(const Variant** p_arguments, int p_argcount, Variant& r_return_value, Callable::CallError& r_call_error) const override;

    uint32_t hash() const override;
    String get_as_text() const override;
    CompareEqualFunc get_compare_equal_func() const override;
    CompareLessFunc get_compare_less_func() const override;
    ObjectID get_object() const override;

    KotlinCallableCustom(jni::Env& p_env, jni::JObject p_wrapped, Variant::Type return_type, int p_hash_code);

private:
    KtCallable kt_callable;

    static bool compare_equal(const CallableCustom* p_a, const CallableCustom* p_b);
    static bool compare_less(const CallableCustom* p_a, const CallableCustom* p_b);
};


#endif //GODOT_JVM_KOTLIN_CALLABLE_CUSTOM_H