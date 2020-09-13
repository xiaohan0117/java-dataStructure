package cn.treedemo.tree;

public class TestTreeDemo {

    public static void main(String[] args) {
        MyTree<String> myTree = new MyTree("1");


        myTree.addLeftNode("2");
        myTree.addRightNode("3");
        myTree.leftNode.addLeftNode("4");
        myTree.leftNode.addRightNode("5");
        myTree.rightNode.addLeftNode("6");

        /* 树的深度 */
        int treeDepth = TreeUtils.getTreeDepth(myTree);
        System.out.println("树的深度:"+treeDepth);

        /* 树的节点数 */
        int treeNodeNumbers = TreeUtils.getTreeNodeNumbers(myTree);
        System.out.println("树的节点数:"+treeNodeNumbers);

        /* 前序遍历 */
        TreeUtils.preOrderTraverse(myTree);
        /* 中序遍历 */
        TreeUtils.midOrderTraverse(myTree);
        /* 后序遍历 */
        TreeUtils.afterOrderTraverse(myTree);

    }

}
