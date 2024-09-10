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
 * Performs a lookup operation on the provided texture, with support for multiple texture sources to
 * choose from.
 */
@GodotBaseType
public open class VisualShaderNodeTexture3D : VisualShaderNodeSample3D() {
  /**
   * A source texture. Used if [VisualShaderNodeSample3D.source] is set to
   * [VisualShaderNodeSample3D.SOURCE_TEXTURE].
   */
  public var texture: Texture3D?
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTexturePtr, OBJECT)
      return (TransferContext.readReturnValue(OBJECT, true) as Texture3D?)
    }
    set(`value`) {
      TransferContext.writeArguments(OBJECT to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTexturePtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_VISUALSHADERNODETEXTURE3D, scriptIndex)
  }

  public companion object

  internal object MethodBindings {
    public val setTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture3D", "set_texture", 1188404210)

    public val getTexturePtr: VoidPtr =
        TypeManager.getMethodBindPtr("VisualShaderNodeTexture3D", "get_texture", 373985333)
  }
}
