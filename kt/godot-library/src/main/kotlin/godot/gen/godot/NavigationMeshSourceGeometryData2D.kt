// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.PackedVector2Array
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.PACKED_VECTOR2_ARRAY
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * Container for parsed source geometry data used in navigation mesh baking.
 */
@GodotBaseType
public open class NavigationMeshSourceGeometryData2D : Resource() {
  public var traversableOutlines: VariantArray<PackedVector2Array>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTraversableOutlinesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTraversableOutlinesPtr, NIL)
    }

  public var obstructionOutlines: VariantArray<PackedVector2Array>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getObstructionOutlinesPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<PackedVector2Array>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setObstructionOutlinesPtr, NIL)
    }

  public var projectedObstructions: VariantArray<Any?>
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getProjectedObstructionsPtr, ARRAY)
      return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
    }
    set(`value`) {
      TransferContext.writeArguments(ARRAY to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setProjectedObstructionsPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_NAVIGATIONMESHSOURCEGEOMETRYDATA2D, scriptIndex)
  }

  /**
   * Clears the internal data.
   */
  public fun clear(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearPtr, NIL)
  }

  /**
   * Returns `true` when parsed source geometry data exists.
   */
  public fun hasData(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.hasDataPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Appends another array of [traversableOutlines] at the end of the existing traversable outlines
   * array.
   */
  public fun appendTraversableOutlines(traversableOutlines: VariantArray<PackedVector2Array>):
      Unit {
    TransferContext.writeArguments(ARRAY to traversableOutlines)
    TransferContext.callMethod(rawPtr, MethodBindings.appendTraversableOutlinesPtr, NIL)
  }

  /**
   * Appends another array of [obstructionOutlines] at the end of the existing obstruction outlines
   * array.
   */
  public fun appendObstructionOutlines(obstructionOutlines: VariantArray<PackedVector2Array>):
      Unit {
    TransferContext.writeArguments(ARRAY to obstructionOutlines)
    TransferContext.callMethod(rawPtr, MethodBindings.appendObstructionOutlinesPtr, NIL)
  }

  /**
   * Adds the outline points of a shape as traversable area.
   */
  public fun addTraversableOutline(shapeOutline: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to shapeOutline)
    TransferContext.callMethod(rawPtr, MethodBindings.addTraversableOutlinePtr, NIL)
  }

  /**
   * Adds the outline points of a shape as obstructed area.
   */
  public fun addObstructionOutline(shapeOutline: PackedVector2Array): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to shapeOutline)
    TransferContext.callMethod(rawPtr, MethodBindings.addObstructionOutlinePtr, NIL)
  }

  /**
   * Adds the geometry data of another [NavigationMeshSourceGeometryData2D] to the navigation mesh
   * baking data.
   */
  public fun merge(otherGeometry: NavigationMeshSourceGeometryData2D): Unit {
    TransferContext.writeArguments(OBJECT to otherGeometry)
    TransferContext.callMethod(rawPtr, MethodBindings.mergePtr, NIL)
  }

  /**
   * Adds a projected obstruction shape to the source geometry. If [carve] is `true` the carved
   * shape will not be affected by additional offsets (e.g. agent radius) of the navigation mesh baking
   * process.
   */
  public fun addProjectedObstruction(vertices: PackedVector2Array, carve: Boolean): Unit {
    TransferContext.writeArguments(PACKED_VECTOR2_ARRAY to vertices, BOOL to carve)
    TransferContext.callMethod(rawPtr, MethodBindings.addProjectedObstructionPtr, NIL)
  }

  /**
   * Clears all projected obstructions.
   */
  public fun clearProjectedObstructions(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.clearProjectedObstructionsPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val clearPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "clear")

    public val hasDataPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "has_data")

    public val setTraversableOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "set_traversable_outlines")

    public val getTraversableOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "get_traversable_outlines")

    public val setObstructionOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "set_obstruction_outlines")

    public val getObstructionOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "get_obstruction_outlines")

    public val appendTraversableOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "append_traversable_outlines")

    public val appendObstructionOutlinesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "append_obstruction_outlines")

    public val addTraversableOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "add_traversable_outline")

    public val addObstructionOutlinePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "add_obstruction_outline")

    public val mergePtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "merge")

    public val addProjectedObstructionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "add_projected_obstruction")

    public val clearProjectedObstructionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "clear_projected_obstructions")

    public val setProjectedObstructionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "set_projected_obstructions")

    public val getProjectedObstructionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("NavigationMeshSourceGeometryData2D", "get_projected_obstructions")
  }
}
