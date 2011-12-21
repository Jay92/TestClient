// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.List;

// Referenced classes of package net.minecraft.src:
//            J_LeafFunctor, J_JsonNode

class J_JsonElementNodeSelector extends J_LeafFunctor
{

    final int index; /* synthetic field */

    J_JsonElementNodeSelector(int i)
    {
        index = i;
//        super();
    }

    public boolean matchesNode_(List list)
    {
        return list.size() > index;
    }

    public String shortForm()
    {
        return Integer.toString(index);
    }

    public J_JsonNode typeSafeApplyTo_(List list)
    {
        return (J_JsonNode)list.get(index);
    }

    public String toString()
    {
        return (new StringBuilder()).append("an element at index [").append(index).append("]").toString();
    }

    public Object typeSafeApplyTo(Object obj)
    {
        return typeSafeApplyTo_((List)obj);
    }

    public boolean matchesNode(Object obj)
    {
        return matchesNode_((List)obj);
    }
}
