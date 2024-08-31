// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.RID
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType._RID
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * A traversable 2D region based on a [NavigationPolygon] that [NavigationAgent2D]s can use for
 * pathfinding.
 * Two regions can be connected to each other if they share a similar edge. You can set the minimum
 * distance between two vertices required to connect two edges by using
 * [NavigationServer2D.mapSetEdgeConnectionMargin].
 * **Note:** Overlapping two regions' navigation polygons is not enough for connecting two regions.
 * They must share a similar edge.
 * The pathfinding cost of entering a region from another region can be controlled with the
 * [enterCost] value.
 * **Note:** This value is not added to the path cost when the start position is already inside this
 * region.
 * The pathfinding cost of traveling distances inside this region can be controlled with the
 * [travelCost] multiplier.
 * **Note:** This node caches changes to its properties, so if you make changes to the underlying
 * region [RID] in [NavigationServer2D], they will not be reflected in this node's properties.
 */
@GodotBaseType
public open class NavigationRegion2D : Node2D() {
  /**
   * Emitted when the used navigation polygon is replaced or changes to the internals of the current
   * navigation polygon are committed.
   */
  public val navigationPolygonChanged: Signal0 by signal()

  /**
   * Emitted when a navigation polygon bake operation is completed.
   */
  public val bakeFinished: Signal0 by signal()

  /**
   * The [NavigationPolygon] resource to use.
   */
  public var navigationPolygon: NavigationPolygon?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNavigationPolygonPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as NavigationPolygon?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNavigationPolygonPtr, NIL)
    }

  /**
   * Determines if the [NavigationRegion2D] is enabled or disabled.
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
   * If enabled the navigation region will use edge connections to connect with other navigation
   * regions within proximity of the navigation map edge connection margin.
   */
  public var useEdgeConnections: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getUseEdgeConnectionsPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseEdgeConnectionsPtr, NIL)
    }

  /**
   * A bitfield determining all navigation layers the region belongs to. These navigation layers can
   * be checked upon when requesting a path with [NavigationServer2D.mapGetPath].
   */
  public var navigationLayers: Long
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayersPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setNavigationLayersPtr, NIL)
    }

  /**
   * When pathfinding enters this region's navigation mesh from another regions navigation mesh the
   * [enterCost] value is added to the path distance for determining the shortest path.
   */
  public var enterCost: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnterCostPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setEnterCostPtr, NIL)
    }

  /**
   * When pathfinding moves inside this region's navigation mesh the traveled distances are
   * multiplied with [travelCost] for determining the shortest path.
   */
  public var travelCost: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTravelCostPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setTravelCostPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONREGION2D, scriptIndex)
  }

  /**
   * Returns the [RID] of this region on the [NavigationServer2D]. Combined with
   * [NavigationServer2D.mapGetClosestPointOwner] can be used to identify the [NavigationRegion2D]
   * closest to a point on the merged navigation map.
   */
  public fun getRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Sets the [RID] of the navigation map this region should use. By default the region will
   * automatically join the [World2D] default navigation map so this function is only required to
   * override the default map.
   */
  public fun setNavigationMap(navigationMap: RID): Unit {
    TransferContext.writeArguments(_RID to navigationMap)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationMapPtr, NIL)
  }

  /**
   * Returns the current navigation map [RID] used by this region.
   */
  public fun getNavigationMap(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationMapPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Based on [value], enables or disables the specified layer in the [navigationLayers] bitmask,
   * given a [layerNumber] between 1 and 32.
   */
  public fun setNavigationLayerValue(layerNumber: Int, `value`: Boolean): Unit {
    TransferContext.writeArguments(LONG to layerNumber.toLong(), BOOL to value)
    TransferContext.callMethod(rawPtr, MethodBindings.setNavigationLayerValuePtr, NIL)
  }

  /**
   * Returns whether or not the specified layer of the [navigationLayers] bitmask is enabled, given
   * a [layerNumber] between 1 and 32.
   */
  public fun getNavigationLayerValue(layerNumber: Int): Boolean {
    TransferContext.writeArguments(LONG to layerNumber.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getNavigationLayerValuePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Returns the [RID] of this region on the [NavigationServer2D].
   */
  public fun getRegionRid(): RID {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getRegionRidPtr, _RID)
    return (TransferContext.readReturnValue(_RID, false) as RID)
  }

  /**
   * Bakes the [NavigationPolygon]. If [onThread] is set to `true` (default), the baking is done on
   * a separate thread.
   */
  @JvmOverloads
  public fun bakeNavigationPolygon(onThread: Boolean = true): Unit {
    TransferContext.writeArguments(BOOL to onThread)
    TransferContext.callMethod(rawPtr, MethodBindings.bakeNavigationPolygonPtr, NIL)
  }

  /**
   * Returns `true` when the [NavigationPolygon] is being baked on a background thread.
   */
  public fun isBaking(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isBakingPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val getRidPtr: VoidPtr = TypeManager.getMethodBindPtr("NavigationRegion2D", "get_rid")

    public val setNavigationPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_navigation_polygon")

    public val getNavigationPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_navigation_polygon")

    public val setEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_enabled")

    public val isEnabledPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "is_enabled")

    public val setNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_navigation_map")

    public val getNavigationMapPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_navigation_map")

    public val setUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_use_edge_connections")

    public val getUseEdgeConnectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_use_edge_connections")

    public val setNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_navigation_layers")

    public val getNavigationLayersPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_navigation_layers")

    public val setNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_navigation_layer_value")

    public val getNavigationLayerValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_navigation_layer_value")

    public val getRegionRidPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_region_rid")

    public val setEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_enter_cost")

    public val getEnterCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_enter_cost")

    public val setTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "set_travel_cost")

    public val getTravelCostPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "get_travel_cost")

    public val bakeNavigationPolygonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "bake_navigation_polygon")

    public val isBakingPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationRegion2D", "is_baking")
  }
}
