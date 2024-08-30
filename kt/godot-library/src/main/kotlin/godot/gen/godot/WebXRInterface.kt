// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantArray
import godot.core.VariantType.ARRAY
import godot.core.VariantType.BOOL
import godot.core.VariantType.DOUBLE
import godot.core.VariantType.LONG
import godot.core.VariantType.NIL
import godot.core.VariantType.OBJECT
import godot.core.VariantType.STRING
import godot.core.memory.TransferContext
import godot.signals.Signal0
import godot.signals.Signal1
import godot.signals.Signal2
import godot.signals.signal
import godot.util.VoidPtr
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Suppress
import kotlin.Unit

/**
 * WebXR is an open standard that allows creating VR and AR applications that run in the web
 * browser.
 * As such, this interface is only available when running in Web exports.
 * WebXR supports a wide range of devices, from the very capable (like Valve Index, HTC Vive, Oculus
 * Rift and Quest) down to the much less capable (like Google Cardboard, Oculus Go, GearVR, or plain
 * smartphones).
 * Since WebXR is based on JavaScript, it makes extensive use of callbacks, which means that
 * [WebXRInterface] is forced to use signals, where other XR interfaces would instead use functions
 * that return a result immediately. This makes [WebXRInterface] quite a bit more complicated to
 * initialize than other XR interfaces.
 * Here's the minimum code required to start an immersive VR session:
 * [codeblock]
 * extends Node3D
 *
 * var webxr_interface
 * var vr_supported = false
 *
 * func _ready():
 *     # We assume this node has a button as a child.
 *     # This button is for the user to consent to entering immersive VR mode.
 *     $Button.pressed.connect(self._on_button_pressed)
 *
 *     webxr_interface = XRServer.find_interface("WebXR")
 *     if webxr_interface:
 *         # WebXR uses a lot of asynchronous callbacks, so we connect to various
 *         # signals in order to receive them.
 *         webxr_interface.session_supported.connect(self._webxr_session_supported)
 *         webxr_interface.session_started.connect(self._webxr_session_started)
 *         webxr_interface.session_ended.connect(self._webxr_session_ended)
 *         webxr_interface.session_failed.connect(self._webxr_session_failed)
 *
 *         # This returns immediately - our _webxr_session_supported() method
 *         # (which we connected to the "session_supported" signal above) will
 *         # be called sometime later to let us know if it's supported or not.
 *         webxr_interface.is_session_supported("immersive-vr")
 *
 * func _webxr_session_supported(session_mode, supported):
 *     if session_mode == 'immersive-vr':
 *         vr_supported = supported
 *
 * func _on_button_pressed():
 *     if not vr_supported:
 *         OS.alert("Your browser doesn't support VR")
 *         return
 *
 *     # We want an immersive VR session, as opposed to AR ('immersive-ar') or a
 *     # simple 3DoF viewer ('viewer').
 *     webxr_interface.session_mode = 'immersive-vr'
 *     # 'bounded-floor' is room scale, 'local-floor' is a standing or sitting
 *     # experience (it puts you 1.6m above the ground if you have 3DoF headset),
 *     # whereas as 'local' puts you down at the XROrigin.
 *     # This list means it'll first try to request 'bounded-floor', then
 *     # fallback on 'local-floor' and ultimately 'local', if nothing else is
 *     # supported.
 *     webxr_interface.requested_reference_space_types = 'bounded-floor, local-floor, local'
 *     # In order to use 'local-floor' or 'bounded-floor' we must also
 *     # mark the features as required or optional. By including 'hand-tracking'
 *     # as an optional feature, it will be enabled if supported.
 *     webxr_interface.required_features = 'local-floor'
 *     webxr_interface.optional_features = 'bounded-floor, hand-tracking'
 *
 *     # This will return false if we're unable to even request the session,
 *     # however, it can still fail asynchronously later in the process, so we
 *     # only know if it's really succeeded or failed when our
 *     # _webxr_session_started() or _webxr_session_failed() methods are called.
 *     if not webxr_interface.initialize():
 *         OS.alert("Failed to initialize")
 *         return
 *
 * func _webxr_session_started():
 *     $Button.visible = false
 *     # This tells Godot to start rendering to the headset.
 *     get_viewport().use_xr = true
 *     # This will be the reference space type you ultimately got, out of the
 *     # types that you requested above. This is useful if you want the game to
 *     # work a little differently in 'bounded-floor' versus 'local-floor'.
 *     print("Reference space type: ", webxr_interface.reference_space_type)
 *     # This will be the list of features that were successfully enabled
 *     # (except on browsers that don't support this property).
 *     print("Enabled features: ", webxr_interface.enabled_features)
 *
 * func _webxr_session_ended():
 *     $Button.visible = true
 *     # If the user exits immersive mode, then we tell Godot to render to the web
 *     # page again.
 *     get_viewport().use_xr = false
 *
 * func _webxr_session_failed(message):
 *     OS.alert("Failed to initialize: " + message)
 * [/codeblock]
 * There are a couple ways to handle "controller" input:
 * - Using [XRController3D] nodes and their [signal XRController3D.button_pressed] and [signal
 * XRController3D.button_released] signals. This is how controllers are typically handled in XR apps in
 * Godot, however, this will only work with advanced VR controllers like the Oculus Touch or Index
 * controllers, for example.
 * - Using the [signal select], [signal squeeze] and related signals. This method will work for both
 * advanced VR controllers, and non-traditional input sources like a tap on the screen, a spoken voice
 * command or a button press on the device itself.
 * You can use both methods to allow your game or app to support a wider or narrower set of devices
 * and input methods, or to allow more advanced interactions with more advanced devices.
 */
@GodotBaseType
public open class WebXRInterface internal constructor() : XRInterface() {
  /**
   * Emitted by [isSessionSupported] to indicate if the given [sessionMode] is supported or not.
   */
  public val sessionSupported: Signal2<String, Boolean> by signal("sessionMode", "supported")

  /**
   * Emitted by [XRInterface.initialize] if the session is successfully started.
   * At this point, it's safe to do `get_viewport().use_xr = true` to instruct Godot to start
   * rendering to the XR device.
   */
  public val sessionStarted: Signal0 by signal()

  /**
   * Emitted when the user ends the WebXR session (which can be done using UI from the browser or
   * device).
   * At this point, you should do `get_viewport().use_xr = false` to instruct Godot to resume
   * rendering to the screen.
   */
  public val sessionEnded: Signal0 by signal()

  /**
   * Emitted by [XRInterface.initialize] if the session fails to start.
   * [message] may optionally contain an error message from WebXR, or an empty string if no message
   * is available.
   */
  public val sessionFailed: Signal1<String> by signal("message")

  /**
   * Emitted when one of the input source has started its "primary action".
   * Use [getInputSourceTracker] and [getInputSourceTargetRayMode] to get more information about the
   * input source.
   */
  public val selectstart: Signal1<Long> by signal("inputSourceId")

  /**
   * Emitted after one of the input sources has finished its "primary action".
   * Use [getInputSourceTracker] and [getInputSourceTargetRayMode] to get more information about the
   * input source.
   */
  public val select: Signal1<Long> by signal("inputSourceId")

  /**
   * Emitted when one of the input sources has finished its "primary action".
   * Use [getInputSourceTracker] and [getInputSourceTargetRayMode] to get more information about the
   * input source.
   */
  public val selectend: Signal1<Long> by signal("inputSourceId")

  /**
   * Emitted when one of the input sources has started its "primary squeeze action".
   * Use [getInputSourceTracker] and [getInputSourceTargetRayMode] to get more information about the
   * input source.
   */
  public val squeezestart: Signal1<Long> by signal("inputSourceId")

  /**
   * Emitted after one of the input sources has finished its "primary squeeze action".
   * Use [getInputSourceTracker] and [getInputSourceTargetRayMode] to get more information about the
   * input source.
   */
  public val squeeze: Signal1<Long> by signal("inputSourceId")

  /**
   * Emitted when one of the input sources has finished its "primary squeeze action".
   * Use [getInputSourceTracker] and [getInputSourceTargetRayMode] to get more information about the
   * input source.
   */
  public val squeezeend: Signal1<Long> by signal("inputSourceId")

  /**
   * Emitted when [visibilityState] has changed.
   */
  public val visibilityStateChanged: Signal0 by signal()

  /**
   * Emitted to indicate that the reference space has been reset or reconfigured.
   * When (or whether) this is emitted depends on the user's browser or device, but may include when
   * the user has changed the dimensions of their play space (which you may be able to access via
   * [XRInterface.getPlayArea]) or pressed/held a button to recenter their position.
   * See [url=https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpace/reset_event]WebXR's
   * XRReferenceSpace reset event[/url] for more information.
   */
  public val referenceSpaceReset: Signal0 by signal()

  /**
   * Emitted after the display's refresh rate has changed.
   */
  public val displayRefreshRateChanged: Signal0 by signal()

  /**
   * The session mode used by [XRInterface.initialize] when setting up the WebXR session.
   * This doesn't have any effect on the interface when already initialized.
   * Possible values come from
   * [url=https://developer.mozilla.org/en-US/docs/Web/API/XRSessionMode]WebXR's XRSessionMode[/url],
   * including: `"immersive-vr"`, `"immersive-ar"`, and `"inline"`.
   */
  public var sessionMode: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getSessionModePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setSessionModePtr, NIL)
    }

  /**
   * A comma-seperated list of required features used by [XRInterface.initialize] when setting up
   * the WebXR session.
   * If a user's browser or device doesn't support one of the given features, initialization will
   * fail and [signal session_failed] will be emitted.
   * This doesn't have any effect on the interface when already initialized.
   * Possible values come from
   * [url=https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceType]WebXR's
   * XRReferenceSpaceType[/url], or include other features like `"hand-tracking"` to enable hand
   * tracking.
   */
  public var requiredFeatures: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRequiredFeaturesPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRequiredFeaturesPtr, NIL)
    }

  /**
   * A comma-seperated list of optional features used by [XRInterface.initialize] when setting up
   * the WebXR session.
   * If a user's browser or device doesn't support one of the given features, initialization will
   * continue, but you won't be able to use the requested feature.
   * This doesn't have any effect on the interface when already initialized.
   * Possible values come from
   * [url=https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceType]WebXR's
   * XRReferenceSpaceType[/url], or include other features like `"hand-tracking"` to enable hand
   * tracking.
   */
  public var optionalFeatures: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getOptionalFeaturesPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setOptionalFeaturesPtr, NIL)
    }

  /**
   * A comma-seperated list of reference space types used by [XRInterface.initialize] when setting
   * up the WebXR session.
   * The reference space types are requested in order, and the first one supported by the users
   * device or browser will be used. The [referenceSpaceType] property contains the reference space
   * type that was ultimately selected.
   * This doesn't have any effect on the interface when already initialized.
   * Possible values come from
   * [url=https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceType]WebXR's
   * XRReferenceSpaceType[/url]. If you want to use a particular reference space type, it must be
   * listed in either [requiredFeatures] or [optionalFeatures].
   */
  public var requestedReferenceSpaceTypes: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getRequestedReferenceSpaceTypesPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }
    set(`value`) {
      TransferContext.writeArguments(STRING to value)
      TransferContext.callMethod(rawPtr, MethodBindings.setRequestedReferenceSpaceTypesPtr, NIL)
    }

  /**
   * The reference space type (from the list of requested types set in the
   * [requestedReferenceSpaceTypes] property), that was ultimately used by [XRInterface.initialize]
   * when setting up the WebXR session.
   * Possible values come from
   * [url=https://developer.mozilla.org/en-US/docs/Web/API/XRReferenceSpaceType]WebXR's
   * XRReferenceSpaceType[/url]. If you want to use a particular reference space type, it must be
   * listed in either [requiredFeatures] or [optionalFeatures].
   */
  public val referenceSpaceType: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getReferenceSpaceTypePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

  /**
   * A comma-separated list of features that were successfully enabled by [XRInterface.initialize]
   * when setting up the WebXR session.
   * This may include features requested by setting [requiredFeatures] and [optionalFeatures], and
   * will only be available after [signal session_started] has been emitted.
   * **Note:** This may not be support by all web browsers, in which case it will be an empty
   * string.
   */
  public val enabledFeatures: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getEnabledFeaturesPtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

  /**
   * Indicates if the WebXR session's imagery is visible to the user.
   * Possible values come from
   * [url=https://developer.mozilla.org/en-US/docs/Web/API/XRVisibilityState]WebXR's
   * XRVisibilityState[/url], including `"hidden"`, `"visible"`, and `"visible-blurred"`.
   */
  public val visibilityState: String
    get() {
      TransferContext.writeArguments()
      TransferContext.callMethod(rawPtr, MethodBindings.getVisibilityStatePtr, STRING)
      return (TransferContext.readReturnValue(STRING, false) as String)
    }

  public override fun new(scriptIndex: Int): Boolean {
    callConstructor(ENGINECLASS_WEBXRINTERFACE, scriptIndex)
    return true
  }

  /**
   * Checks if the given [sessionMode] is supported by the user's browser.
   * Possible values come from
   * [url=https://developer.mozilla.org/en-US/docs/Web/API/XRSessionMode]WebXR's XRSessionMode[/url],
   * including: `"immersive-vr"`, `"immersive-ar"`, and `"inline"`.
   * This method returns nothing, instead it emits the [signal session_supported] signal with the
   * result.
   */
  public fun isSessionSupported(sessionMode: String): Unit {
    TransferContext.writeArguments(STRING to sessionMode)
    TransferContext.callMethod(rawPtr, MethodBindings.isSessionSupportedPtr, NIL)
  }

  /**
   * Returns `true` if there is an active input source with the given [inputSourceId].
   */
  public fun isInputSourceActive(inputSourceId: Int): Boolean {
    TransferContext.writeArguments(LONG to inputSourceId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.isInputSourceActivePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL, false) as Boolean)
  }

  /**
   * Gets an [XRControllerTracker] for the given [inputSourceId].
   * In the context of WebXR, an input source can be an advanced VR controller like the Oculus Touch
   * or Index controllers, or even a tap on the screen, a spoken voice command or a button press on the
   * device itself. When a non-traditional input source is used, interpret the position and orientation
   * of the [XRPositionalTracker] as a ray pointing at the object the user wishes to interact with.
   * Use this method to get information about the input source that triggered one of these signals:
   * - [signal selectstart]
   * - [signal select]
   * - [signal selectend]
   * - [signal squeezestart]
   * - [signal squeeze]
   * - [signal squeezestart]
   */
  public fun getInputSourceTracker(inputSourceId: Int): XRControllerTracker? {
    TransferContext.writeArguments(LONG to inputSourceId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputSourceTrackerPtr, OBJECT)
    return (TransferContext.readReturnValue(OBJECT, true) as XRControllerTracker?)
  }

  /**
   * Returns the target ray mode for the given [inputSourceId].
   * This can help interpret the input coming from that input source. See
   * [url=https://developer.mozilla.org/en-US/docs/Web/API/XRInputSource/targetRayMode]XRInputSource.targetRayMode[/url]
   * for more information.
   */
  public fun getInputSourceTargetRayMode(inputSourceId: Int): TargetRayMode {
    TransferContext.writeArguments(LONG to inputSourceId.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getInputSourceTargetRayModePtr, LONG)
    return WebXRInterface.TargetRayMode.from(TransferContext.readReturnValue(LONG) as Long)
  }

  /**
   * Returns the display refresh rate for the current HMD. Not supported on all HMDs and browsers.
   * It may not report an accurate value until after using [setDisplayRefreshRate].
   */
  public fun getDisplayRefreshRate(): Float {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getDisplayRefreshRatePtr, DOUBLE)
    return (TransferContext.readReturnValue(DOUBLE, false) as Double).toFloat()
  }

  /**
   * Sets the display refresh rate for the current HMD. Not supported on all HMDs and browsers. It
   * won't take effect right away until after [signal display_refresh_rate_changed] is emitted.
   */
  public fun setDisplayRefreshRate(refreshRate: Float): Unit {
    TransferContext.writeArguments(DOUBLE to refreshRate.toDouble())
    TransferContext.callMethod(rawPtr, MethodBindings.setDisplayRefreshRatePtr, NIL)
  }

  /**
   * Returns display refresh rates supported by the current HMD. Only returned if this feature is
   * supported by the web browser and after the interface has been initialized.
   */
  public fun getAvailableDisplayRefreshRates(): VariantArray<Any?> {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getAvailableDisplayRefreshRatesPtr, ARRAY)
    return (TransferContext.readReturnValue(ARRAY, false) as VariantArray<Any?>)
  }

  public enum class TargetRayMode(
    id: Long,
  ) {
    /**
     * We don't know the the target ray mode.
     */
    TARGET_RAY_MODE_UNKNOWN(0),
    /**
     * Target ray originates at the viewer's eyes and points in the direction they are looking.
     */
    TARGET_RAY_MODE_GAZE(1),
    /**
     * Target ray from a handheld pointer, most likely a VR touch controller.
     */
    TARGET_RAY_MODE_TRACKED_POINTER(2),
    /**
     * Target ray from touch screen, mouse or other tactile input device.
     */
    TARGET_RAY_MODE_SCREEN(3),
    ;

    public val id: Long
    init {
      this.id = id
    }

    public companion object {
      public fun from(`value`: Long): TargetRayMode = entries.single { it.id == `value` }
    }
  }

  public companion object

  internal object MethodBindings {
    public val isSessionSupportedPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "is_session_supported")

    public val setSessionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "set_session_mode")

    public val getSessionModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_session_mode")

    public val setRequiredFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "set_required_features")

    public val getRequiredFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_required_features")

    public val setOptionalFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "set_optional_features")

    public val getOptionalFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_optional_features")

    public val getReferenceSpaceTypePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_reference_space_type")

    public val getEnabledFeaturesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_enabled_features")

    public val setRequestedReferenceSpaceTypesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "set_requested_reference_space_types")

    public val getRequestedReferenceSpaceTypesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_requested_reference_space_types")

    public val isInputSourceActivePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "is_input_source_active")

    public val getInputSourceTrackerPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_input_source_tracker")

    public val getInputSourceTargetRayModePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_input_source_target_ray_mode")

    public val getVisibilityStatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_visibility_state")

    public val getDisplayRefreshRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_display_refresh_rate")

    public val setDisplayRefreshRatePtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "set_display_refresh_rate")

    public val getAvailableDisplayRefreshRatesPtr: VoidPtr =
        TypeManager.getMethodBindPtr("WebXRInterface", "get_available_display_refresh_rates")
  }
}
