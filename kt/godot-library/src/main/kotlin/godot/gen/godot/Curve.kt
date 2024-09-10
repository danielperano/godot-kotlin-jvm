// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.VECTOR2
import godot.core.Vector2
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmOverloads

/**
 * This resource describes a mathematical curve by defining a set of points and tangents at each
 * point. By default, it ranges between `0` and `1` on the Y axis and positions points relative to the
 * `0.5` Y position.
 * See also [Gradient] which is designed for color interpolation. See also [Curve2D] and [Curve3D].
 */
@GodotBaseType
public open class Curve : Resource() {
  /**
   * Emitted when [maxValue] or [minValue] is changed.
   */
  public val rangeChanged: Signal0 by signal()

  /**
   * The minimum value the curve can reach.
   */
  public var minValue: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinValuePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinValuePtr, NIL)
    }

  /**
   * The maximum value the curve can reach.
   */
  public var maxValue: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxValuePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxValuePtr, NIL)
    }

  /**
   * The number of points to include in the baked (i.e. cached) curve data.
   */
  public var bakeResolution: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getBakeResolutionPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setBakeResolutionPtr, NIL)
    }

  /**
   * The number of points describing the curve.
   */
  public var pointCount: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getPointCountPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setPointCountPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CURVE, scriptIndex)
  }

  /**
   * Adds a point to the curve. For each side, if the `*_mode` is [TANGENT_LINEAR], the `*_tangent`
   * angle (in degrees) uses the slope of the curve halfway to the adjacent point. Allows custom
   * assignments to the `*_tangent` angle if `*_mode` is set to [TANGENT_FREE].
   */
  @JvmOverloads
  public fun addPoint(
    position: Vector2,
    leftTangent: Float = 0.0f,
    rightTangent: Float = 0.0f,
    leftMode: TangentMode = Curve.TangentMode.TANGENT_FREE,
    rightMode: TangentMode = Curve.TangentMode.TANGENT_FREE,
  ): Int {
    TransferContext.writeArguments(VECTOR2 to position, DOUBLE to leftTangent.toDouble(), DOUBLE to rightTangent.toDouble(), LONG to leftMode.id, LONG to rightMode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.addPointPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Removes the point at [index] from the curve.
   */
  public fun removePoint(index: Int): Unit {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.removePointPtr, NIL)
  }

  /**
   * Removes all points from the curve.
   */
  public fun clearPoints(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPointsPtr, NIL)
  }

  /**
   * Returns the curve coordinates for the point at [index].
   */
  public fun getPointPosition(index: Int): Vector2 {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointPositionPtr, VECTOR2)
    return (TransferContext.readReturnValue(VECTOR2, false) as Vector2)
  }

  /**
   * Assigns the vertical position [y] to the point at [index].
   */
  public fun setPointValue(index: Int, y: Float): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to y.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPointValuePtr, NIL)
  }

  /**
   * Sets the offset from `0.5`.
   */
  public fun setPointOffset(index: Int, offset: Float): Int {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPointOffsetPtr, LONG)
    return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
  }

  /**
   * Returns the Y value for the point that would exist at the X position [offset] along the curve.
   */
  public fun sample(offset: Float): Float {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.samplePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the Y value for the point that would exist at the X position [offset] along the curve
   * using the baked cache. Bakes the curve's points if not already baked.
   */
  public fun sampleBaked(offset: Float): Float {
    TransferContext.writeArguments(DOUBLE to offset.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.sampleBakedPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the left tangent angle (in degrees) for the point at [index].
   */
  public fun getPointLeftTangent(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointLeftTangentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the right tangent angle (in degrees) for the point at [index].
   */
  public fun getPointRightTangent(index: Int): Float {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointRightTangentPtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Returns the left [TangentMode] for the point at [index].
   */
  public fun getPointLeftMode(index: Int): TangentMode {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointLeftModePtr, LONG)
    return Curve.TangentMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the right [TangentMode] for the point at [index].
   */
  public fun getPointRightMode(index: Int): TangentMode {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getPointRightModePtr, LONG)
    return Curve.TangentMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Sets the left tangent angle for the point at [index] to [tangent].
   */
  public fun setPointLeftTangent(index: Int, tangent: Float): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to tangent.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPointLeftTangentPtr, NIL)
  }

  /**
   * Sets the right tangent angle for the point at [index] to [tangent].
   */
  public fun setPointRightTangent(index: Int, tangent: Float): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), DOUBLE to tangent.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setPointRightTangentPtr, NIL)
  }

  /**
   * Sets the left [TangentMode] for the point at [index] to [mode].
   */
  public fun setPointLeftMode(index: Int, mode: TangentMode): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointLeftModePtr, NIL)
  }

  /**
   * Sets the right [TangentMode] for the point at [index] to [mode].
   */
  public fun setPointRightMode(index: Int, mode: TangentMode): Unit {
    TransferContext.writeArguments(LONG to index.toLong(), LONG to mode.id)
    TransferContext.callMethod(rawPtr, MethodBindings.setPointRightModePtr, NIL)
  }

  /**
   * Removes duplicate points, i.e. points that are less than 0.00001 units (engine epsilon value)
   * away from their neighbor on the curve.
   */
  public fun cleanDupes(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.cleanDupesPtr, NIL)
  }

  /**
   * Recomputes the baked cache of points for the curve.
   */
  public fun bake(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.bakePtr, NIL)
  }

  public enum class TangentMode(
    id: Long,
  ) {
    /**
     * The tangent on this side of the point is user-defined.
     */
    TANGENT_FREE(0),
    /**
     * The curve calculates the tangent on this side of the point as the slope halfway towards the
     * adjacent point.
     */
    TANGENT_LINEAR(1),
    /**
     * The total number of available tangent modes.
     */
    TANGENT_MODE_COUNT(2),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TangentMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val getPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_count", 3905245786)

    public val setPointCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_count", 1286410249)

    public val addPointPtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "add_point", 434072736)

    public val removePointPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "remove_point", 1286410249)

    public val clearPointsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "clear_points", 3218959716)

    public val getPointPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_position", 2299179447)

    public val setPointValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_value", 1602489585)

    public val setPointOffsetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_offset", 3780573764)

    public val samplePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "sample", 3919130443)

    public val sampleBakedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "sample_baked", 3919130443)

    public val getPointLeftTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_left_tangent", 2339986948)

    public val getPointRightTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_right_tangent", 2339986948)

    public val getPointLeftModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_left_mode", 426950354)

    public val getPointRightModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_point_right_mode", 426950354)

    public val setPointLeftTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_left_tangent", 1602489585)

    public val setPointRightTangentPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_right_tangent", 1602489585)

    public val setPointLeftModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_left_mode", 1217242874)

    public val setPointRightModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_point_right_mode", 1217242874)

    public val getMinValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_min_value", 1740695150)

    public val setMinValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_min_value", 373806689)

    public val getMaxValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_max_value", 1740695150)

    public val setMaxValuePtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_max_value", 373806689)

    public val cleanDupesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "clean_dupes", 3218959716)

    public val bakePtr: VoidPtr = TypeManager.getMethodBindPtr("Curve", "bake", 3218959716)

    public val getBakeResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "get_bake_resolution", 3905245786)

    public val setBakeResolutionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("Curve", "set_bake_resolution", 1286410249)
  }
}
