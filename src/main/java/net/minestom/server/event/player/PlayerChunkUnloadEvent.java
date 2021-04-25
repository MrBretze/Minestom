package net.minestom.server.event.player;

import net.minestom.server.entity.Player;
import net.minestom.server.event.PlayerEvent;
import net.minestom.server.instance.ChunkCoordinate;
import org.jetbrains.annotations.NotNull;

/**
 * Called after a chunk being unload to a certain player.
 * <p>
 * Could be used to unload the chunk internally in order to save memory.
 */
public class PlayerChunkUnloadEvent extends PlayerEvent {

    private final ChunkCoordinate chunkCoordinate;

    public PlayerChunkUnloadEvent(@NotNull Player player, ChunkCoordinate chunkCoordinate) {
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
}
