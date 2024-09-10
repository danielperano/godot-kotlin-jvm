// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.Color
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.COLOR
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * A raycast represents a ray from its origin to its [targetPosition] that finds the closest
 * [CollisionObject3D] along its path, if it intersects any.
 * [RayCast3D] can ignore some objects by adding them to an exception list, by making its detection
 * reporting ignore [Area3D]s ([collideWithAreas]) or [PhysicsBody3D]s ([collideWithBodies]), or by
 * configuring physics layers.
 * [RayCast3D] calculates intersection every physics frame, and it holds the result until the next
 * physics frame. For an immediate raycast, or if you want to configure a [RayCast3D] multiple times
 * within the same physics frame, use [forceRaycastUpdate].
 * To sweep over a region of 3D space, you can approximate the region with multiple [RayCast3D]s or
 * use [ShapeCast3D].
 */
@GodotBaseType
public open class RayCast3D : Node3D() {
  /**
   * If `true`, collisions will be reported.
   */
  public var enabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setEnabledPtr, NIL)
    }

  /**
   * If `true`, collisions will be ignored for this RayCast3D's immediate parent.
   */
  public var excludeParent: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getExcludeParentBodyPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setExcludeParentBodyPtr, NIL)
    }

  /**
   * The ray's destination point, relative to the RayCast's `position`.
   */
  @CoreTypeLocalCopy
  public var targetPosition: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetPositionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetPositionPtr, NIL)
    }

  /**
   * The ray's collision mask. Only objects in at least one collision layer enabled in the mask will
   * be detected. See
   * [url=$DOCS_URL/tutorials/physics/physics_introduction.html#collision-layers-and-masks]Collision
   * layers and masks[/url] in the documentation for more information.
   */
  public var collisionMask: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskPtr, NIL)
    }

  /**
   * If `true`, the ray will detect a hit when starting inside shapes. In this case the collision
   * normal will be `Vector3(0, 0, 0)`. Does not affect shapes with no volume like concave polygon or
   * heightmap.
   */
  public var hitFromInside: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHitFromInsideEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHitFromInsidePtr, NIL)
    }

  /**
   * If `true`, the ray will hit back faces with concave polygon shapes with back face enabled or
   * heightmap shapes.
   */
  public var hitBackFaces: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isHitBackFacesEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setHitBackFacesPtr, NIL)
    }

  /**
   * If `true`, collisions with [Area3D]s will be reported.
   */
  public var collideWithAreas: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollideWithAreasEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollideWithAreasPtr, NIL)
    }

  /**
   * If `true`, collisions with [PhysicsBody3D]s will be reported.
   */
  public var collideWithBodies: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isCollideWithBodiesEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCollideWithBodiesPtr, NIL)
    }

  /**
   * The custom color to use to draw the shape in the editor and at run-time if **Visible Collision
   * Shapes** is enabled in the **Debug** menu. This color will be highlighted at run-time if the
   * [RayCast3D] is colliding with something.
   * If set to `Color(0.0, 0.0, 0.0)` (by default), the color set in
   * [ProjectSettings.debug/shapes/collision/shapeColor] is used.
   */
  @CoreTypeLocalCopy
  public var debugShapeCustomColor: Color
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDebugShapeCustomColorPtr, COLOR)
      return (TransferContext.readReturnValue(COLOR, false) as Color)
    }
    set(`value`) {
      TransferContext.writeArguments(COLOR to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugShapeCustomColorPtr, NIL)
    }

  /**
   * If set to `1`, a line is used as the debug shape. Otherwise, a truncated pyramid is drawn to
   * represent the [RayCast3D]. Requires **Visible Collision Shapes** to be enabled in the **Debug**
   * menu for the debug shape to be visible at run-time.
   */
  public var debugShapeThickness: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getDebugShapeThicknessPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setDebugShapeThicknessPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RAYCAST3D, scriptIndex)
  }

  /**
   * The ray's destination point, relative to the RayCast's `position`.
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
   * val myCoreType = raycast3d.targetPosition
   * //Your changes
   * raycast3d.targetPosition = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun targetPositionMutate(block: Vector3.() -> Unit): Vector3 = targetPosition.apply{
      block(this)
      targetPosition = this
  }


  /**
   * The custom color to use to draw the shape in the editor and at run-time if **Visible Collision
   * Shapes** is enabled in the **Debug** menu. This color will be highlighted at run-time if the
   * [RayCast3D] is colliding with something.
   * If set to `Color(0.0, 0.0, 0.0)` (by default), the color set in
   * [ProjectSettings.debug/shapes/collision/shapeColor] is used.
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
   * val myCoreType = raycast3d.debugShapeCustomColor
   * //Your changes
   * raycast3d.debugShapeCustomColor = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun debugShapeCustomColorMutate(block: Color.() -> Unit): Color =
      debugShapeCustomColor.apply{
      block(this)
      debugShapeCustomColor = this
  }


  /**
   * Returns whether any object is intersecting with the ray's vector (considering the vector
   * length).
   */
  public fun isColliding(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isCollidingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Updates the collision information for the ray immediately, without waiting for the next
   * `_physics_process` call. Use this method, for example, when the ray or its parent has changed
   * state.
   * **Note:** [enabled] does not need to be `true` for this to work.
   */
  public fun forceRaycastUpdate(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.forceRaycastUpdatePtr, NIL)
  }

  /**
   * Returns the first object that the ray intersects, or `null` if no object is intersecting the
   * ray (i.e. [isColliding] returns `false`).
   */
  public fun getCollider(): Object? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Object?)
  }

  /**
   * Returns the [RID] of the first object that the ray intersects, or an empty [RID] if no object
   * is intersecting the ray (i.e. [isColliding] returns `false`).
   */
  public fun getColliderRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Returns the shape ID of the first object that the ray intersects, or `0` if no object is
   * intersecting the ray (i.e. [isColliding] returns `false`).
   * To get the intersected shape node, for a [CollisionObject3D] target, use:
   *
   * gdscript:
   * ```gdscript
   * var target = get_collider() # A CollisionObject3D.
   * var shape_id = get_collider_shape() # The shape index in the collider.
   * var owner_id = target.shape_find_owner(shape_id) # The owner ID in the collider.
   * var shape = target.shape_owner_get_owner(owner_id)
   * ```
   * csharp:
   * ```csharp
   * var target = (CollisionObject3D)GetCollider(); // A CollisionObject3D.
   * var shapeId = GetColliderShape(); // The shape index in the collider.
   * var ownerId = target.ShapeFindOwner(shapeId); // The owner ID in the collider.
   * var shape = target.ShapeOwnerGetOwner(ownerId);
   * ```
   */
  public fun getColliderShape(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getColliderShapePtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the collision point at which the ray intersects the closest object, in the global
   * coordinate system. If [hitFromInside] is `true` and the ray starts inside of a collision shape,
   * this function will return the origin point of the ray.
   * **Note:** Check that [isColliding] returns `true` before calling this method to ensure the
   * returned point is valid and up-to-date.
   */
  public fun getCollisionPoint(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionPointPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the normal of the intersecting object's shape at the collision point, or `Vector3(0, 0,
   * 0)` if the ray starts inside the shape and [hitFromInside] is `true`.
   * **Note:** Check that [isColliding] returns `true` before calling this method to ensure the
   * returned normal is valid and up-to-date.
   */
  public fun getCollisionNormal(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionNormalPtr, VECTOR3)
    return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
  }

  /**
   * Returns the collision object's face index at the collision point, or `-1` if the shape
   * intersecting the ray is not a [ConcavePolygonShape3D].
   */
  public fun getCollisionFaceIndex(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionFaceIndexPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Adds a collision exception so the ray does not report collisions with the specified [RID].
   */
  public fun addExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.addExceptionRidPtr, NIL)
  }

  /**
   * Adds a collision exception so the ray does not report collisions with the specified
   * [CollisionObject3D] node.
   */
  public fun addException(node: CollisionObject3D): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.addExceptionPtr, NIL)
  }

  /**
   * Removes a collision exception so the ray does report collisions with the specified [RID].
   */
  public fun removeExceptionRid(rid: RID): Unit {
    TransferContext.writeArguments(_RID to rid)
    TransferContext.callMethod(rawPtr, MethodBindings.removeExceptionRidPtr, NIL)
  }

  /**
   * Removes a collision exception so the ray does report collisions with the specified
   * [CollisionObject3D] node.
   */
  public fun removeException(node: CollisionObject3D): Unit {
    TransferContext.writeArguments(OBJECT to node)
    TransferContext.callMethod(rawPtr, MethodBindings.removeExceptionPtr, NIL)
  }

  /**
   * Removes all collision exceptions for this ray.
   */
  public fun clearExceptions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearExceptionsPtr, NIL)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [collisionMask], given a
   * [layerNumber] between 1 and 32.
   */
  public fun setCollisionMaskValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setCollisionMaskValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [collisionMask] is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public fun getCollisionMaskValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getCollisionMaskValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_enabled", 2586408642)

    public val isEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "is_enabled", 36873697)

    public val setTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_target_position", 3460891852)

    public val getTargetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_target_position", 3360562783)

    public val isCollidingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "is_colliding", 36873697)

    public val forceRaycastUpdatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "force_raycast_update", 3218959716)

    public val getColliderPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_collider", 1981248198)

    public val getColliderRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_collider_rid", 2944877500)

    public val getColliderShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_collider_shape", 3905245786)

    public val getCollisionPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_collision_point", 3360562783)

    public val getCollisionNormalPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_collision_normal", 3360562783)

    public val getCollisionFaceIndexPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_collision_face_index", 3905245786)

    public val addExceptionRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "add_exception_rid", 2722037293)

    public val addExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "add_exception", 1976431078)

    public val removeExceptionRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "remove_exception_rid", 2722037293)

    public val removeExceptionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "remove_exception", 1976431078)

    public val clearExceptionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "clear_exceptions", 3218959716)

    public val setCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_collision_mask", 1286410249)

    public val getCollisionMaskPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_collision_mask", 3905245786)

    public val setCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_collision_mask_value", 300928843)

    public val getCollisionMaskValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_collision_mask_value", 1116898809)

    public val setExcludeParentBodyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_exclude_parent_body", 2586408642)

    public val getExcludeParentBodyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_exclude_parent_body", 36873697)

    public val setCollideWithAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_collide_with_areas", 2586408642)

    public val isCollideWithAreasEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "is_collide_with_areas_enabled", 36873697)

    public val setCollideWithBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_collide_with_bodies", 2586408642)

    public val isCollideWithBodiesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "is_collide_with_bodies_enabled", 36873697)

    public val setHitFromInsidePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_hit_from_inside", 2586408642)

    public val isHitFromInsideEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "is_hit_from_inside_enabled", 36873697)

    public val setHitBackFacesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_hit_back_faces", 2586408642)

    public val isHitBackFacesEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "is_hit_back_faces_enabled", 36873697)

    public val setDebugShapeCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_debug_shape_custom_color", 2920490490)

    public val getDebugShapeCustomColorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_debug_shape_custom_color", 3444240500)

    public val setDebugShapeThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "set_debug_shape_thickness", 1286410249)

    public val getDebugShapeThicknessPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RayCast3D", "get_debug_shape_thickness", 3905245786)
  }
}
