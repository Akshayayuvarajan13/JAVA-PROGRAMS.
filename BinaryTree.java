
class Node{
    int data;
    Node left;
    Node right;
Node(int data){
    this.data = data;
    left = null;
    right = null;
}
}
public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        System.out.println("Root: " + root.data);
        System.out.println("Left child: " + root.left.data);
        System.out.println("Right child : " + root.right.data);
        System.out.println("Left subtree child: " + root.left.left.data);
        System.out.println("Right subtree child: " + root.left.right.data);
    }
    
}
