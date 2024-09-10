// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.CoreTypeHelper
import godot.`annotation`.CoreTypeLocalCopy
import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.VariantType.VECTOR2
import godot.core.VariantType._RID
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * An obstacle needs a navigation map and outline [vertices] defined to work correctly. The outlines
 * can not cross or overlap.
 * Obstacles can be included in the navigation mesh baking process when [affectNavigationMesh] is
 * enabled. They do not add walkable geometry, instead their role is to discard other source geometry
 * inside the shape. This can be used to prevent navigation mesh from appearing in unwanted places. If
 * [carveNavigationMesh] is enabled the baked shape will not be affected by offsets of the navigation
 * mesh baking, e.g. the agent radius.
 * With [avoidanceEnabled] the obstacle can constrain the avoidance velocities of avoidance using
 * agents. If the obstacle's vertices are wound in clockwise order, avoidance agents will be pushed in
 * by the obstacle, otherwise, avoidance agents will be pushed out. Obstacles using vertices and
 * avoidance can warp to a new position but should not be moved every single frame as each change
 * requires a rebuild of the avoidance map.
 */
@GodotBaseType
public open class NavigationObstacle2D : Node2D() {
  /**
   * Sets the avoidance radius for the obstacle.
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

  /**
   * The outline vertices of the obstacle. If the vertices are winded in clockwise order agents will
   * be pushed in by the obstacle, else they will be pushed out. Outlines can not be crossed or
   * overlap. Should the vertices using obstacle be warped to a new position agent's can not predict
   * this movement and may get trapped inside the obstacle.
   */
  public var vertices: PackedVector2Array
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVerticesPtr, PACKED_VECTOR2_ARRAY)
      return (TransferContext.readReturnValue(PACKED_VECTOR2_ARRAY, false) as PackedVector2Array)
    }
    set(`value`) {
      TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVerticesPtr, NIL)
    }

  /**
   * If enabled and parsed in a navigation mesh baking process the obstacle will discard source
   * geometry inside its [vertices] defined shape.
   */
  public var affectNavigationMesh: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAffectNavigationMeshPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAffectNavigationMeshPtr, NIL)
    }

  /**
   * If enabled the obstacle vertices will carve into the baked navigation mesh with the shape
   * unaffected by additional offsets (e.g. agent radius).
   * It will still be affected by further postprocessing of the baking process, like edge and
   * polygon simplification.
   * Requires [affectNavigationMesh] to be enabled.
   */
  public var carveNavigationMesh: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCarveNavigationMeshPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCarveNavigationMeshPtr, NIL)
    }

  /**
   * If `true` the obstacle affects avoidance using agents.
   */
  public var avoidanceEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAvoidanceEnabledPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAvoidanceEnabledPtr, NIL)
    }

  /**
   * Sets the wanted velocity for the obstacle so other agent's can better predict the obstacle if
   * it is moved with a velocity regularly (every frame) instead of warped to a new position. Does only
   * affect avoidance for the obstacles [radius]. Does nothing for the obstacles static vertices.
   */
  @CoreTypeLocalCopy
  public var velocity: Vector2
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVelocityPtr, VECTOR2)
      return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR2 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setVelocityPtr, NIL)
    }

  /**
   * A bitfield determining the avoidance layers for this obstacle. Agents with a matching bit on
   * the their avoidance mask will avoid this obstacle.
   */
  public var avoidanceLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getAvoidanceLayersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setAvoidanceLayersPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONOBSTACLE2D, scriptIndex)
  }

  /**
   * Sets the wanted velocity for the obstacle so other agent's can better predict the obstacle if
   * it is moved with a velocity regularly (every frame) instead of warped to a new position. Does only
   * affect avoidance for the obstacles [radius]. Does nothing for the obstacles static vertices.
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
   * val myCoreType = navigationobstacle2d.velocity
   * //Your changes
   * navigationobstacle2d.velocity = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun velocityMutate(block: Vector2.() -> Unit): Vector2 = velocity.apply{
      block(this)
      velocity = this
  }


  /**
   * Returns the [RID] of this obstacle on the [NavigationServer2D].
   */
  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the [RID] of the navigation map this NavigationObstacle node should use and also updates
   * the `obstacle` on the NavigationServer.
   */
  public fun setNavigationMap(navigationMap: RID): Unit {
    TransferContext.writeArguments(_RID to navigationMap)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationMapPtr, NIL)
  }

  /**
   * Returns the [RID] of the navigation map for this NavigationObstacle node. This function returns
   * always the map set on the NavigationObstacle node and not the map of the abstract obstacle on the
   * NavigationServer. If the obstacle map is changed directly with the NavigationServer API the
   * NavigationObstacle node will not be aware of the map change. Use [setNavigationMap] to change the
   * navigation map for the NavigationObstacle and also update the obstacle on the NavigationServer.
   */
  public fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [avoidanceLayers] bitmask,
   * given a [layerNumber] between 1 and 32.
   */
  public fun setAvoidanceLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setAvoidanceLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [avoidanceLayers] bitmask is enabled, given a
   * [layerNumber] between 1 and 32.
   */
  public fun getAvoidanceLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAvoidanceLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val getRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "get_rid", 2944877500)

    public val setAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "set_avoidance_enabled", 2586408642)

    public val getAvoidanceEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "get_avoidance_enabled", 36873697)

    public val setNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "set_navigation_map", 2722037293)

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "get_navigation_map", 2944877500)

    public val setRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "set_radius", 373806689)

    public val getRadiusPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "get_radius", 1740695150)

    public val setVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "set_velocity", 743155724)

    public val getVelocityPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "get_velocity", 3341600327)

    public val setVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "set_vertices", 1509147220)

    public val getVerticesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "get_vertices", 2961356807)

    public val setAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "set_avoidance_layers", 1286410249)

    public val getAvoidanceLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "get_avoidance_layers", 3905245786)

    public val setAvoidanceLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "set_avoidance_layer_value", 300928843)

    public val getAvoidanceLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "get_avoidance_layer_value", 1116898809)

    public val setAffectNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "set_affect_navigation_mesh", 2586408642)

    public val getAffectNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "get_affect_navigation_mesh", 36873697)

    public val setCarveNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "set_carve_navigation_mesh", 2586408642)

    public val getCarveNavigationMeshPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationObstacle2D", "get_carve_navigation_mesh", 36873697)
  }
}
