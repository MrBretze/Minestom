package net.minestom.server.event.player;

import net.minestom.server.entity.Player;
import net.minestom.server.event.PlayerEvent;
import net.minestom.server.instance.ChunkCoordinate;
import org.jetbrains.annotations.NotNull;

/**
 * Called when a player receive a new chunk data.
 */
public class PlayerChunkLoadEvent extends PlayerEvent {

    private final ChunkCoordinate chunkCoordinate;

    public PlayerChunkLoadEvent(@NotNull Player player, ChunkCoordinate chunkCoordinate) {
        super(player);
        this.chunkCoordinate = chunkCoordinate;
    }

    /**
     * Gets the chunk X.
     *
     * @return the chunk X
     */
    public int getChunkX() {
        return chunkCoordinate.getChunkX();
    }

    /**
     * Gets the chunk Z.
     *
     * @return the chunk Z
     */
    public int getChunkZ() {
        return chunkCoordinate.getChunkZ();
    }

    /**
     * Gets the chunk coordinate
     *
     * @return the chunk coordinate
     */
    public ChunkCoordinate getChunkCoordinate() {
        return chunkCoordinate;
    }
}
