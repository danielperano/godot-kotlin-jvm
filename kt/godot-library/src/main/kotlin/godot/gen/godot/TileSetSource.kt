// THIS FILE IS GENERATED! DO NOT EDIT IT MANUALLY!
@file:Suppress("PackageDirectoryMismatch", "unused", "FunctionName", "RedundantModalityModifier",
    "UNCHECKED_CAST", "JoinDeclarationAndAssignment", "USELESS_CAST",
    "RemoveRedundantQualifierName", "NOTHING_TO_INLINE", "NON_FINAL_MEMBER_IN_OBJECT",
    "RedundantVisibilityModifier", "RedundantUnitReturnType", "MemberVisibilityCanBePrivate")

package godot

import godot.`annotation`.GodotBaseType
import godot.core.TypeManager
import godot.core.VariantParser.BOOL
import godot.core.VariantParser.LONG
import godot.core.VariantParser.VECTOR2I
import godot.core.Vector2i
import godot.core.memory.TransferContext
import godot.util.VoidPtr
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit

/**
 * Exposes a set of tiles for a [TileSet] resource.
 * Tiles in a source are indexed with two IDs, coordinates ID (of type Vector2i) and an alternative
 * ID (of type int), named according to their use in the [TileSetAtlasSource] class.
 * Depending on the TileSet source type, those IDs might have restrictions on their values, this is
 * why the base [TileSetSource] class only exposes getters for them.
 * You can iterate over all tiles exposed by a TileSetSource by first iterating over coordinates IDs
 * using [getTilesCount] and [getTileId], then over alternative IDs using [getAlternativeTilesCount]
 * and [getAlternativeTileId].
 * **Warning:** [TileSetSource] can only be added to one TileSet at the same time. Calling
 * [TileSet.addSource] on a second [TileSet] will remove the source from the first one.
 */
@GodotBaseType
public open class TileSetSource internal constructor() : Resource() {
  public override fun new(scriptIndex: Int): Unit {
    callConstructor(ENGINECLASS_TILESETSOURCE, scriptIndex)
  }

  /**
   * Returns how many tiles this atlas source defines (not including alternative tiles).
   */
  public final fun getTilesCount(): Int {
    TransferContext.writeArguments()
    TransferContext.callMethod(rawPtr, MethodBindings.getTilesCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the tile coordinates ID of the tile with index [index].
   */
  public final fun getTileId(index: Int): Vector2i {
    TransferContext.writeArguments(LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getTileIdPtr, VECTOR2I)
    return (TransferContext.readReturnValue(VECTOR2I) as Vector2i)
  }

  /**
   * Returns if this atlas has a tile with coordinates ID [atlasCoords].
   */
  public final fun hasTile(atlasCoords: Vector2i): Boolean {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.hasTilePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  /**
   * Returns the number of alternatives tiles for the coordinates ID [atlasCoords].
   * For [TileSetAtlasSource], this always return at least 1, as the base tile with ID 0 is always
   * part of the alternatives list.
   * Returns -1 if there is not tile at the given coords.
   */
  public final fun getAlternativeTilesCount(atlasCoords: Vector2i): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords)
    TransferContext.callMethod(rawPtr, MethodBindings.getAlternativeTilesCountPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns the alternative ID for the tile with coordinates ID [atlasCoords] at index [index].
   */
  public final fun getAlternativeTileId(atlasCoords: Vector2i, index: Int): Int {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to index.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.getAlternativeTileIdPtr, LONG)
    return (TransferContext.readReturnValue(LONG) as Long).toInt()
  }

  /**
   * Returns if the base tile at coordinates [atlasCoords] has an alternative with ID
   * [alternativeTile].
   */
  public final fun hasAlternativeTile(atlasCoords: Vector2i, alternativeTile: Int): Boolean {
    TransferContext.writeArguments(VECTOR2I to atlasCoords, LONG to alternativeTile.toLong())
    TransferContext.callMethod(rawPtr, MethodBindings.hasAlternativeTilePtr, BOOL)
    return (TransferContext.readReturnValue(BOOL) as Boolean)
  }

  public companion object

  internal object MethodBindings {
    public val getTilesCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetSource", "get_tiles_count", 3905245786)

    public val getTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetSource", "get_tile_id", 880721226)

    public val hasTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetSource", "has_tile", 3900751641)

    public val getAlternativeTilesCountPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetSource", "get_alternative_tiles_count", 2485466453)

    public val getAlternativeTileIdPtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetSource", "get_alternative_tile_id", 89881719)

    public val hasAlternativeTilePtr: VoidPtr =
        TypeManager.getMethodBindPtr("TileSetSource", "has_alternative_tile", 1073731340)
  }
}
