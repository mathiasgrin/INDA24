public class TreeNode<T>{
    //Fields
    public TreeNode<T> leftChild;
    public TreeNode<T> rightChild;
    public T data;

    //Constructor
    public TreeNode(T data){
        this.data = data;
        leftChild = null;
        rightChild = null;
    }
}
