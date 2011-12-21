// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            BiomeGenBase, BiomeCache, WorldChunkManager

public class BiomeCacheBlock
{

    public float temperatureValues[];
    public float rainfallValues[];
    public BiomeGenBase biomes[];
    public int xPosition;
    public int zPosition;
    public long lastAccessTime;
    final BiomeCache field_35654_g; /* synthetic field */

    public BiomeCacheBlock(BiomeCache biomecache, int i, int j)
    {
        field_35654_g = biomecache;
//        super();
        temperatureValues = new float[256];
        rainfallValues = new float[256];
        biomes = new BiomeGenBase[256];
        xPosition = i;
        zPosition = j;
        BiomeCache.getWorldChunkManager(biomecache).getTemperatures(temperatureValues, i << 4, j << 4, 16, 16);
        BiomeCache.getWorldChunkManager(biomecache).getRainfall(rainfallValues, i << 4, j << 4, 16, 16);
        BiomeCache.getWorldChunkManager(biomecache).func_35555_a(biomes, i << 4, j << 4, 16, 16, false);
    }

    public BiomeGenBase func_35651_a(int i, int j)
    {
        return biomes[i & 0xf | (j & 0xf) << 4];
    }

    public float func_35650_b(int i, int j)
    {
        return temperatureValues[i & 0xf | (j & 0xf) << 4];
    }

    public float func_35652_c(int i, int j)
    {
        return rainfallValues[i & 0xf | (j & 0xf) << 4];
    }
}
