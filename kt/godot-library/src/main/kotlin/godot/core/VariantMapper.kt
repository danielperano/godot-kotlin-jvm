package godot.core

import godot.core.callable.KtCallable
import godot.signals.Signal

@PublishedApi
internal val variantMapper = mutableMapOf(
    Unit::class to VariantType.NIL,
    Any::class to VariantType.ANY,
    java.lang.Object::class to VariantType.ANY,
    Boolean::class to VariantType.BOOL,
    Int::class to VariantType.JVM_INT,
    Long::class to VariantType.LONG,
    Float::class to VariantType.JVM_FLOAT,
    Byte::class to VariantType.JVM_BYTE,
    Double::class to VariantType.DOUBLE,
    String::class to VariantType.STRING,
    AABB::class to VariantType.AABB,
    Basis::class to VariantType.BASIS,
    Color::class to VariantType.COLOR,
    StringName::class to VariantType.STRING_NAME,
    Dictionary::class to VariantType.DICTIONARY,
    VariantArray::class to VariantType.ARRAY,
    Plane::class to VariantType.PLANE,
    NodePath::class to VariantType.NODE_PATH,
    Quaternion::class to VariantType.QUATERNION,
    Rect2::class to VariantType.RECT2,
    Rect2i::class to VariantType.RECT2I,
    RID::class to VariantType._RID,
    Transform3D::class to VariantType.TRANSFORM3D,
    Transform2D::class to VariantType.TRANSFORM2D,
    Vector2::class to VariantType.VECTOR2,
    Vector2i::class to VariantType.VECTOR2I,
    Vector3::class to VariantType.VECTOR3,
    Vector3i::class to VariantType.VECTOR3I,
    Vector4::class to VariantType.VECTOR4,
    Vector4i::class to VariantType.VECTOR4I,
    Projection::class to VariantType.PROJECTION,
    NativeCallable::class to VariantType.CALLABLE,
    KtCallable::class to VariantType.CALLABLE,
    Signal::class to VariantType.SIGNAL,
    PackedByteArray::class to VariantType.PACKED_BYTE_ARRAY,
    PackedColorArray::class to VariantType.PACKED_COLOR_ARRAY,
    PackedInt32Array::class to VariantType.PACKED_INT_32_ARRAY,
    PackedInt64Array::class to VariantType.PACKED_INT_64_ARRAY,
    PackedFloat32Array::class to VariantType.PACKED_FLOAT_32_ARRAY,
    PackedFloat64Array::class to VariantType.PACKED_FLOAT_64_ARRAY,
    PackedStringArray::class to VariantType.PACKED_STRING_ARRAY,
    PackedVector2Array::class to VariantType.PACKED_VECTOR2_ARRAY,
    PackedVector3Array::class to VariantType.PACKED_VECTOR3_ARRAY
)