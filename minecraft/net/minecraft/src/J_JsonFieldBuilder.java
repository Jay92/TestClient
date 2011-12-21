// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


// Referenced classes of package net.minecraft.src:
//            J_JsonNodeBuilder, J_JsonStringNode, J_JsonNode

final class J_JsonFieldBuilder
{

    private J_JsonNodeBuilder key;
    private J_JsonNodeBuilder valueBuilder;

    private J_JsonFieldBuilder()
    {
    }

    static J_JsonFieldBuilder aJsonFieldBuilder()
    {
        return new J_JsonFieldBuilder();
    }

    J_JsonFieldBuilder withKey(J_JsonNodeBuilder j_jsonnodebuilder)
    {
        key = j_jsonnodebuilder;
        return this;
    }

    J_JsonFieldBuilder withValue(J_JsonNodeBuilder j_jsonnodebuilder)
    {
        valueBuilder = j_jsonnodebuilder;
        return this;
    }

    J_JsonStringNode func_27303_b()
    {
        return (J_JsonStringNode)key.buildNode();
    }

    J_JsonNode buildValue()
    {
        return valueBuilder.buildNode();
    }
}
