package algorithm;

/**
 * @date
 * @author xsj
 * @param <T>
 */
public class BinaryTree <T> {

    private Node<T> root;

    public BinaryTree (){}

    public BinaryTree (Node<T> root){
        this.root = root;
    }

    public void setRoot(Node<T> root){
        this.root = root;
    }

    public Node<T> getRoot(){
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node();
        Node left = new Node();
        Node right = new Node();
        root.setData(0);
        left.setData(1);
        right.setData(2);
        root.setLeftNode(left);
        root.setRightNode(right);
        BinaryTree binaryTree = new BinaryTree(root);
        System.out.println(binaryTree.getRoot());
    }

}


class Node<T>{
    private int index;
    private Object data;
    private Node leftNode;
    private Node rightNode;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public void out(){
        System.out.println(data);
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", leftNode=" + leftNode +
                ", rightNode=" + rightNode +
                '}';
    }
}