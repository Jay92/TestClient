// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;


public interface J_JsonListener
{

    public abstract void startDocument();

    public abstract void endDocument();

    public abstract void startArray();

    public abstract void endArray();

    public abstract void startObject();

    public abstract void endObject();

    public abstract void startField(String s);

    public abstract void endField();

    public abstract void stringValue(String s);

    public abstract void numberValue(String s);

    public abstract void trueValue();

    public abstract void falseValue();

    public abstract void nullValue();
}
