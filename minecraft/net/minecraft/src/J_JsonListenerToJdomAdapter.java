// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) braces deadcode fieldsfirst 

package net.minecraft.src;

import java.util.Stack;

// Referenced classes of package net.minecraft.src:
//            J_JsonListener, J_JsonNodeBuilder, J_JsonRootNode, J_JsonNodeBuilders, 
//            J_ArrayNodeContainer, J_ObjectNodeContainer, J_JsonFieldBuilder, J_NodeContainer, 
//            J_FieldNodeContainer

final class J_JsonListenerToJdomAdapter
    implements J_JsonListener
{

    private final Stack stack = new Stack();
    private J_JsonNodeBuilder root;

    J_JsonListenerToJdomAdapter()
    {
    }

    J_JsonRootNode getDocument()
    {
        return (J_JsonRootNode)root.buildNode();
    }

    public void startDocument()
    {
    }

    public void endDocument()
    {
    }

    public void startArray()
    {
        J_JsonArrayNodeBuilder j_jsonarraynodebuilder = J_JsonNodeBuilders.anArrayBuilder();
        addRootNode(j_jsonarraynodebuilder);
        stack.push(new J_ArrayNodeContainer(this, j_jsonarraynodebuilder));
    }

    public void endArray()
    {
        stack.pop();
    }

    public void startObject()
    {
        J_JsonObjectNodeBuilder j_jsonobjectnodebuilder = J_JsonNodeBuilders.anObjectBuilder();
        addRootNode(j_jsonobjectnodebuilder);
        stack.push(new J_ObjectNodeContainer(this, j_jsonobjectnodebuilder));
    }

    public void endObject()
    {
        stack.pop();
    }

    public void startField(String s)
    {
        J_JsonFieldBuilder j_jsonfieldbuilder = J_JsonFieldBuilder.aJsonFieldBuilder().withKey(J_JsonNodeBuilders.func_27254_b(s));
        ((J_NodeContainer)stack.peek()).addField(j_jsonfieldbuilder);
        stack.push(new J_FieldNodeContainer(this, j_jsonfieldbuilder));
    }

    public void endField()
    {
        stack.pop();
    }

    public void numberValue(String s)
    {
        addValue(J_JsonNodeBuilders.func_27250_a(s));
    }

    public void trueValue()
    {
        addValue(J_JsonNodeBuilders.func_27251_b());
    }

    public void stringValue(String s)
    {
        addValue(J_JsonNodeBuilders.func_27254_b(s));
    }

    public void falseValue()
    {
        addValue(J_JsonNodeBuilders.func_27252_c());
    }

    public void nullValue()
    {
        addValue(J_JsonNodeBuilders.func_27248_a());
    }

    private void addRootNode(J_JsonNodeBuilder j_jsonnodebuilder)
    {
        if(root == null)
        {
            root = j_jsonnodebuilder;
        } else
        {
            addValue(j_jsonnodebuilder);
        }
    }

    private void addValue(J_JsonNodeBuilder j_jsonnodebuilder)
    {
        ((J_NodeContainer)stack.peek()).addNode(j_jsonnodebuilder);
    }
}
