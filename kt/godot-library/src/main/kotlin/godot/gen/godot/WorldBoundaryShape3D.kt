// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Plane
import godot.core.VariantType.NIL
import godot.core.VariantType.PLANE
import godot.core.memory.TransferContext
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * A 3D world boundary (half-space) shape used for physics collision.
 *
 * A 3D world boundary shape, intended for use in physics. [godot.WorldBoundaryShape3D] works like an infinite plane that forces all physics bodies to stay above it. The [plane]'s normal determines which direction is considered as "above" and in the editor, the line over the plane represents this direction. It can for example be used for endless flat floors.
 */
@GodotBaseType
public open class WorldBoundaryShape3D : Shape3D() {
  /**
   * The [godot.core.Plane] used by the [godot.WorldBoundaryShape3D] for collision.
   */
  @CoreTypeLocalCopy
  public var plane: Plane
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLDBOUNDARYSHAPE3D_GET_PLANE,
          PLANE)
      return (TransferContext.readReturnValue(PLANE, false) as Plane)
    }
    set(`value`) {
      TransferContext.writeArguments(PLANE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_WORLDBOUNDARYSHAPE3D_SET_PLANE,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WORLDBOUNDARYSHAPE3D, scriptIndex)
    return true
  }

  /**
   * The [godot.core.Plane] used by the [godot.WorldBoundaryShape3D] for collision.
   *
   * This is a helper function to make dealing with local copies easier. 
   *
   * For more information, see our
   * [documentation](https://godot-kotl.in/en/stable/user-guide/api-differences/#core-types).
   *
   * Allow to directly modify the local copy of the property and assign it back to the Object.
   *
   * Prefer that over writing:
   * ``````
   * val myCoreType = worldboundaryshape3d.plane
   * //Your changes
   * worldboundaryshape3d.plane = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun planeMutate(block: Plane.() -> Unit): Plane = plane.apply{
      block(this)
      plane = this
  }


  public companion object
}
