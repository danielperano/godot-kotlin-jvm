// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * An input event for keys on a keyboard. Supports key presses, key releases and [echo] events. It
 * can also be received in [Node.UnhandledKeyInput].
 * **Note:** Events received from the keyboard usually have all properties set. Event mappings
 * should have only one of the [keycode], [physicalKeycode] or [unicode] set.
 * When events are compared, properties are checked in the following priority - [keycode],
 * [physicalKeycode] and [unicode]. Events with the first matching value will be considered equal.
 */
@GodotBaseType
public open class InputEventKey : InputEventWithModifiers() {
  /**
   * If `true`, the key's state is pressed. If `false`, the key's state is released.
   */
  public var pressed: Boolean
    @JvmName("isPressed_prop")
    get() = super.isPressed()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setPressedPtr, NIL)
    }

  /**
   * Latin label printed on the key in the current keyboard layout, which corresponds to one of the
   * [Key] constants.
   * To get a human-readable representation of the [InputEventKey], use
   * `OS.get_keycode_string(event.keycode)` where `event` is the [InputEventKey].
   * [codeblock lang=text]
   *     +-----+ +-----+
   *     | Q   | | Q   | - "Q" - keycode
   *     |   Й | |  ض | - "Й" and "ض" - key_label
   *     +-----+ +-----+
   * [/codeblock]
   */
  public var keycode: Key
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getKeycodePtr, LONG)
      return Key.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setKeycodePtr, NIL)
    }

  /**
   * Represents the physical location of a key on the 101/102-key US QWERTY keyboard, which
   * corresponds to one of the [Key] constants.
   * To get a human-readable representation of the [InputEventKey], use [OS.getKeycodeString] in
   * combination with [DisplayServer.keyboardGetKeycodeFromPhysical]:
   *
   * gdscript:
   * ```gdscript
   * func _input(event):
   *     if event is InputEventKey:
   *         var keycode = DisplayServer.keyboard_get_keycode_from_physical(event.physical_keycode)
   *         print(OS.get_keycode_string(keycode))
   * ```
   * csharp:
   * ```csharp
   * public override void _Input(InputEvent @event)
   * {
   *     if (@event is InputEventKey inputEventKey)
   *     {
   *         var keycode =
   * DisplayServer.KeyboardGetKeycodeFromPhysical(inputEventKey.PhysicalKeycode);
   *         GD.Print(OS.GetKeycodeString(keycode));
   *     }
   * }
   * ```
   */
  public var physicalKeycode: Key
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPhysicalKeycodePtr, LONG)
      return Key.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setPhysicalKeycodePtr, NIL)
    }

  /**
   * Represents the localized label printed on the key in the current keyboard layout, which
   * corresponds to one of the [Key] constants or any valid Unicode character.
   * For keyboard layouts with a single label on the key, it is equivalent to [keycode].
   * To get a human-readable representation of the [InputEventKey], use
   * `OS.get_keycode_string(event.key_label)` where `event` is the [InputEventKey].
   * [codeblock lang=text]
   *     +-----+ +-----+
   *     | Q   | | Q   | - "Q" - keycode
   *     |   Й | |  ض | - "Й" and "ض" - key_label
   *     +-----+ +-----+
   * [/codeblock]
   */
  public var keyLabel: Key
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getKeyLabelPtr, LONG)
      return Key.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setKeyLabelPtr, NIL)
    }

  /**
   * The key Unicode character code (when relevant), shifted by modifier keys. Unicode character
   * codes for composite characters and complex scripts may not be available unless IME input mode is
   * active. See [Window.setImeActive] for more information.
   */
  public var unicode: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUnicodePtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUnicodePtr, NIL)
    }

  /**
   * Represents the location of a key which has both left and right versions, such as
   * [kbd]Shift[/kbd] or [kbd]Alt[/kbd].
   */
  public var location: KeyLocation
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLocationPtr, LONG)
      return KeyLocation.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLocationPtr, NIL)
    }

  /**
   * If `true`, the key was already pressed before this event. An echo event is a repeated key event
   * sent when the user is holding down the key.
   * **Note:** The rate at which echo events are sent is typically around 20 events per second
   * (after holding down the key for roughly half a second). However, the key repeat delay/speed can be
   * changed by the user or disabled entirely in the operating system settings. To ensure your project
   * works correctly on all configurations, do not assume the user has a specific key repeat
   * configuration in your project's behavior.
   */
  public var echo: Boolean
    @JvmName("isEcho_prop")
    get() = super.isEcho()
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEchoPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTKEY, scriptIndex)
  }

  /**
   * Returns the Latin keycode combined with modifier keys such as [kbd]Shift[/kbd] or
   * [kbd]Alt[/kbd]. See also [InputEventWithModifiers].
   * To get a human-readable representation of the [InputEventKey] with modifiers, use
   * `OS.get_keycode_string(event.get_keycode_with_modifiers())` where `event` is the [InputEventKey].
   */
  public fun getKeycodeWithModifiers(): Key {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getKeycodeWithModifiersPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the physical keycode combined with modifier keys such as [kbd]Shift[/kbd] or
   * [kbd]Alt[/kbd]. See also [InputEventWithModifiers].
   * To get a human-readable representation of the [InputEventKey] with modifiers, use
   * `OS.get_keycode_string(event.get_physical_keycode_with_modifiers())` where `event` is the
   * [InputEventKey].
   */
  public fun getPhysicalKeycodeWithModifiers(): Key {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getPhysicalKeycodeWithModifiersPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the localized key label combined with modifier keys such as [kbd]Shift[/kbd] or
   * [kbd]Alt[/kbd]. See also [InputEventWithModifiers].
   * To get a human-readable representation of the [InputEventKey] with modifiers, use
   * `OS.get_keycode_string(event.get_key_label_with_modifiers())` where `event` is the
   * [InputEventKey].
   */
  public fun getKeyLabelWithModifiers(): Key {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getKeyLabelWithModifiersPtr, LONG)
    return Key.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns a [String] representation of the event's [keycode] and modifiers.
   */
  public fun asTextKeycode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.asTextKeycodePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a [String] representation of the event's [physicalKeycode] and modifiers.
   */
  public fun asTextPhysicalKeycode(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.asTextPhysicalKeycodePtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a [String] representation of the event's [keyLabel] and modifiers.
   */
  public fun asTextKeyLabel(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.asTextKeyLabelPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  /**
   * Returns a [String] representation of the event's [location]. This will be a blank string if the
   * event is not specific to a location.
   */
  public fun asTextLocation(): String {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.asTextLocationPtr, STRING)
    return (TransferContext.readReturnValue(STRING, false) as String)
  }

  public companion object

  internal object MethodBindings {
    public val setPressedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "set_pressed", 2586408642)

    public val setKeycodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "set_keycode", 888074362)

    public val getKeycodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "get_keycode", 1585896689)

    public val setPhysicalKeycodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "set_physical_keycode", 888074362)

    public val getPhysicalKeycodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "get_physical_keycode", 1585896689)

    public val setKeyLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "set_key_label", 888074362)

    public val getKeyLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "get_key_label", 1585896689)

    public val setUnicodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "set_unicode", 1286410249)

    public val getUnicodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "get_unicode", 3905245786)

    public val setLocationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "set_location", 634453155)

    public val getLocationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "get_location", 211810873)

    public val setEchoPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "set_echo", 2586408642)

    public val getKeycodeWithModifiersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "get_keycode_with_modifiers", 1585896689)

    public val getPhysicalKeycodeWithModifiersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "get_physical_keycode_with_modifiers", 1585896689)

    public val getKeyLabelWithModifiersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "get_key_label_with_modifiers", 1585896689)

    public val asTextKeycodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "as_text_keycode", 201670096)

    public val asTextPhysicalKeycodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "as_text_physical_keycode", 201670096)

    public val asTextKeyLabelPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "as_text_key_label", 201670096)

    public val asTextLocationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventKey", "as_text_location", 201670096)
  }
}
