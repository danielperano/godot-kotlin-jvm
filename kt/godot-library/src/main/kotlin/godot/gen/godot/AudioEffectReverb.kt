// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Simulates the sound of acoustic environments such as rooms, concert halls, caverns, or an open
 * spaces.
 */
@GodotBaseType
public open class AudioEffectReverb : AudioEffect() {
  /**
   * Time between the original signal and the early reflections of the reverb signal, in
   * milliseconds.
   */
  public var predelayMsec: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPredelayMsecPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPredelayMsecPtr, NIL)
    }

  /**
   * Output percent of predelay. Value can range from 0 to 1.
   */
  public var predelayFeedback: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPredelayFeedbackPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setPredelayFeedbackPtr, NIL)
    }

  /**
   * Dimensions of simulated room. Bigger means more echoes. Value can range from 0 to 1.
   */
  public var roomSize: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRoomSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRoomSizePtr, NIL)
    }

  /**
   * Defines how reflective the imaginary room's walls are. Value can range from 0 to 1.
   */
  public var damping: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDampingPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDampingPtr, NIL)
    }

  /**
   * Widens or narrows the stereo image of the reverb tail. 1 means fully widens. Value can range
   * from 0 to 1.
   */
  public var spread: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSpreadPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSpreadPtr, NIL)
    }

  /**
   * High-pass filter passes signals with a frequency higher than a certain cutoff frequency and
   * attenuates signals with frequencies lower than the cutoff frequency. Value can range from 0 to 1.
   */
  public var hipass: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getHpfPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setHpfPtr, NIL)
    }

  /**
   * Output percent of original sound. At 0, only modified sound is outputted. Value can range from
   * 0 to 1.
   */
  public var dry: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDryPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setDryPtr, NIL)
    }

  /**
   * Output percent of modified sound. At 0, only original sound is outputted. Value can range from
   * 0 to 1.
   */
  public var wet: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWetPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setWetPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AUDIOEFFECTREVERB, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setPredelayMsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_predelay_msec", 373806689)

    public val getPredelayMsecPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_predelay_msec", 1740695150)

    public val setPredelayFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_predelay_feedback", 373806689)

    public val getPredelayFeedbackPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_predelay_feedback", 1740695150)

    public val setRoomSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_room_size", 373806689)

    public val getRoomSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_room_size", 1740695150)

    public val setDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_damping", 373806689)

    public val getDampingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_damping", 1740695150)

    public val setSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_spread", 373806689)

    public val getSpreadPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_spread", 1740695150)

    public val setDryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_dry", 373806689)

    public val getDryPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_dry", 1740695150)

    public val setWetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_wet", 373806689)

    public val getWetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_wet", 1740695150)

    public val setHpfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "set_hpf", 373806689)

    public val getHpfPtr: VoidPtr =
        TypeManager.getMethodBindPtr("AudioEffectReverb", "get_hpf", 1740695150)
  }
}
