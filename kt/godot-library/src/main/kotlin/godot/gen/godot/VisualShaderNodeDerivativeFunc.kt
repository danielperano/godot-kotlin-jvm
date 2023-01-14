// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.VariantType.JVM_INT
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress

/**
 * Calculates a derivative within the visual shader graph.
 *
 * This node is only available in `Fragment` and `Light` visual shaders.
 */
@GodotBaseType
public open class VisualShaderNodeDerivativeFunc : VisualShaderNode() {
  /**
   * A type of operands and returned value. See [enum OpType] for options.
   */
  public var opType: OpType
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEDERIVATIVEFUNC_GET_OP_TYPE, LONG)
      return VisualShaderNodeDerivativeFunc.OpType.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEDERIVATIVEFUNC_SET_OP_TYPE, NIL)
    }

  /**
   * A derivative function type. See [enum Function] for options.
   */
  public var function: Function
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEDERIVATIVEFUNC_GET_FUNCTION, LONG)
      return VisualShaderNodeDerivativeFunc.Function.values()[TransferContext.readReturnValue(JVM_INT) as Int]
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_VISUALSHADERNODEDERIVATIVEFUNC_SET_FUNCTION, NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_VISUALSHADERNODEDERIVATIVEFUNC, scriptIndex)
    return true
  }

  public enum class OpType(
    id: Long
  ) {
    /**
     * A floating-point scalar.
     */
    OP_TYPE_SCALAR(0),
    /**
     * A 2D vector type.
     */
    OP_TYPE_VECTOR_2D(1),
    /**
     * A 3D vector type.
     */
    OP_TYPE_VECTOR_3D(2),
    /**
     * A 4D vector type.
     */
    OP_TYPE_VECTOR_4D(3),
    /**
     * Represents the size of the [enum OpType] enum.
     */
    OP_TYPE_MAX(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public enum class Function(
    id: Long
  ) {
    /**
     * Sum of absolute derivative in `x` and `y`.
     */
    FUNC_SUM(0),
    /**
     * Derivative in `x` using local differencing.
     */
    FUNC_X(1),
    /**
     * Derivative in `y` using local differencing.
     */
    FUNC_Y(2),
    /**
     * Represents the size of the [enum Function] enum.
     */
    FUNC_MAX(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long) = values().single { it.id == `value` }
    }
  }

  public companion object
}