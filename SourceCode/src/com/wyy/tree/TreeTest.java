package com.wyy.tree;

import java.util.ArrayList;
import java.util.List;

/*
*
* Java实现树
*
* 用数组实现和用链表实现
*
* */

public class TreeTest {

    TreeNode[] tree = new TreeNode[10];
    List<LinkedTreeNode> linkedTree = new ArrayList<>();

}


class TreeNode{

    private Object mData;  //数据
    private int mParent;  //父节点下表

    public TreeNode(Object mData, int mParent) {
        this.mData = mData;
        this.mParent = mParent;
    }

    public Object getmData() {
        return mData;
    }

    public void setmData(Object mData) {
        this.mData = mData;
    }

    public int getmParent() {
        return mParent;
    }

    public void setmParent(int mParent) {
        this.mParent = mParent;
    }
}

class LinkedTreeNode{

    private Object mData;   //数据
    private LinkedTreeNode mParentNode;   //父节点
    private List<LinkedTreeNode> mChildNodeList;    //子节点

    public LinkedTreeNode(Object mData, LinkedTreeNode mParentNode) {
        this.mData = mData;
        this.mParentNode = mParentNode;
    }

    public Object getmData() {
        return mData;
    }

    public void setmData(Object mData) {
        this.mData = mData;
    }

    public LinkedTreeNode getmParentNode() {
        return mParentNode;
    }

    public void setmParentNode(LinkedTreeNode mParentNode) {
        this.mParentNode = mParentNode;
    }

    public List<LinkedTreeNode> getmChildNodeList() {
        return mChildNodeList;
    }

    public void setmChildNodeList(List<LinkedTreeNode> mChildNodeList) {
        this.mChildNodeList = mChildNodeList;
    }


}