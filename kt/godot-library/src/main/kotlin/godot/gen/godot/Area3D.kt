// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.NodePath
import godot.core.RID
import godot.core.StringName
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal1
import godot.signals.Signal4
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * [Area3D] is a region of 3D space defined by one or multiple [CollisionShape3D] or
 * [CollisionPolygon3D] child nodes. It detects when other [CollisionObject3D]s enter or exit it, and
 * it also keeps track of which collision objects haven't exited it yet (i.e. which one are overlapping
 * it).
 * This node can also locally alter or override physics parameters (gravity, damping) and route
 * audio to custom audio buses.
 * **Note:** Areas and bodies created with [PhysicsServer3D] might not interact as expected with
 * [Area3D]s, and might not emit signals or track objects correctly.
 * **Warning:** Using a [ConcavePolygonShape3D] inside a [CollisionShape3D] child of this node
 * (created e.g. by using the **Create Trimesh Collision Sibling** option in the **Mesh** menu that
 * appears when selecting a [MeshInstance3D] node) may give unexpected results, since this collision
 * shape is hollow. If this is not desired, it has to be split into multiple [ConvexPolygonShape3D]s or
 * primitive shapes like [BoxShape3D], or in some cases it may be replaceable by a
 * [CollisionPolygon3D].
 */
@GodotBaseType
public open class Area3D : CollisionObject3D() {
  /**
   * Emitted when a [Shape3D] of the received [body] enters a shape of this area. [body] can be a
   * [PhysicsBody3D] or a [GridMap]. [GridMap]s are detected if their [MeshLibrary] has collision
   * shapes configured. Requires [monitoring] to be set to `true`.
   * [localShapeIndex] and [bodyShapeIndex] contain indices of the interacting shapes from this area
   * and the interacting body, respectively. [bodyRid] contains the [RID] of the body. These values can
   * be used with the [PhysicsServer3D].
   * **Example of getting the** [CollisionShape3D] **node from the shape index:**
   *
   * gdscript:
   * ```gdscript
   * var body_shape_owner = body.shape_find_owner(body_shape_index)
   * var body_shape_node = body.shape_owner_get_owner(body_shape_owner)
   *
   * var local_shape_owner = shape_find_owner(local_shape_index)
   * var local_shape_node = shape_owner_get_owner(local_shape_owner)
   * ```
   */
  public val bodyShapeEntered: Signal4<RID, Node3D, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  /**
   * Emitted when a [Shape3D] of the received [body] exits a shape of this area. [body] can be a
   * [PhysicsBody3D] or a [GridMap]. [GridMap]s are detected if their [MeshLibrary] has collision
   * shapes configured. Requires [monitoring] to be set to `true`.
   * See also [signal body_shape_entered].
   */
  public val bodyShapeExited: Signal4<RID, Node3D, Long, Long> by signal("bodyRid", "body",
      "bodyShapeIndex", "localShapeIndex")

  /**
   * Emitted when the received [body] enters this area. [body] can be a [PhysicsBody3D] or a
   * [GridMap]. [GridMap]s are detected if their [MeshLibrary] has collision shapes configured.
   * Requires [monitoring] to be set to `true`.
   */
  public val bodyEntered: Signal1<Node3D> by signal("body")

  /**
   * Emitted when the received [body] exits this area. [body] can be a [PhysicsBody3D] or a
   * [GridMap]. [GridMap]s are detected if their [MeshLibrary] has collision shapes configured.
   * Requires [monitoring] to be set to `true`.
   */
  public val bodyExited: Signal1<Node3D> by signal("body")

  /**
   * Emitted when a [Shape3D] of the received [area] enters a shape of this area. Requires
   * [monitoring] to be set to `true`.
   * [localShapeIndex] and [areaShapeIndex] contain indices of the interacting shapes from this area
   * and the other area, respectively. [areaRid] contains the [RID] of the other area. These values can
   * be used with the [PhysicsServer3D].
   * **Example of getting the** [CollisionShape3D] **node from the shape index:**
   *
   * gdscript:
   * ```gdscript
   * var other_shape_owner = area.shape_find_owner(area_shape_index)
   * var other_shape_node = area.shape_owner_get_owner(other_shape_owner)
   *
   * var local_shape_owner = shape_find_owner(local_shape_index)
   * var local_shape_node = shape_owner_get_owner(local_shape_owner)
   * ```
   */
  public val areaShapeEntered: Signal4<RID, Area3D, Long, Long> by signal("areaRid", "area",
      "areaShapeIndex", "localShapeIndex")

  /**
   * Emitted when a [Shape3D] of the received [area] exits a shape of this area. Requires
   * [monitoring] to be set to `true`.
   * See also [signal area_shape_entered].
   */
  public val areaShapeExited: Signal4<RID, Area3D, Long, Long> by signal("areaRid", "area",
      "areaShapeIndex", "localShapeIndex")

  /**
   * Emitted when the received [area] enters this area. Requires [monitoring] to be set to `true`.
   */
  public val areaEntered: Signal1<Area3D> by signal("area")

  /**
   * Emitted when the received [area] exits this area. Requires [monitoring] to be set to `true`.
   */
  public val areaExited: Signal1<Area3D> by signal("area")

  /**
   * If `true`, the area detects bodies or areas entering and exiting it.
   */
  public var monitoring: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMonitoringPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMonitoringPtr, NIL)
    }

  /**
   * If `true`, other monitoring areas can detect this area.
   */
  public var monitorable: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isMonitorablePtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMonitorablePtr, NIL)
    }

  /**
   * The area's priority. Higher priority areas are processed first. The [World3D]'s physics is
   * always processed last, after all areas.
   */
  public var priority: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPriorityPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPriorityPtr, NIL)
    }

  /**
   * Override mode for gravity calculations within this area. See [SpaceOverride] for possible
   * values.
   */
  public var gravitySpaceOverride: SpaceOverride
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravitySpaceOverrideModePtr, LONG)
      return Area3D.SpaceOverride.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravitySpaceOverrideModePtr, NIL)
    }

  /**
   * If `true`, gravity is calculated from a point (set via [gravityPointCenter]). See also
   * [gravitySpaceOverride].
   */
  public var gravityPoint: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isGravityAPointPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityIsPointPtr, NIL)
    }

  /**
   * The distance at which the gravity strength is equal to [gravity]. For example, on a planet 100
   * meters in radius with a surface gravity of 4.0 m/s², set the [gravity] to 4.0 and the unit
   * distance to 100.0. The gravity will have falloff according to the inverse square law, so in the
   * example, at 200 meters from the center the gravity will be 1.0 m/s² (twice the distance, 1/4th the
   * gravity), at 50 meters it will be 16.0 m/s² (half the distance, 4x the gravity), and so on.
   * The above is true only when the unit distance is a positive number. When this is set to 0.0,
   * the gravity will be constant regardless of distance.
   */
  public var gravityPointUnitDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityPointUnitDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityPointUnitDistancePtr, NIL)
    }

  /**
   * If gravity is a point (see [gravityPoint]), this will be the point of attraction.
   */
  @CoreTypeLocalCopy
  public var gravityPointCenter: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityPointCenterPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityPointCenterPtr, NIL)
    }

  /**
   * The area's gravity vector (not normalized).
   */
  @CoreTypeLocalCopy
  public var gravityDirection: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityDirectionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityDirectionPtr, NIL)
    }

  /**
   * The area's gravity intensity (in meters per second squared). This value multiplies the gravity
   * direction. This is useful to alter the force of gravity without altering its direction.
   */
  public var gravity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getGravityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setGravityPtr, NIL)
    }

  /**
   * Override mode for linear damping calculations within this area. See [SpaceOverride] for
   * possible values.
   */
  public var linearDampSpaceOverride: SpaceOverride
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearDampSpaceOverrideModePtr, LONG)
      return Area3D.SpaceOverride.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearDampSpaceOverrideModePtr, NIL)
    }

  /**
   * The rate at which objects stop moving in this area. Represents the linear velocity lost per
   * second.
   * See [ProjectSettings.physics/3d/defaultLinearDamp] for more details about damping.
   */
  public var linearDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getLinearDampPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setLinearDampPtr, NIL)
    }

  /**
   * Override mode for angular damping calculations within this area. See [SpaceOverride] for
   * possible values.
   */
  public var angularDampSpaceOverride: SpaceOverride
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularDampSpaceOverrideModePtr, LONG)
      return Area3D.SpaceOverride.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularDampSpaceOverrideModePtr, NIL)
    }

  /**
   * The rate at which objects stop spinning in this area. Represents the angular velocity lost per
   * second.
   * See [ProjectSettings.physics/3d/defaultAngularDamp] for more details about damping.
   */
  public var angularDamp: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAngularDampPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setAngularDampPtr, NIL)
    }

  /**
   * The magnitude of area-specific wind force.
   * **Note:** This wind force only applies to [SoftBody3D] nodes. Other physics bodies are
   * currently not affected by wind.
   */
  public var windForceMagnitude: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWindForceMagnitudePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setWindForceMagnitudePtr, NIL)
    }

  /**
   * The exponential rate at which wind force decreases with distance from its origin.
   * **Note:** This wind force only applies to [SoftBody3D] nodes. Other physics bodies are
   * currently not affected by wind.
   */
  public var windAttenuationFactor: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWindAttenuationFactorPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setWindAttenuationFactorPtr, NIL)
    }

  /**
   * The [Node3D] which is used to specify the direction and origin of an area-specific wind force.
   * The direction is opposite to the z-axis of the [Node3D]'s local transform, and its origin is the
   * origin of the [Node3D]'s local transform.
   * **Note:** This wind force only applies to [SoftBody3D] nodes. Other physics bodies are
   * currently not affected by wind.
   */
  public var windSourcePath: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getWindSourcePathPtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setWindSourcePathPtr, NIL)
    }

  /**
   * If `true`, the area's audio bus overrides the default audio bus.
   */
  public var audioBusOverride: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isOverridingAudioBusPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAudioBusOverridePtr, NIL)
    }

  /**
   * The name of the area's audio bus.
   */
  public var audioBusName: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAudioBusNamePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAudioBusNamePtr, NIL)
    }

  /**
   * If `true`, the area applies reverb to its associated audio.
   */
  public var reverbBusEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingReverbBusPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseReverbBusPtr, NIL)
    }

  /**
   * The name of the reverb bus to use for this area's associated audio.
   */
  public var reverbBusName: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReverbBusNamePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setReverbBusNamePtr, NIL)
    }

  /**
   * The degree to which this area applies reverb to its associated audio. Ranges from `0` to `1`
   * with `0.1` precision.
   */
  public var reverbBusAmount: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReverbAmountPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setReverbAmountPtr, NIL)
    }

  /**
   * The degree to which this area's reverb is a uniform effect. Ranges from `0` to `1` with `0.1`
   * precision.
   */
  public var reverbBusUniformity: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReverbUniformityPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setReverbUniformityPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_AREA3D, scriptIndex)
  }

  /**
   * If gravity is a point (see [gravityPoint]), this will be the point of attraction.
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
   * val myCoreType = area3d.gravityPointCenter
   * //Your changes
   * area3d.gravityPointCenter = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun gravityPointCenterMutate(block: Vector3.() -> Unit): Vector3 =
      gravityPointCenter.apply{
      block(this)
      gravityPointCenter = this
  }


  /**
   * The area's gravity vector (not normalized).
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
   * val myCoreType = area3d.gravityDirection
   * //Your changes
   * area3d.gravityDirection = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun gravityDirectionMutate(block: Vector3.() -> Unit): Vector3 =
      gravityDirection.apply{
      block(this)
      gravityDirection = this
  }


  /**
   * Returns a list of intersecting [PhysicsBody3D]s and [GridMap]s. The overlapping body's
   * [CollisionObject3D.collisionLayer] must be part of this area's [CollisionObject3D.collisionMask]
   * in order to be detected.
   * For performance reasons (collisions are all processed at the same time) this list is modified
   * once during the physics step, not immediately after objects are moved. Consider using signals
   * instead.
   */
  public fun getOverlappingBodies(): VariantArray<Node3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOverlappingBodiesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Node3D>)
  }

  /**
   * Returns a list of intersecting [Area3D]s. The overlapping area's
   * [CollisionObject3D.collisionLayer] must be part of this area's [CollisionObject3D.collisionMask]
   * in order to be detected.
   * For performance reasons (collisions are all processed at the same time) this list is modified
   * once during the physics step, not immediately after objects are moved. Consider using signals
   * instead.
   */
  public fun getOverlappingAreas(): VariantArray<Area3D> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getOverlappingAreasPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Area3D>)
  }

  /**
   * Returns `true` if intersecting any [PhysicsBody3D]s or [GridMap]s, otherwise returns `false`.
   * The overlapping body's [CollisionObject3D.collisionLayer] must be part of this area's
   * [CollisionObject3D.collisionMask] in order to be detected.
   * For performance reasons (collisions are all processed at the same time) the list of overlapping
   * bodies is modified once during the physics step, not immediately after objects are moved. Consider
   * using signals instead.
   */
  public fun hasOverlappingBodies(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasOverlappingBodiesPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if intersecting any [Area3D]s, otherwise returns `false`. The overlapping area's
   * [CollisionObject3D.collisionLayer] must be part of this area's [CollisionObject3D.collisionMask]
   * in order to be detected.
   * For performance reasons (collisions are all processed at the same time) the list of overlapping
   * areas is modified once during the physics step, not immediately after objects are moved. Consider
   * using signals instead.
   */
  public fun hasOverlappingAreas(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasOverlappingAreasPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the given physics body intersects or overlaps this [Area3D], `false`
   * otherwise.
   * **Note:** The result of this test is not immediate after moving objects. For performance, list
   * of overlaps is updated once per frame and before the physics step. Consider using signals instead.
   * The [body] argument can either be a [PhysicsBody3D] or a [GridMap] instance. While GridMaps are
   * not physics body themselves, they register their tiles with collision shapes as a virtual physics
   * body.
   */
  public fun overlapsBody(body: Node): Boolean {
    TransferContext.writeArguments(OBJECT to body)
    TransferContext.callMethod(rawPtr, MethodBindings.overlapsBodyPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns `true` if the given [Area3D] intersects or overlaps this [Area3D], `false` otherwise.
   * **Note:** The result of this test is not immediate after moving objects. For performance, list
   * of overlaps is updated once per frame and before the physics step. Consider using signals instead.
   */
  public fun overlapsArea(area: Node): Boolean {
    TransferContext.writeArguments(OBJECT to area)
    TransferContext.callMethod(rawPtr, MethodBindings.overlapsAreaPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public enum class SpaceOverride(
    id: Long,
  ) {
    /**
     * This area does not affect gravity/damping.
     */
    SPACE_OVERRIDE_DISABLED(0),
    /**
     * This area adds its gravity/damping values to whatever has been calculated so far (in
     * [priority] order).
     */
    SPACE_OVERRIDE_COMBINE(1),
    /**
     * This area adds its gravity/damping values to whatever has been calculated so far (in
     * [priority] order), ignoring any lower priority areas.
     */
    SPACE_OVERRIDE_COMBINE_REPLACE(2),
    /**
     * This area replaces any gravity/damping, even the defaults, ignoring any lower priority areas.
     */
    SPACE_OVERRIDE_REPLACE(3),
    /**
     * This area replaces any gravity/damping calculated so far (in [priority] order), but keeps
     * calculating the rest of the areas.
     */
    SPACE_OVERRIDE_REPLACE_COMBINE(4),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): SpaceOverride = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setGravitySpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_gravity_space_override_mode", 2311433571)

    public val getGravitySpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_gravity_space_override_mode", 958191869)

    public val setGravityIsPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_gravity_is_point", 2586408642)

    public val isGravityAPointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "is_gravity_a_point", 36873697)

    public val setGravityPointUnitDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_gravity_point_unit_distance", 373806689)

    public val getGravityPointUnitDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_gravity_point_unit_distance", 1740695150)

    public val setGravityPointCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_gravity_point_center", 3460891852)

    public val getGravityPointCenterPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_gravity_point_center", 3360562783)

    public val setGravityDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_gravity_direction", 3460891852)

    public val getGravityDirectionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_gravity_direction", 3360562783)

    public val setGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_gravity", 373806689)

    public val getGravityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_gravity", 1740695150)

    public val setLinearDampSpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_linear_damp_space_override_mode", 2311433571)

    public val getLinearDampSpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_linear_damp_space_override_mode", 958191869)

    public val setAngularDampSpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_angular_damp_space_override_mode", 2311433571)

    public val getAngularDampSpaceOverrideModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_angular_damp_space_override_mode", 958191869)

    public val setAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_angular_damp", 373806689)

    public val getAngularDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_angular_damp", 1740695150)

    public val setLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_linear_damp", 373806689)

    public val getLinearDampPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_linear_damp", 1740695150)

    public val setPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_priority", 1286410249)

    public val getPriorityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_priority", 3905245786)

    public val setWindForceMagnitudePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_wind_force_magnitude", 373806689)

    public val getWindForceMagnitudePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_wind_force_magnitude", 1740695150)

    public val setWindAttenuationFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_wind_attenuation_factor", 373806689)

    public val getWindAttenuationFactorPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_wind_attenuation_factor", 1740695150)

    public val setWindSourcePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_wind_source_path", 1348162250)

    public val getWindSourcePathPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_wind_source_path", 4075236667)

    public val setMonitorablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_monitorable", 2586408642)

    public val isMonitorablePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "is_monitorable", 36873697)

    public val setMonitoringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_monitoring", 2586408642)

    public val isMonitoringPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "is_monitoring", 36873697)

    public val getOverlappingBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_overlapping_bodies", 3995934104)

    public val getOverlappingAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_overlapping_areas", 3995934104)

    public val hasOverlappingBodiesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "has_overlapping_bodies", 36873697)

    public val hasOverlappingAreasPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "has_overlapping_areas", 36873697)

    public val overlapsBodyPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "overlaps_body", 3093956946)

    public val overlapsAreaPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "overlaps_area", 3093956946)

    public val setAudioBusOverridePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_audio_bus_override", 2586408642)

    public val isOverridingAudioBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "is_overriding_audio_bus", 36873697)

    public val setAudioBusNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_audio_bus_name", 3304788590)

    public val getAudioBusNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_audio_bus_name", 2002593661)

    public val setUseReverbBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_use_reverb_bus", 2586408642)

    public val isUsingReverbBusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "is_using_reverb_bus", 36873697)

    public val setReverbBusNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_reverb_bus_name", 3304788590)

    public val getReverbBusNamePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_reverb_bus_name", 2002593661)

    public val setReverbAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_reverb_amount", 373806689)

    public val getReverbAmountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_reverb_amount", 1740695150)

    public val setReverbUniformityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "set_reverb_uniformity", 373806689)

    public val getReverbUniformityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Area3D", "get_reverb_uniformity", 1740695150)
  }
}
