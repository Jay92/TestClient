// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            J_JsonNodeBuilder, J_JsonNodeFactories, J_JsonNode

class J_JsonNullNodeBuilder
    implements J_JsonNodeBuilder
{

    J_JsonNullNodeBuilder()
    {
    }

    public J_JsonNode buildNode()
    {
        return J_JsonNodeFactories.aJsonNull();
    }
}