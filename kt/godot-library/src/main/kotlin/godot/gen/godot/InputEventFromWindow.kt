// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.LONG
import godot.core.VariantParser.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * InputEventFromWindow represents events specifically received by windows. This includes mouse
 * events, keyboard events in focused windows or touch screen actions.
 */
@GodotBaseType
public open class InputEventFromWindow internal constructor() : InputEvent() {
  /**
   * The ID of a [Window] that received this event.
   */
  public final inline var windowId: Long
    @JvmName("windowIdProperty")
    get() = getWindowId()
    @JvmName("windowIdProperty")
    set(`value`) {
      setWindowId(value)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_INPUTEVENTFROMWINDOW, scriptIndex)
  }

  public final fun setWindowId(id: Long): Unit {
    TransferContext.writeArguments(LONG to id)
    TransferContext.callMethod(rawPtr, MethodBindings.setWindowIdPtr, NIL)
  }

  public final fun getWindowId(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getWindowIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long)
  }

  public companion object

  internal object MethodBindings {
    public val setWindowIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventFromWindow", "set_window_id", 1286410249)

    public val getWindowIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("InputEventFromWindow", "get_window_id", 3905245786)
  }
}
