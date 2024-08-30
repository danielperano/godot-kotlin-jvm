// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.PackedStringArray
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantType.ANY
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_STRING_ARRAY
import godot.core.VariantType.STRING
import godot.core.VariantType.STRING_NAME
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * A resource used for styling/skinning [Control] and [Window] nodes. While individual controls can
 * be styled using their local theme overrides (see [Control.addThemeColorOverride]), theme resources
 * allow you to store and apply the same settings across all controls sharing the same type (e.g. style
 * all [Button]s the same). One theme resource can be used for the entire project, but you can also set
 * a separate theme resource to a branch of control nodes. A theme resource assigned to a control
 * applies to the control itself, as well as all of its direct and indirect children (as long as a
 * chain of controls is uninterrupted).
 * Use [ProjectSettings.gui/theme/custom] to set up a project-scope theme that will be available to
 * every control in your project.
 * Use [Control.theme] of any control node to set up a theme that will be available to that control
 * and all of its direct and indirect children.
 */
@GodotBaseType
public open class Theme : Resource() {
  /**
   * The default base scale factor of this theme resource. Used by some controls to scale their
   * visual properties based on the global scale factor. If this value is set to `0.0`, the global
   * scale factor is used (see [ThemeDB.fallbackBaseScale]).
   * Use [hasDefaultBaseScale] to check if this value is valid.
   */
  public var defaultBaseScale: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultBaseScalePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultBaseScalePtr, NIL)
    }

  /**
   * The default font of this theme resource. Used as the default value when trying to fetch a font
   * resource that doesn't exist in this theme or is in invalid state. If the default font is also
   * missing or invalid, the engine fallback value is used (see [ThemeDB.fallbackFont]).
   * Use [hasDefaultFont] to check if this value is valid.
   */
  public var defaultFont: Font?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultFontPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Font?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultFontPtr, NIL)
    }

  /**
   * The default font size of this theme resource. Used as the default value when trying to fetch a
   * font size value that doesn't exist in this theme or is in invalid state. If the default font size
   * is also missing or invalid, the engine fallback value is used (see [ThemeDB.fallbackFontSize]).
   * Values below `0` are invalid and can be used to unset the property. Use [hasDefaultFontSize] to
   * check if this value is valid.
   */
  public var defaultFontSize: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDefaultFontSizePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDefaultFontSizePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_THEME, scriptIndex)
    return true
  }

  /**
   * Creates or changes the value of the icon property defined by [name] and [themeType]. Use
   * [clearIcon] to remove the property.
   */
  public fun setIcon(
    name: StringName,
    themeType: StringName,
    texture: Texture2D,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setIconPtr, NIL)
  }

  /**
   * Returns the icon property defined by [name] and [themeType], if it exists.
   * Returns the engine fallback icon value if the property doesn't exist (see
   * [ThemeDB.fallbackIcon]). Use [hasIcon] to check for existence.
   */
  public fun getIcon(name: StringName, themeType: StringName): Texture2D? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getIconPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Texture2D?)
  }

  /**
   * Returns `true` if the icon property defined by [name] and [themeType] exists.
   * Returns `false` if it doesn't exist. Use [setIcon] to define it.
   */
  public fun hasIcon(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasIconPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Renames the icon property defined by [oldName] and [themeType] to [name], if it exists.
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use
   * [hasIcon] to check for existence, and [clearIcon] to remove the existing property.
   */
  public fun renameIcon(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.renameIconPtr, NIL)
  }

  /**
   * Removes the icon property defined by [name] and [themeType], if it exists.
   * Fails if it doesn't exist. Use [hasIcon] to check for existence.
   */
  public fun clearIcon(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearIconPtr, NIL)
  }

  /**
   * Returns a list of names for icon properties defined with [themeType]. Use [getIconTypeList] to
   * get a list of possible theme type names.
   */
  public fun getIconList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getIconListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns a list of all unique theme type names for icon properties. Use [getTypeList] to get a
   * list of all unique theme types.
   */
  public fun getIconTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getIconTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Creates or changes the value of the [StyleBox] property defined by [name] and [themeType]. Use
   * [clearStylebox] to remove the property.
   */
  public fun setStylebox(
    name: StringName,
    themeType: StringName,
    texture: StyleBox,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, OBJECT to texture)
    TransferContext.callMethod(rawPtr, MethodBindings.setStyleboxPtr, NIL)
  }

  /**
   * Returns the [StyleBox] property defined by [name] and [themeType], if it exists.
   * Returns the engine fallback stylebox value if the property doesn't exist (see
   * [ThemeDB.fallbackStylebox]). Use [hasStylebox] to check for existence.
   */
  public fun getStylebox(name: StringName, themeType: StringName): StyleBox? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getStyleboxPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as StyleBox?)
  }

  /**
   * Returns `true` if the [StyleBox] property defined by [name] and [themeType] exists.
   * Returns `false` if it doesn't exist. Use [setStylebox] to define it.
   */
  public fun hasStylebox(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasStyleboxPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Renames the [StyleBox] property defined by [oldName] and [themeType] to [name], if it exists.
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use
   * [hasStylebox] to check for existence, and [clearStylebox] to remove the existing property.
   */
  public fun renameStylebox(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.renameStyleboxPtr, NIL)
  }

  /**
   * Removes the [StyleBox] property defined by [name] and [themeType], if it exists.
   * Fails if it doesn't exist. Use [hasStylebox] to check for existence.
   */
  public fun clearStylebox(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearStyleboxPtr, NIL)
  }

  /**
   * Returns a list of names for [StyleBox] properties defined with [themeType]. Use
   * [getStyleboxTypeList] to get a list of possible theme type names.
   */
  public fun getStyleboxList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getStyleboxListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns a list of all unique theme type names for [StyleBox] properties. Use [getTypeList] to
   * get a list of all unique theme types.
   */
  public fun getStyleboxTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getStyleboxTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Creates or changes the value of the [Font] property defined by [name] and [themeType]. Use
   * [clearFont] to remove the property.
   */
  public fun setFont(
    name: StringName,
    themeType: StringName,
    font: Font,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, OBJECT to font)
    TransferContext.callMethod(rawPtr, MethodBindings.setFontPtr, NIL)
  }

  /**
   * Returns the [Font] property defined by [name] and [themeType], if it exists.
   * Returns the default theme font if the property doesn't exist and the default theme font is set
   * up (see [defaultFont]). Use [hasFont] to check for existence of the property and [hasDefaultFont]
   * to check for existence of the default theme font.
   * Returns the engine fallback font value, if neither exist (see [ThemeDB.fallbackFont]).
   */
  public fun getFont(name: StringName, themeType: StringName): Font? {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getFontPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Font?)
  }

  /**
   * Returns `true` if the [Font] property defined by [name] and [themeType] exists, or if the
   * default theme font is set up (see [hasDefaultFont]).
   * Returns `false` if neither exist. Use [setFont] to define the property.
   */
  public fun hasFont(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasFontPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Renames the [Font] property defined by [oldName] and [themeType] to [name], if it exists.
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use
   * [hasFont] to check for existence, and [clearFont] to remove the existing property.
   */
  public fun renameFont(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.renameFontPtr, NIL)
  }

  /**
   * Removes the [Font] property defined by [name] and [themeType], if it exists.
   * Fails if it doesn't exist. Use [hasFont] to check for existence.
   */
  public fun clearFont(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearFontPtr, NIL)
  }

  /**
   * Returns a list of names for [Font] properties defined with [themeType]. Use [getFontTypeList]
   * to get a list of possible theme type names.
   */
  public fun getFontList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getFontListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns a list of all unique theme type names for [Font] properties. Use [getTypeList] to get a
   * list of all unique theme types.
   */
  public fun getFontTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Creates or changes the value of the font size property defined by [name] and [themeType]. Use
   * [clearFontSize] to remove the property.
   */
  public fun setFontSize(
    name: StringName,
    themeType: StringName,
    fontSize: Int,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, LONG to fontSize.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setFontSizePtr, NIL)
  }

  /**
   * Returns the font size property defined by [name] and [themeType], if it exists.
   * Returns the default theme font size if the property doesn't exist and the default theme font
   * size is set up (see [defaultFontSize]). Use [hasFontSize] to check for existence of the property
   * and [hasDefaultFontSize] to check for existence of the default theme font.
   * Returns the engine fallback font size value, if neither exist (see [ThemeDB.fallbackFontSize]).
   */
  public fun getFontSize(name: StringName, themeType: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getFontSizePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the font size property defined by [name] and [themeType] exists, or if the
   * default theme font size is set up (see [hasDefaultFontSize]).
   * Returns `false` if neither exist. Use [setFontSize] to define the property.
   */
  public fun hasFontSize(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasFontSizePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Renames the font size property defined by [oldName] and [themeType] to [name], if it exists.
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use
   * [hasFontSize] to check for existence, and [clearFontSize] to remove the existing property.
   */
  public fun renameFontSize(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.renameFontSizePtr, NIL)
  }

  /**
   * Removes the font size property defined by [name] and [themeType], if it exists.
   * Fails if it doesn't exist. Use [hasFontSize] to check for existence.
   */
  public fun clearFontSize(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearFontSizePtr, NIL)
  }

  /**
   * Returns a list of names for font size properties defined with [themeType]. Use
   * [getFontSizeTypeList] to get a list of possible theme type names.
   */
  public fun getFontSizeList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getFontSizeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns a list of all unique theme type names for font size properties. Use [getTypeList] to
   * get a list of all unique theme types.
   */
  public fun getFontSizeTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getFontSizeTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Creates or changes the value of the [Color] property defined by [name] and [themeType]. Use
   * [clearColor] to remove the property.
   */
  public fun setColor(
    name: StringName,
    themeType: StringName,
    color: Color,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, COLOR to color)
    TransferContext.callMethod(rawPtr, MethodBindings.setColorPtr, NIL)
  }

  /**
   * Returns the [Color] property defined by [name] and [themeType], if it exists.
   * Returns the default color value if the property doesn't exist. Use [hasColor] to check for
   * existence.
   */
  public fun getColor(name: StringName, themeType: StringName): Color {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getColorPtr, COLOR)
    return (TransferContext.readReturnValue(COLOR, false) as Color)
  }

  /**
   * Returns `true` if the [Color] property defined by [name] and [themeType] exists.
   * Returns `false` if it doesn't exist. Use [setColor] to define it.
   */
  public fun hasColor(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasColorPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Renames the [Color] property defined by [oldName] and [themeType] to [name], if it exists.
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use
   * [hasColor] to check for existence, and [clearColor] to remove the existing property.
   */
  public fun renameColor(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.renameColorPtr, NIL)
  }

  /**
   * Removes the [Color] property defined by [name] and [themeType], if it exists.
   * Fails if it doesn't exist. Use [hasColor] to check for existence.
   */
  public fun clearColor(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearColorPtr, NIL)
  }

  /**
   * Returns a list of names for [Color] properties defined with [themeType]. Use [getColorTypeList]
   * to get a list of possible theme type names.
   */
  public fun getColorList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getColorListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns a list of all unique theme type names for [Color] properties. Use [getTypeList] to get
   * a list of all unique theme types.
   */
  public fun getColorTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColorTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Creates or changes the value of the constant property defined by [name] and [themeType]. Use
   * [clearConstant] to remove the property.
   */
  public fun setConstant(
    name: StringName,
    themeType: StringName,
    constant: Int,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType, LONG to constant.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.setConstantPtr, NIL)
  }

  /**
   * Returns the constant property defined by [name] and [themeType], if it exists.
   * Returns `0` if the property doesn't exist. Use [hasConstant] to check for existence.
   */
  public fun getConstant(name: StringName, themeType: StringName): Int {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getConstantPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns `true` if the constant property defined by [name] and [themeType] exists.
   * Returns `false` if it doesn't exist. Use [setConstant] to define it.
   */
  public fun hasConstant(name: StringName, themeType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasConstantPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Renames the constant property defined by [oldName] and [themeType] to [name], if it exists.
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use
   * [hasConstant] to check for existence, and [clearConstant] to remove the existing property.
   */
  public fun renameConstant(
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.renameConstantPtr, NIL)
  }

  /**
   * Removes the constant property defined by [name] and [themeType], if it exists.
   * Fails if it doesn't exist. Use [hasConstant] to check for existence.
   */
  public fun clearConstant(name: StringName, themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearConstantPtr, NIL)
  }

  /**
   * Returns a list of names for constant properties defined with [themeType]. Use
   * [getConstantTypeList] to get a list of possible theme type names.
   */
  public fun getConstantList(themeType: String): PackedStringArray {
    TransferContext.writeArguments(STRING to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getConstantListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns a list of all unique theme type names for constant properties. Use [getTypeList] to get
   * a list of all unique theme types.
   */
  public fun getConstantTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getConstantTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns `true` if [defaultBaseScale] has a valid value.
   * Returns `false` if it doesn't. The value must be greater than `0.0` to be considered valid.
   */
  public fun hasDefaultBaseScale(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasDefaultBaseScalePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if [defaultFont] has a valid value.
   * Returns `false` if it doesn't.
   */
  public fun hasDefaultFont(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasDefaultFontPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if [defaultFontSize] has a valid value.
   * Returns `false` if it doesn't. The value must be greater than `0` to be considered valid.
   */
  public fun hasDefaultFontSize(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasDefaultFontSizePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Creates or changes the value of the theme property of [dataType] defined by [name] and
   * [themeType]. Use [clearThemeItem] to remove the property.
   * Fails if the [value] type is not accepted by [dataType].
   * **Note:** This method is analogous to calling the corresponding data type specific method, but
   * can be used for more generalized logic.
   */
  public fun setThemeItem(
    dataType: DataType,
    name: StringName,
    themeType: StringName,
    `value`: Any?,
  ): Unit {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType, ANY to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setThemeItemPtr, NIL)
  }

  /**
   * Returns the theme property of [dataType] defined by [name] and [themeType], if it exists.
   * Returns the engine fallback value if the property doesn't exist (see [ThemeDB]). Use
   * [hasThemeItem] to check for existence.
   * **Note:** This method is analogous to calling the corresponding data type specific method, but
   * can be used for more generalized logic.
   */
  public fun getThemeItem(
    dataType: DataType,
    name: StringName,
    themeType: StringName,
  ): Any? {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeItemPtr, ANY)
    return (TransferContext.readReturnValue(ANY, true) as Any?)
  }

  /**
   * Returns `true` if the theme property of [dataType] defined by [name] and [themeType] exists.
   * Returns `false` if it doesn't exist. Use [setThemeItem] to define it.
   * **Note:** This method is analogous to calling the corresponding data type specific method, but
   * can be used for more generalized logic.
   */
  public fun hasThemeItem(
    dataType: DataType,
    name: StringName,
    themeType: StringName,
  ): Boolean {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.hasThemeItemPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Renames the theme property of [dataType] defined by [oldName] and [themeType] to [name], if it
   * exists.
   * Fails if it doesn't exist, or if a similar property with the new name already exists. Use
   * [hasThemeItem] to check for existence, and [clearThemeItem] to remove the existing property.
   * **Note:** This method is analogous to calling the corresponding data type specific method, but
   * can be used for more generalized logic.
   */
  public fun renameThemeItem(
    dataType: DataType,
    oldName: StringName,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to oldName, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.renameThemeItemPtr, NIL)
  }

  /**
   * Removes the theme property of [dataType] defined by [name] and [themeType], if it exists.
   * Fails if it doesn't exist. Use [hasThemeItem] to check for existence.
   * **Note:** This method is analogous to calling the corresponding data type specific method, but
   * can be used for more generalized logic.
   */
  public fun clearThemeItem(
    dataType: DataType,
    name: StringName,
    themeType: StringName,
  ): Unit {
    TransferContext.writeArguments(LONG to dataType.id, STRING_NAME to name, STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearThemeItemPtr, NIL)
  }

  /**
   * Returns a list of names for properties of [dataType] defined with [themeType]. Use
   * [getThemeItemTypeList] to get a list of possible theme type names.
   * **Note:** This method is analogous to calling the corresponding data type specific method, but
   * can be used for more generalized logic.
   */
  public fun getThemeItemList(dataType: DataType, themeType: String): PackedStringArray {
    TransferContext.writeArguments(LONG to dataType.id, STRING to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeItemListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Returns a list of all unique theme type names for [dataType] properties. Use [getTypeList] to
   * get a list of all unique theme types.
   * **Note:** This method is analogous to calling the corresponding data type specific method, but
   * can be used for more generalized logic.
   */
  public fun getThemeItemTypeList(dataType: DataType): PackedStringArray {
    TransferContext.writeArguments(LONG to dataType.id)
    TransferContext.callMethod(rawPtr, MethodBindings.getThemeItemTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Marks [themeType] as a variation of [baseType].
   * This adds [themeType] as a suggested option for [Control.themeTypeVariation] on a [Control]
   * that is of the [baseType] class.
   * Variations can also be nested, i.e. [baseType] can be another variation. If a chain of
   * variations ends with a [baseType] matching the class of the [Control], the whole chain is going to
   * be suggested as options.
   * **Note:** Suggestions only show up if this theme resource is set as the project default theme.
   * See [ProjectSettings.gui/theme/custom].
   */
  public fun setTypeVariation(themeType: StringName, baseType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to themeType, STRING_NAME to baseType)
    TransferContext.callMethod(rawPtr, MethodBindings.setTypeVariationPtr, NIL)
  }

  /**
   * Returns `true` if [themeType] is marked as a variation of [baseType].
   */
  public fun isTypeVariation(themeType: StringName, baseType: StringName): Boolean {
    TransferContext.writeArguments(STRING_NAME to themeType, STRING_NAME to baseType)
    TransferContext.callMethod(rawPtr, MethodBindings.isTypeVariationPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Unmarks [themeType] as being a variation of another theme type. See [setTypeVariation].
   */
  public fun clearTypeVariation(themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.clearTypeVariationPtr, NIL)
  }

  /**
   * Returns the name of the base theme type if [themeType] is a valid variation type. Returns an
   * empty string otherwise.
   */
  public fun getTypeVariationBase(themeType: StringName): StringName {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.getTypeVariationBasePtr, STRING_NAME)
    return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
  }

  /**
   * Returns a list of all type variations for the given [baseType].
   */
  public fun getTypeVariationList(baseType: StringName): PackedStringArray {
    TransferContext.writeArguments(STRING_NAME to baseType)
    TransferContext.callMethod(rawPtr, MethodBindings.getTypeVariationListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Adds an empty theme type for every valid data type.
   * **Note:** Empty types are not saved with the theme. This method only exists to perform
   * in-memory changes to the resource. Use available `set_*` methods to add theme items.
   */
  public fun addType(themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.addTypePtr, NIL)
  }

  /**
   * Removes the theme type, gracefully discarding defined theme items. If the type is a variation,
   * this information is also erased. If the type is a base for type variations, those variations lose
   * their base.
   */
  public fun removeType(themeType: StringName): Unit {
    TransferContext.writeArguments(STRING_NAME to themeType)
    TransferContext.callMethod(rawPtr, MethodBindings.removeTypePtr, NIL)
  }

  /**
   * Returns a list of all unique theme type names. Use the appropriate `get_*_type_list` method to
   * get a list of unique theme types for a single data type.
   */
  public fun getTypeList(): PackedStringArray {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTypeListPtr, PACKED_STRING_ARRAY)
    return (TransferContext.readReturnValue(PACKED_STRING_ARRAY, false) as PackedStringArray)
  }

  /**
   * Adds missing and overrides existing definitions with values from the [other] theme resource.
   * **Note:** This modifies the current theme. If you want to merge two themes together without
   * modifying either one, create a new empty theme and merge the other two into it one after another.
   */
  public fun mergeWith(other: Theme): Unit {
    TransferContext.writeArguments(OBJECT to other)
    TransferContext.callMethod(rawPtr, MethodBindings.mergeWithPtr, NIL)
  }

  /**
   * Removes all the theme properties defined on the theme resource.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  public enum class DataType(
    id: Long,
  ) {
    /**
     * Theme's [Color] item type.
     */
    DATA_TYPE_COLOR(0),
    /**
     * Theme's constant item type.
     */
    DATA_TYPE_CONSTANT(1),
    /**
     * Theme's [Font] item type.
     */
    DATA_TYPE_FONT(2),
    /**
     * Theme's font size item type.
     */
    DATA_TYPE_FONT_SIZE(3),
    /**
     * Theme's icon [Texture2D] item type.
     */
    DATA_TYPE_ICON(4),
    /**
     * Theme's [StyleBox] item type.
     */
    DATA_TYPE_STYLEBOX(5),
    /**
     * Maximum value for the DataType enum.
     */
    DATA_TYPE_MAX(6),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): DataType = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_icon")

    public val getIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_icon")

    public val hasIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_icon")

    public val renameIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "rename_icon")

    public val clearIconPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "clear_icon")

    public val getIconListPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_icon_list")

    public val getIconTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_icon_type_list")

    public val setStyleboxPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_stylebox")

    public val getStyleboxPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_stylebox")

    public val hasStyleboxPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_stylebox")

    public val renameStyleboxPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "rename_stylebox")

    public val clearStyleboxPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "clear_stylebox")

    public val getStyleboxListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_stylebox_list")

    public val getStyleboxTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_stylebox_type_list")

    public val setFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_font")

    public val getFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_font")

    public val hasFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_font")

    public val renameFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "rename_font")

    public val clearFontPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "clear_font")

    public val getFontListPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_font_list")

    public val getFontTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_font_type_list")

    public val setFontSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_font_size")

    public val getFontSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_font_size")

    public val hasFontSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_font_size")

    public val renameFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "rename_font_size")

    public val clearFontSizePtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "clear_font_size")

    public val getFontSizeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_font_size_list")

    public val getFontSizeTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_font_size_type_list")

    public val setColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_color")

    public val getColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_color")

    public val hasColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_color")

    public val renameColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "rename_color")

    public val clearColorPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "clear_color")

    public val getColorListPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_color_list")

    public val getColorTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_color_type_list")

    public val setConstantPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_constant")

    public val getConstantPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_constant")

    public val hasConstantPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_constant")

    public val renameConstantPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "rename_constant")

    public val clearConstantPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "clear_constant")

    public val getConstantListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_constant_list")

    public val getConstantTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_constant_type_list")

    public val setDefaultBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_default_base_scale")

    public val getDefaultBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_default_base_scale")

    public val hasDefaultBaseScalePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "has_default_base_scale")

    public val setDefaultFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_default_font")

    public val getDefaultFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_default_font")

    public val hasDefaultFontPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "has_default_font")

    public val setDefaultFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_default_font_size")

    public val getDefaultFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_default_font_size")

    public val hasDefaultFontSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "has_default_font_size")

    public val setThemeItemPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "set_theme_item")

    public val getThemeItemPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_theme_item")

    public val hasThemeItemPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "has_theme_item")

    public val renameThemeItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "rename_theme_item")

    public val clearThemeItemPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "clear_theme_item")

    public val getThemeItemListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_theme_item_list")

    public val getThemeItemTypeListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_theme_item_type_list")

    public val setTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "set_type_variation")

    public val isTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "is_type_variation")

    public val clearTypeVariationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "clear_type_variation")

    public val getTypeVariationBasePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_type_variation_base")

    public val getTypeVariationListPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Theme", "get_type_variation_list")

    public val addTypePtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "add_type")

    public val removeTypePtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "remove_type")

    public val getTypeListPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "get_type_list")

    public val mergeWithPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "merge_with")

    public val clearPtr: VoidPtr = TypeManager.getMethodBindPtr("Theme", "clear")
  }
}
