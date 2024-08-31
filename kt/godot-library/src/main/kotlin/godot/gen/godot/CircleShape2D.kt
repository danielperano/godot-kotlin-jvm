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
 * A 2D circle shape, intended for use in physics. Usually used to provide a shape for a
 * [CollisionShape2D].
 * **Performance:** [CircleShape2D] is fast to check collisions against. It is faster than
 * [RectangleShape2D] and [CapsuleShape2D].
 */
@GodotBaseType
public open class CircleShape2D : Shape2D() {
  /**
   * The circle's radius.
   */
  public var radius: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRadiusPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setRadiusPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CIRCLESHAPE2D, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("CircleShape2D", "set_radius")

    public val getRadiusPtr: VoidPtr = TypeManager.getMethodBindPtr("CircleShape2D", "get_radius")
  }
}
