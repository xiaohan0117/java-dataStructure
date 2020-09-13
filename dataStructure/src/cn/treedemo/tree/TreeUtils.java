package cn.treedemo.tree;

/**
 * 树的工具类
 */
public class TreeUtils {

    /**
     * 判断树中节点个数
     */
    public static <T> int getTreeNodeNumbers(MyTree<T> tree){

        /* 如果该树没有值，返回0 */
        if (tree == null){
            return 0;
        }
        /* 如果不是0 使用递归查询子节点的个数 */
        return getTreeNodeNumbers(tree.leftNode)+getTreeNodeNumbers(tree.rightNode)+1;
    }

    /**
     * 判断树的深度
     */
    public static <T> int getTreeDepth(MyTree<T> tree){
        if (tree == null){
            return 0;
        }
        int leftDepth = getTreeDepth(tree.leftNode) + 1;
        int rightDepth = getTreeDepth(tree.rightNode) + 1;
        return Math.max(leftDepth,rightDepth);
    }

    /**
     * 前序遍历
     */
    public static <T> void preOrderTraverse(MyTree<T> tree){
        if (tree == null){
            return;
        }
        printNode(tree);
        preOrderTraverse(tree.leftNode);
        preOrderTraverse(tree.rightNode);
    }

    /**
     * 中序遍历
     */
    public static <T> void midOrderTraverse(MyTree<T> tree){
        if (tree == null){
            return;
        }
        midOrderTraverse(tree.leftNode);
        printNode(tree);
        midOrderTraverse(tree.rightNode);
    }

    /**
     * 后序遍历
     */
    public static <T> void afterOrderTraverse(MyTree<T> tree){
        if (tree == null){
            return;
        }
        afterOrderTraverse(tree.leftNode);
        afterOrderTraverse(tree.rightNode);
        printNode(tree);
    }

    private static <T> void printNode(MyTree<T> tree) {
        System.out.println(tree.value+"\t");
    }

}
