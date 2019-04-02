package com.wyy.tree;

public class BinaryTreeTest {



}


class BinaryTreeNode{

    private Object mdata;
    private BinaryTreeNode mLeftChild;
    private BinaryTreeNode mRightChild;

    public BinaryTreeNode(Object mdata, BinaryTreeNode mLeftChild, BinaryTreeNode mRightChild) {
        this.mdata = mdata;
        this.mLeftChild = mLeftChild;
        this.mRightChild = mRightChild;
    }

    public Object getMdata() {
        return mdata;
    }

    public void setMdata(Object mdata) {
        this.mdata = mdata;
    }

    public BinaryTreeNode getmLeftChild() {
        return mLeftChild;
    }

    public void setmLeftChild(BinaryTreeNode mLeftChild) {
        this.mLeftChild = mLeftChild;
    }

    public BinaryTreeNode getmRightChild() {
        return mRightChild;
    }

    public void setmRightChild(BinaryTreeNode mRightChild) {
        this.mRightChild = mRightChild;
    }
}

class BinaryTreeArrayNode{

    private Object mData;
    private int mLeftChild;
    private int mRigthCHild;

    public BinaryTreeArrayNode(Object mData, int mLeftChild, int mRigthCHild) {
        this.mData = mData;
        this.mLeftChild = mLeftChild;
        this.mRigthCHild = mRigthCHild;
    }


    public Object getmData() {
        return mData;
    }

    public void setmData(Object mData) {
        this.mData = mData;
    }

    public int getmLeftChild() {
        return mLeftChild;
    }

    public void setmLeftChild(int mLeftChild) {
        this.mLeftChild = mLeftChild;
    }

    public int getmRigthCHild() {
        return mRigthCHild;
    }

    public void setmRigthCHild(int mRigthCHild) {
        this.mRigthCHild = mRigthCHild;
    }
}

class BinaryTree{

    private BinaryTreeNode mRoot;

    public void iterateLastOrder(BinaryTreeNode node){
        if(node == null){
            return;
        }
        iterateFirstOrder(node.getmLeftChild());
        iterateFirstOrder(node.getmRightChild());
        operate(node);
    }

    public void iterateMediumOrder(BinaryTreeNode node){
        if(node == null){
            return;
        }
        iterateFirstOrder(node.getmLeftChild());
        operate(node);
        iterateFirstOrder(node.getmRightChild());
    }

    public void iterateFirstOrder(BinaryTreeNode node){
        if(node == null){
            return;
        }
        operate(node);
        iterateFirstOrder(node.getmLeftChild());
        iterateFirstOrder(node.getmRightChild());
    }

    public void operate(BinaryTreeNode node){
        if(node == null){
            return;
        }
        System.out.println(node.getMdata());
    }

    public BinaryTreeNode getParnet(BinaryTreeNode node){
        if(node == null || mRoot == null || mRoot == node){
            return null;
        } else {
            return getParent(mRoot,node);
        }
    }

    public BinaryTreeNode getParent(BinaryTreeNode subTree, BinaryTreeNode node){

        if(subTree == null){
            return null;
        }

        if(subTree.getmLeftChild() == node || subTree.getmRightChild() == node){
            return subTree;
        }

        BinaryTreeNode parent;
        if((parent = getParent(subTree.getmLeftChild(),node)) != null){
            return parent;
        } else {
            return getParent(subTree.getmRightChild(),node);
        }
    }

    public int getTreeSize(){
        return getChildSize(mRoot);
    }

    public int getChildSize(BinaryTreeNode node){
        if(node == null){
            return 0;
        }

        int leftChildSize = getChildSize(node.getmLeftChild());
        int rigthChildSize = getChildSize(node.getmRightChild());

        return leftChildSize + rigthChildSize + 1;
    }

    public int getTreeHeight() {
        return getHeight(mRoot);
    }

    public int getHeight(BinaryTreeNode node){
        if(node == null){
            return 0;
        }

        int leftChildHeight = getHeight(node.getmLeftChild());
        int rigthChildHeight = getHeight(node.getmRightChild());

        int maxHeight = Math.max(leftChildHeight,rigthChildHeight);

        return maxHeight + 1;
    }

    public void clear(){
        if(mRoot != null){
            deleteNode(mRoot);
        }
    }

    public void deleteNode(BinaryTreeNode node){
        checkTreeEmpty();
        if(node == null){
            return;
        }
        deleteNode(node.getmLeftChild());
        deleteNode(node.getmRightChild());
        node = null;
    }

    public void insertALeftChild(BinaryTreeNode leftChild){
        checkTreeEmpty();
        mRoot.setmLeftChild(leftChild);
    }

    public void insertArightChild(BinaryTreeNode rigthChild){
        checkTreeEmpty();
        mRoot.setmRightChild(rigthChild);
    }

    public void checkTreeEmpty(){
        if(mRoot == null){
            throw new IllegalStateException("Can't insert to a null tree! Did you forget set value for root?");
        }
    }

    public BinaryTree() {
    }

    public BinaryTree(BinaryTreeNode mRoot) {
        this.mRoot = mRoot;
    }

    public BinaryTreeNode getRoot() {
        return mRoot;
    }

    public void setRoot(BinaryTreeNode mRoot) {
        this.mRoot = mRoot;
    }


}