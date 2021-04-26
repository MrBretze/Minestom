package net.minestom.server.instance;

public class ChunkCoordinate {
    private final int chunkX;
    private final int chunkZ;

    public ChunkCoordinate(int chunkX, int chunkZ) {
        this.chunkX = chunkX;
        this.chunkZ = chunkZ;
    }

    public ChunkCoordinate(Chunk chunk) {
        this.chunkX = chunk.getChunkX();
        this.chunkZ = chunk.getChunkZ();
    }

    public int getChunkX() {
        return chunkX;
    }

    public int getChunkZ() {
        return chunkZ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChunkCoordinate that = (ChunkCoordinate) o;

        if (getChunkX() != that.getChunkX()) return false;
        return getChunkZ() == that.getChunkZ();
    }

    @Override
    public int hashCode() {
        int result = getChunkX();
        result = 31 * result + getChunkZ();
        return result;
    }

    @Override
    public String toString() {
        return "ChunkCoordinate{" +
                "chunkX=" + chunkX +
                ", chunkZ=" + chunkZ +
                '}';
    }
}
