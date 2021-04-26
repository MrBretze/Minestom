package net.minestom.server.utils.entity;

import net.minestom.server.MinecraftServer;
import net.minestom.server.entity.Entity;
import net.minestom.server.instance.Chunk;
import net.minestom.server.instance.ChunkCoordinate;
import net.minestom.server.instance.Instance;
import net.minestom.server.instance.block.Block;
import net.minestom.server.utils.BlockPosition;
import net.minestom.server.utils.Position;
import net.minestom.server.utils.chunk.ChunkUtils;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public final class EntityUtils {

    private EntityUtils() {

    }

    public static void forEachRange(@NotNull Instance instance, @NotNull Position position,
                                    int viewDistance,
                                    @NotNull Consumer<Entity> consumer) {
        final ChunkCoordinate[] chunksInRange = ChunkUtils.getChunksInRange(position, viewDistance);

        for (ChunkCoordinate chunkCoordinate : chunksInRange) {
            final Chunk chunk = instance.getChunk(chunkCoordinate);
            if (chunk == null)
                continue;
            instance.getChunkEntities(chunk).forEach(consumer);
        }
    }

    public static boolean areVisible(@NotNull Entity ent1, @NotNull Entity ent2) {
        if (ent1.getInstance() == null || ent2.getInstance() == null)
            return false;
        if (!ent1.getInstance().equals(ent2.getInstance()))
            return false;

        final Chunk chunk = ent1.getInstance().getChunkAt(ent1.getPosition());

        if (chunk == null)
            return false;

        final ChunkCoordinate[] visibleChunksEntity = ChunkUtils.getChunksInRange(ent2.getPosition(), MinecraftServer.getEntityViewDistance());
        for (ChunkCoordinate visibleChunk : visibleChunksEntity) {
            if (chunk.getChunkX() == visibleChunk.getChunkX() && chunk.getChunkZ() == visibleChunk.getChunkZ())
                return true;
        }

        return false;
    }

    public static boolean isOnGround(@NotNull Entity entity) {
        final Chunk chunk = entity.getChunk();
        if (chunk == null)
            return false;

        final Position entityPosition = entity.getPosition();

        // TODO: check entire bounding box
        final BlockPosition blockPosition = entityPosition.toBlockPosition().subtract(0, 1, 0);
        try {
            final short blockStateId = chunk.getBlockStateId(blockPosition.getX(),
                    blockPosition.getY(),
                    blockPosition.getZ());
            final Block block = Block.fromStateId(blockStateId);
            return block.isSolid();
        } catch (NullPointerException e) {
            // Probably an entity at the border of an unloaded chunk
            return false;
        }
    }

}
