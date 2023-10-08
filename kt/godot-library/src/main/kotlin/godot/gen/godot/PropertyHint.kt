// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
package godot

import kotlin.Long

public enum class PropertyHint(
  id: Long,
) {
  PROPERTY_HINT_NONE(0),
  PROPERTY_HINT_RANGE(1),
  PROPERTY_HINT_ENUM(2),
  PROPERTY_HINT_ENUM_SUGGESTION(3),
  PROPERTY_HINT_EXP_EASING(4),
  PROPERTY_HINT_LINK(5),
  PROPERTY_HINT_FLAGS(6),
  PROPERTY_HINT_LAYERS_2D_RENDER(7),
  PROPERTY_HINT_LAYERS_2D_PHYSICS(8),
  PROPERTY_HINT_LAYERS_2D_NAVIGATION(9),
  PROPERTY_HINT_LAYERS_3D_RENDER(10),
  PROPERTY_HINT_LAYERS_3D_PHYSICS(11),
  PROPERTY_HINT_LAYERS_3D_NAVIGATION(12),
  PROPERTY_HINT_LAYERS_AVOIDANCE(37),
  PROPERTY_HINT_FILE(13),
  PROPERTY_HINT_DIR(14),
  PROPERTY_HINT_GLOBAL_FILE(15),
  PROPERTY_HINT_GLOBAL_DIR(16),
  PROPERTY_HINT_RESOURCE_TYPE(17),
  PROPERTY_HINT_MULTILINE_TEXT(18),
  PROPERTY_HINT_EXPRESSION(19),
  PROPERTY_HINT_PLACEHOLDER_TEXT(20),
  PROPERTY_HINT_COLOR_NO_ALPHA(21),
  PROPERTY_HINT_OBJECT_ID(22),
  PROPERTY_HINT_TYPE_STRING(23),
  PROPERTY_HINT_NODE_PATH_TO_EDITED_NODE(24),
  PROPERTY_HINT_OBJECT_TOO_BIG(25),
  PROPERTY_HINT_NODE_PATH_VALID_TYPES(26),
  PROPERTY_HINT_SAVE_FILE(27),
  PROPERTY_HINT_GLOBAL_SAVE_FILE(28),
  PROPERTY_HINT_INT_IS_OBJECTID(29),
  PROPERTY_HINT_INT_IS_POINTER(30),
  PROPERTY_HINT_ARRAY_TYPE(31),
  PROPERTY_HINT_LOCALE_ID(32),
  PROPERTY_HINT_LOCALIZABLE_STRING(33),
  PROPERTY_HINT_NODE_TYPE(34),
  PROPERTY_HINT_HIDE_QUATERNION_EDIT(35),
  PROPERTY_HINT_PASSWORD(36),
  PROPERTY_HINT_MAX(38),
  ;

  public val id: Long
  init {
    this.id = id
  }

  public companion object {
    public fun from(`value`: Long) = entries.single { it.id == `value` }
  }
}
