// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit

/**
 * This CSG node allows you to use any mesh resource as a CSG shape, provided it is closed, does not
 * self-intersect, does not contain internal faces and has no edges that connect to more than two
 * faces. See also [CSGPolygon3D] for drawing 2D extruded polygons to be used as CSG nodes.
 * **Note:** CSG nodes are intended to be used for level prototyping. Creating CSG nodes has a
 * significant CPU cost compared to creating a [MeshInstance3D] with a [PrimitiveMesh]. Moving a CSG
 * node within another CSG node also has a significant CPU cost, so it should be avoided during
 * gameplay.
 */
@GodotBaseType
public open class CSGMesh3D : CSGPrimitive3D() {
  /**
   * The [Mesh] resource to use as a CSG shape.
   * **Note:** When using an [ArrayMesh], all vertex attributes except [Mesh.ARRAY_VERTEX],
   * [Mesh.ARRAY_NORMAL] and [Mesh.ARRAY_TEX_UV] are left unused. Only [Mesh.ARRAY_VERTEX] and
   * [Mesh.ARRAY_TEX_UV] will be passed to the GPU.
   * [Mesh.ARRAY_NORMAL] is only used to determine which faces require the use of flat shading. By
   * default, CSGMesh will ignore the mesh's vertex normals, recalculate them for each vertex and use a
   * smooth shader. If a flat shader is required for a face, ensure that all vertex normals of the face
   * are approximately equal.
   */
  public var mesh: Mesh?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMeshPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Mesh?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMeshPtr, NIL)
    }

  /**
   * The [Material] used in drawing the CSG shape.
   */
  public var material: Material?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaterialPtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Material?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMaterialPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_CSGMESH3D, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("CSGMesh3D", "set_mesh")

    public val getMeshPtr: VoidPtr = TypeManager.getMethodBindPtr("CSGMesh3D", "get_mesh")

    public val setMaterialPtr: VoidPtr = TypeManager.getMethodBindPtr("CSGMesh3D", "set_material")

    public val getMaterialPtr: VoidPtr = TypeManager.getMethodBindPtr("CSGMesh3D", "get_material")
  }
}
