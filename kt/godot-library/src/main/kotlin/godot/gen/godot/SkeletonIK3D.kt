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
import godot.core.StringName
import godot.core.Transform3D
import godot.core.TypeManager
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.NODE_PATH
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING_NAME
import godot.core.VariantType.TRANSFORM3D
import godot.core.VariantType.VECTOR3
import godot.core.Vector3
import godot.core.memory.TransferContext
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
 * SkeletonIK3D is used to rotate all bones of a [Skeleton3D] bone chain a way that places the end
 * bone at a desired 3D position. A typical scenario for IK in games is to place a character's feet on
 * the ground or a character's hands on a currently held object. SkeletonIK uses FabrikInverseKinematic
 * internally to solve the bone chain and applies the results to the [Skeleton3D]
 * `bones_global_pose_override` property for all affected bones in the chain. If fully applied, this
 * overwrites any bone transform from [Animation]s or bone custom poses set by users. The applied
 * amount can be controlled with the [SkeletonModifier3D.influence] property.
 * [codeblock]
 * # Apply IK effect automatically on every new frame (not the current)
 * skeleton_ik_node.start()
 *
 * # Apply IK effect only on the current frame
 * skeleton_ik_node.start(true)
 *
 * # Stop IK effect and reset bones_global_pose_override on Skeleton
 * skeleton_ik_node.stop()
 *
 * # Apply full IK effect
 * skeleton_ik_node.set_influence(1.0)
 *
 * # Apply half IK effect
 * skeleton_ik_node.set_influence(0.5)
 *
 * # Apply zero IK effect (a value at or below 0.01 also removes bones_global_pose_override on
 * Skeleton)
 * skeleton_ik_node.set_influence(0.0)
 * [/codeblock]
 */
@GodotBaseType
public open class SkeletonIK3D : SkeletonModifier3D() {
  /**
   * The name of the current root bone, the first bone in the IK chain.
   */
  public var rootBone: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRootBonePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRootBonePtr, NIL)
    }

  /**
   * The name of the current tip bone, the last bone in the IK chain placed at the [target]
   * transform (or [targetNode] if defined).
   */
  public var tipBone: StringName
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTipBonePtr, STRING_NAME)
      return (TransferContext.readReturnValue(STRING_NAME, false) as StringName)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING_NAME to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTipBonePtr, NIL)
    }

  /**
   * First target of the IK chain where the tip bone is placed and, if [overrideTipBasis] is `true`,
   * how the tip bone is rotated. If a [targetNode] path is available the nodes transform is used
   * instead and this property is ignored.
   */
  @CoreTypeLocalCopy
  public var target: Transform3D
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetTransformPtr, TRANSFORM3D)
      return (TransferContext.readReturnValue(TRANSFORM3D, false) as Transform3D)
    }
    set(`value`) {
      TransferContext.writeArguments(TRANSFORM3D to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetTransformPtr, NIL)
    }

  /**
   * If `true` overwrites the rotation of the tip bone with the rotation of the [target] (or
   * [targetNode] if defined).
   */
  public var overrideTipBasis: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isOverrideTipBasisPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOverrideTipBasisPtr, NIL)
    }

  /**
   * If `true`, instructs the IK solver to consider the secondary magnet target (pole target) when
   * calculating the bone chain. Use the magnet position (pole target) to control the bending of the IK
   * chain.
   */
  public var useMagnet: Boolean
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.isUsingMagnetPtr, BOOL)
      return (TransferContext.readReturnValue(BOOL, false) as Boolean)
    }
    set(`value`) {
      TransferContext.writeArguments(BOOL to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setUseMagnetPtr, NIL)
    }

  /**
   * Secondary target position (first is [target] property or [targetNode]) for the IK chain. Use
   * magnet position (pole target) to control the bending of the IK chain. Only works if the bone chain
   * has more than 2 bones. The middle chain bone position will be linearly interpolated with the
   * magnet position.
   */
  @CoreTypeLocalCopy
  public var magnet: Vector3
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMagnetPositionPtr, VECTOR3)
      return (TransferContext.readReturnValue(VECTOR3, false) as Vector3)
    }
    set(`value`) {
      TransferContext.writeArguments(VECTOR3 to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setMagnetPositionPtr, NIL)
    }

  /**
   * Target node [NodePath] for the IK chain. If available, the node's current [Transform3D] is used
   * instead of the [target] property.
   */
  public var targetNode: NodePath
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getTargetNodePtr, NODE_PATH)
      return (TransferContext.readReturnValue(NODE_PATH, false) as NodePath)
    }
    set(`value`) {
      TransferContext.writeArguments(NODE_PATH to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setTargetNodePtr, NIL)
    }

  /**
   * The minimum distance between bone and goal target. If the distance is below this value, the IK
   * solver stops further iterations.
   */
  public var minDistance: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMinDistancePtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setMinDistancePtr, NIL)
    }

  /**
   * Number of iteration loops used by the IK solver to produce more accurate (and elegant) bone
   * chain results.
   */
  public var maxIterations: Int
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getMaxIterationsPtr, LONG)
      return (TransferContext.readReturnValue(LONG, false) as Long).toInt()
    }
    set(`value`) {
      TransferContext.writeArguments(LONG to value.toLong())
      TransferContext.callMethod(rawPtr, MethodBindings.setMaxIterationsPtr, NIL)
    }

  /**
   * Interpolation value for how much the IK results are applied to the current skeleton bone chain.
   * A value of `1.0` will overwrite all skeleton bone transforms completely while a value of `0.0`
   * will visually disable the SkeletonIK.
   */
  public var interpolation: Float
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getInterpolationPtr, DOUBLE)
      return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
    }
    set(`value`) {
      TransferContext.writeArguments(DOUBLE to value.toDouble())
      TransferContext.callMethod(rawPtr, MethodBindings.setInterpolationPtr, NIL)
    }

  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_SKELETONIK3D, scriptIndex)
  }

  /**
   * First target of the IK chain where the tip bone is placed and, if [overrideTipBasis] is `true`,
   * how the tip bone is rotated. If a [targetNode] path is available the nodes transform is used
   * instead and this property is ignored.
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
   * val myCoreType = skeletonik3d.target
   * //Your changes
   * skeletonik3d.target = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun targetMutate(block: Transform3D.() -> Unit): Transform3D = target.apply{
      block(this)
      target = this
  }


  /**
   * Secondary target position (first is [target] property or [targetNode]) for the IK chain. Use
   * magnet position (pole target) to control the bending of the IK chain. Only works if the bone chain
   * has more than 2 bones. The middle chain bone position will be linearly interpolated with the
   * magnet position.
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
   * val myCoreType = skeletonik3d.magnet
   * //Your changes
   * skeletonik3d.magnet = myCoreType
   * ``````
   */
  @CoreTypeHelper
  public open fun magnetMutate(block: Vector3.() -> Unit): Vector3 = magnet.apply{
      block(this)
      magnet = this
  }


  /**
   * Returns the parent [Skeleton3D] Node that was present when SkeletonIK entered the [SceneTree].
   * Returns null if the parent node was not a [Skeleton3D] Node when SkeletonIK3D entered the
   * [SceneTree].
   */
  public fun getParentSkeleton(): Skeleton3D? {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getParentSkeletonPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as Skeleton3D?)
  }

  /**
   * Returns `true` if SkeletonIK is applying IK effects on continues frames to the [Skeleton3D]
   * bones. Returns `false` if SkeletonIK is stopped or [start] was used with the `one_time` parameter
   * set to `true`.
   */
  public fun isRunning(): Boolean {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.isRunningPtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Starts applying IK effects on each frame to the [Skeleton3D] bones but will only take effect
   * starting on the next frame. If [oneTime] is `true`, this will take effect immediately but also
   * reset on the next frame.
   */
  @JvmOverloads
  public fun start(oneTime: Boolean = false): Unit {
    TransferContext.writeArguments(BOOL to oneTime)
    TransferContext.callMethod(rawPtr, MethodBindings.startPtr, NIL)
  }

  /**
   * Stops applying IK effects on each frame to the [Skeleton3D] bones and also calls
   * [Skeleton3D.clearBonesGlobalPoseOverride] to remove existing overrides on all bones.
   */
  public fun stop(): Unit {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.stopPtr, NIL)
  }

  public companion object

  internal object MethodBindings {
    public val setRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_root_bone", 3304788590)

    public val getRootBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_root_bone", 2002593661)

    public val setTipBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_tip_bone", 3304788590)

    public val getTipBonePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_tip_bone", 2002593661)

    public val setTargetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_target_transform", 2952846383)

    public val getTargetTransformPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_target_transform", 3229777777)

    public val setTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_target_node", 1348162250)

    public val getTargetNodePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_target_node", 277076166)

    public val setOverrideTipBasisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_override_tip_basis", 2586408642)

    public val isOverrideTipBasisPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "is_override_tip_basis", 36873697)

    public val setUseMagnetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_use_magnet", 2586408642)

    public val isUsingMagnetPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "is_using_magnet", 36873697)

    public val setMagnetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_magnet_position", 3460891852)

    public val getMagnetPositionPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_magnet_position", 3360562783)

    public val getParentSkeletonPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_parent_skeleton", 1488626673)

    public val isRunningPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "is_running", 2240911060)

    public val setMinDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_min_distance", 373806689)

    public val getMinDistancePtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_min_distance", 1740695150)

    public val setMaxIterationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_max_iterations", 1286410249)

    public val getMaxIterationsPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_max_iterations", 3905245786)

    public val startPtr: VoidPtr = TypeManager.getMethodBindPtr("SkeletonIK3D", "start", 107499316)

    public val stopPtr: VoidPtr = TypeManager.getMethodBindPtr("SkeletonIK3D", "stop", 3218959716)

    public val setInterpolationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "set_interpolation", 373806689)

    public val getInterpolationPtr: VoidPtr =
        TypeManager.getMethodBindPtr("SkeletonIK3D", "get_interpolation", 1740695150)
  }
}
