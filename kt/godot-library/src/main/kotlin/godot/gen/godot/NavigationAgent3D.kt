// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.Dictionary
import godot.core.PackedVector3Array
import godot.core.RID
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR3_ARRAY
import godot.core.VariantType.VECTOR3
import godot.core.VariantType._RID
import godot.core.Vector3
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.signal
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * 3D Agent used in navigation for collision avoidance.
 *
 * 3D Agent that is used in navigation to reach a location while avoiding static and dynamic obstacles. The dynamic obstacles are avoided using RVO collision avoidance. The agent needs navigation data to work correctly. [godot.NavigationAgent3D] is physics safe.
 *
 * **Note:** After setting [targetLocation] it is required to use the [getNextLocation] function once every physics frame to update the internal path logic of the NavigationAgent. The returned vector position from this function should be used as the next movement position for the agent's parent Node.
 */
@GodotBaseType
public open class NavigationAgent3D : Node() {
  /**
   * Notifies when the navigation path changes.
   */
  public val pathChanged: Signal0 by signal()

  /**
   * Notifies when the player-defined [targetLocation] is reached.
   */
  public val targetReached: Signal0 by signal()

  /**
   * Notifies when a waypoint along the path has been reached.
   *
   * The details dictionary may contain the following keys depending on the value of [pathMetadataFlags]:
   *
   * - `location`: The location of the waypoint that was reached.
   *
   * - `type`: The type of navigation primitive (region or link) that contains this waypoint.
   *
   * - `rid`: The [RID] of the containing navigation primitive (region or link).
   *
   * - `owner`: The object which manages the containing navigation primitive (region or link).
   */
  public val waypointReached: Signal1<Dictionary<Any?, Any?>> by signal("details")

  /**
   * Notifies when a navigation link has been reached.
   *
   * The details dictionary may contain the following keys depending on the value of [pathMetadataFlags]:
   *
   * - `location`: The start location of the link that was reached.
   *
   * - `type`: Always [godot.NavigationPathQueryResult3D.PATH_SEGMENT_TYPE_LINK].
   *
   * - `rid`: The [RID] of the link.
   *
   * - `owner`: The object which manages the link (usually [godot.NavigationLink3D]).
   */
  public val linkReached: Signal1<Dictionary<Any?, Any?>> by signal("details")

  /**
   * Notifies when the final location is reached.
   */
  public val navigationFinished: Signal0 by signal()

  /**
   * Notifies when the collision avoidance velocity is calculated. Emitted by [setVelocity]. Only emitted when [avoidanceEnabled] is true.
   */
  public val velocityComputed: Signal1<Vector3> by signal("safeVelocity")

  /**
   * The user-defined target location. Setting this property will clear the current navigation path.
   */
  public var targetLocation: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_TARGET_LOCATION, VECTOR3)
      return TransferContext.readReturnValue(VECTOR3, false) as Vector3
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_TARGET_LOCATION, NIL)
    }

  /**
   * The distance threshold before a path point is considered to be reached. This will allow an agent to not have to hit a path point on the path exactly, but in the area. If this value is set to high the NavigationAgent will skip points on the path which can lead to leaving the navigation mesh. If this value is set to low the NavigationAgent will be stuck in a repath loop cause it will constantly overshoot or undershoot the distance to the next point on each physics frame update.
   */
  public var pathDesiredDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_PATH_DESIRED_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_PATH_DESIRED_DISTANCE, NIL)
    }

  /**
   * The distance threshold before the final target point is considered to be reached. This will allow an agent to not have to hit the point of the final target exactly, but only the area. If this value is set to low the NavigationAgent will be stuck in a repath loop cause it will constantly overshoot or undershoot the distance to the final target point on each physics frame update.
   */
  public var targetDesiredDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_TARGET_DESIRED_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_TARGET_DESIRED_DISTANCE, NIL)
    }

  /**
   * The NavigationAgent height offset is subtracted from the y-axis value of any vector path position for this NavigationAgent. The NavigationAgent height offset does not change or influence the navigation mesh or pathfinding query result. Additional navigation maps that use regions with navigation meshes that the developer baked with appropriate agent radius or height values are required to support different-sized agents.
   */
  public var agentHeightOffset: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_AGENT_HEIGHT_OFFSET, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_AGENT_HEIGHT_OFFSET, NIL)
    }

  /**
   * The maximum distance the agent is allowed away from the ideal path to the final location. This can happen due to trying to avoid collisions. When the maximum distance is exceeded, it recalculates the ideal path.
   */
  public var pathMaxDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_PATH_MAX_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_PATH_MAX_DISTANCE, NIL)
    }

  /**
   * A bitfield determining what navigation layers of navigation regions this NavigationAgent will use to calculate path. Changing it runtime will clear current navigation path and generate new one, according to new navigation layers.
   */
  public var navigationLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_NAVIGATION_LAYERS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_NAVIGATION_LAYERS, NIL)
    }

  /**
   * Additional information to return with the navigation path.
   */
  public var pathMetadataFlags: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_PATH_METADATA_FLAGS, OBJECT)
      return TransferContext.readReturnValue(OBJECT, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_PATH_METADATA_FLAGS, NIL)
    }

  /**
   * If `true` the agent is registered for an RVO avoidance callback on the [godot.NavigationServer3D]. When [godot.NavigationAgent3D.setVelocity] is used and the processing is completed a `safe_velocity` Vector3 is received with a signal connection to [velocityComputed]. Avoidance processing with many registered agents has a significant performance cost and should only be enabled on agents that currently require it.
   */
  public var avoidanceEnabled: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_AVOIDANCE_ENABLED, BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_AVOIDANCE_ENABLED, NIL)
    }

  /**
   * The radius of the avoidance agent. This is the "body" of the avoidance agent and not the avoidance maneuver starting radius (which is controlled by [neighborDistance]).
   *
   * Does not affect normal pathfinding. To change an actor's pathfinding radius bake [godot.NavigationMesh] resources with a different [godot.NavigationMesh.agentRadius] property and use different navigation maps for each actor size.
   */
  public var radius: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_RADIUS,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_RADIUS, NIL)
    }

  /**
   * The distance to search for other agents.
   */
  public var neighborDistance: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_NEIGHBOR_DISTANCE, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_NEIGHBOR_DISTANCE, NIL)
    }

  /**
   * The maximum number of neighbors for the agent to consider.
   */
  public var maxNeighbors: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_MAX_NEIGHBORS, LONG)
      return TransferContext.readReturnValue(LONG, false) as Long
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_MAX_NEIGHBORS, NIL)
    }

  /**
   * The minimal amount of time for which this agent's velocities, that are computed with the collision avoidance algorithm, are safe with respect to other agents. The larger the number, the sooner the agent will respond to other agents, but less freedom in choosing its velocities. Must be positive.
   */
  public var timeHorizon: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_TIME_HORIZON, DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr,
          ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_TIME_HORIZON, NIL)
    }

  /**
   * The maximum speed that an agent can move.
   */
  public var maxSpeed: Double
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_MAX_SPEED,
          DOUBLE)
      return TransferContext.readReturnValue(DOUBLE, false) as Double
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_MAX_SPEED,
          NIL)
    }

  /**
   * Ignores collisions on the Y axis. Must be true to move on a horizontal plane.
   */
  public var ignoreY: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_IGNORE_Y,
          BOOL)
      return TransferContext.readReturnValue(BOOL, false) as Boolean
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_IGNORE_Y,
          NIL)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_NAVIGATIONAGENT3D, scriptIndex)
    return true
  }

  /**
   * Returns the [RID] of this agent on the [godot.NavigationServer3D].
   */
  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_RID, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Based on [value], enables or disables the specified layer in the [navigationLayers] bitmask, given a [layerNumber] between 1 and 32.
   */
  public fun setNavigationLayerValue(layerNumber: Long, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber, BOOL to value)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_NAVIGATION_LAYER_VALUE, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [navigationLayers] bitmask is enabled, given a [layerNumber] between 1 and 32.
   */
  public fun getNavigationLayerValue(layerNumber: Long): Boolean {
    TransferContext.writeArguments(LONG to layerNumber)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_NAVIGATION_LAYER_VALUE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Sets the [RID] of the navigation map this NavigationAgent node should use and also updates the `agent` on the NavigationServer.
   */
  public fun setNavigationMap(navigationMap: RID): Unit {
    TransferContext.writeArguments(_RID to navigationMap)
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_NAVIGATION_MAP, NIL)
  }

  /**
   * Returns the [RID] of the navigation map for this NavigationAgent node. This function returns always the map set on the NavigationAgent node and not the map of the abstract agent on the NavigationServer. If the agent map is changed directly with the NavigationServer API the NavigationAgent node will not be aware of the map change. Use [setNavigationMap] to change the navigation map for the NavigationAgent and also update the agent on the NavigationServer.
   */
  public fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_NAVIGATION_MAP, _RID)
    return TransferContext.readReturnValue(_RID, false) as RID
  }

  /**
   * Returns the next location in global coordinates that can be moved to, making sure that there are no static objects in the way. If the agent does not have a navigation path, it will return the position of the agent's parent. The use of this function once every physics frame is required to update the internal path logic of the NavigationAgent.
   */
  public fun getNextLocation(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_NEXT_LOCATION,
        VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  /**
   * Returns the distance to the target location, using the agent's global position. The user must set [targetLocation] in order for this to be accurate.
   */
  public fun distanceToTarget(): Double {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_DISTANCE_TO_TARGET, DOUBLE)
    return TransferContext.readReturnValue(DOUBLE, false) as Double
  }

  /**
   * Sends the passed in velocity to the collision avoidance algorithm. It will adjust the velocity to avoid collisions. Once the adjustment to the velocity is complete, it will emit the [velocityComputed] signal.
   */
  public fun setVelocity(velocity: Vector3): Unit {
    TransferContext.writeArguments(VECTOR3 to velocity)
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_SET_VELOCITY, NIL)
  }

  /**
   * Returns the path query result for the path the agent is currently following.
   */
  public fun getCurrentNavigationResult(): NavigationPathQueryResult3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_CURRENT_NAVIGATION_RESULT, OBJECT)
    return TransferContext.readReturnValue(OBJECT, true) as NavigationPathQueryResult3D?
  }

  /**
   * Returns this agent's current path from start to finish in global coordinates. The path only updates when the target location is changed or the agent requires a repath. The path array is not intended to be used in direct path movement as the agent has its own internal path logic that would get corrupted by changing the path array manually. Use the intended [getNextLocation] once every physics frame to receive the next path point for the agents movement as this function also updates the internal path logic.
   */
  public fun getCurrentNavigationPath(): PackedVector3Array {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_CURRENT_NAVIGATION_PATH,
        PACKED_VECTOR3_ARRAY)
    return TransferContext.readReturnValue(PACKED_VECTOR3_ARRAY, false) as PackedVector3Array
  }

  /**
   * Returns which index the agent is currently on in the navigation path's [godot.PackedVector3Array].
   */
  public fun getCurrentNavigationPathIndex(): Long {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_CURRENT_NAVIGATION_PATH_INDEX, LONG)
    return TransferContext.readReturnValue(LONG, false) as Long
  }

  /**
   * Returns true if [targetLocation] is reached. It may not always be possible to reach the target location. It should always be possible to reach the final location though. See [getFinalLocation].
   */
  public fun isTargetReached(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_IS_TARGET_REACHED,
        BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns true if [targetLocation] is reachable.
   */
  public fun isTargetReachable(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_IS_TARGET_REACHABLE, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns true if the navigation path's final location has been reached.
   */
  public fun isNavigationFinished(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_IS_NAVIGATION_FINISHED, BOOL)
    return TransferContext.readReturnValue(BOOL, false) as Boolean
  }

  /**
   * Returns the reachable final location in global coordinates. This can change if the navigation path is altered in any way. Because of this, it would be best to check this each frame.
   */
  public fun getFinalLocation(): Vector3 {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr,
        ENGINEMETHOD_ENGINECLASS_NAVIGATIONAGENT3D_GET_FINAL_LOCATION, VECTOR3)
    return TransferContext.readReturnValue(VECTOR3, false) as Vector3
  }

  public companion object
}