package cn.treedemo.tree;

/**
 * 树的简单实现
 * @param <T>
 */
public class MyTree<T> {

    T value;
    /* 左节点 */
    MyTree<T> leftNode;
    /* 右节点 */
    MyTree<T> rightNode;

    MyTree(T value){
        this.value = value;
    }

    MyTree(){

    }


    /* 添加左节点 */
    public void addLeftNode(T value){
        MyTree leftNode = new MyTree(value);
        this.leftNode = leftNode;
    }

    /* 添加右节点 */
    public void addRightNode(T value){
        MyTree rightNode = new MyTree(value);
        this.rightNode = rightNode;
    }

    /**
     * 重写equals方法
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        /* 首先判断是不是一个类型 */
        if (!(obj instanceof MyTree)){
            return false;
        }
        /* 如果obj是MyTree类型，将obj强转为MyTree类型后比较两者的value */
        return this.value.equals(((MyTree) obj).value);
    }

    /**
     * 重写hashCode方法
     * @return
     */
    @Override
    public int hashCode() {
        return this.value.hashCode();
    }

    /**
     * 重写toString方法
     * @return
     */
    @Override
    public String toString() {
        return this.value == null ? "" : this.value.toString();
    }
}
