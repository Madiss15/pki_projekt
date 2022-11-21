package de.uni_trier.wi2.pki.tree;

import java.util.HashMap;

/**
 * Class for representing a node in the decision tree.
 */
public class DecisionTreeNode {

    /**
     * The parent node in the decision tree.
     */
    protected DecisionTreeNode parent;

    /**
     * The attribute index to check.
     */
    protected int attributeIndex;

    /**
     * The checked split condition values and the nodes for these conditions.
     */
    HashMap<String, DecisionTreeNode> splits = new HashMap<>();

    public void setParent(DecisionTreeNode d){
        parent = d;
    }

    public DecisionTreeNode getParent(){
        return parent;
    }

    public void setAttributeIndex(int a){
        attributeIndex = a;
    }

    public int getAttributeIndex(){
        return attributeIndex;
    }

    public void  setSplits(String s, DecisionTreeNode d){
        splits.put(s, d);
    }

    public HashMap getSplits(){
        return splits;
    }
}

