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
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * [RibbonTrailMesh] represents a straight ribbon-shaped mesh with variable width. The ribbon is
 * composed of a number of flat or cross-shaped sections, each with the same [sectionLength] and number
 * of [sectionSegments]. A [curve] is sampled along the total length of the ribbon, meaning that the
 * curve determines the size of the ribbon along its length.
 * This primitive mesh is usually used for particle trails.
 */
@GodotBaseType
public open class RibbonTrailMesh : PrimitiveMesh() {
  /**
   * Determines the shape of the ribbon.
   */
  public var shape: Shape
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getShapePtr, LONG)
      return RibbonTrailMesh.Shape.from(TransferContext.readReturnValue(LONG) as Long)
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.id)
      TransferContext.callMethod(rawPtr, MethodBindings.setShapePtr, NIL)
    }

  /**
   * The baseline size of the ribbon. The size of a particular section segment is obtained by
   * multiplying this size by the value of the [curve] at the given distance.
   */
  public var size: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSizePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSizePtr, NIL)
    }

  /**
   * The total number of sections on the ribbon.
   */
  public var sections: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSectionsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSectionsPtr, NIL)
    }

  /**
   * The length of a section of the ribbon.
   */
  public var sectionLength: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSectionLengthPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setSectionLengthPtr, NIL)
    }

  /**
   * The number of segments in a section. The [curve] is sampled on each segment to determine its
   * size. Higher values result in a more detailed ribbon at the cost of performance.
   */
  public var sectionSegments: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSectionSegmentsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setSectionSegmentsPtr, NIL)
    }

  /**
   * Determines the size of the ribbon along its length. The size of a particular section segment is
   * obtained by multiplying the baseline [size] by the value of this curve at the given distance. For
   * values smaller than `0`, the faces will be inverted.
   */
  public var curve: Curve?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getCurvePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Curve?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setCurvePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_RIBBONTRAILMESH, scriptIndex)
  }

  public enum class Shape(
    id: Long,
  ) {
    /**
     * Gives the mesh a single flat face.
     */
    SHAPE_FLAT(0),
    /**
     * Gives the mesh two perpendicular flat faces, making a cross shape.
     */
    SHAPE_CROSS(1),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): Shape = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val setSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_size", 373806689)

    public val getSizePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_size", 1740695150)

    public val setSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_sections", 1286410249)

    public val getSectionsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_sections", 3905245786)

    public val setSectionLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_section_length", 373806689)

    public val getSectionLengthPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_section_length", 1740695150)

    public val setSectionSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_section_segments", 1286410249)

    public val getSectionSegmentsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_section_segments", 3905245786)

    public val setCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_curve", 270443179)

    public val getCurvePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_curve", 2460114913)

    public val setShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "set_shape", 1684440262)

    public val getShapePtr: VoidPtr =
        TypeManager.getMethodBindPtr("RibbonTrailMesh", "get_shape", 1317484155)
  }
}
