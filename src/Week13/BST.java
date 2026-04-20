package Week13;

public class BST {
    private Node root;

    public BST(){
        root = null;
    }

    public void add(int value){
        if(isEmpty()){
            root = new Node(value);
        } else{
            root.add(value);
        }
    }

    public boolean isEmpty(){
        return root == null;
    }
}

class Node{
    //Payload
    private int data;

    //References
    private Node left;
    private Node right;

    public Node(int value){
        data = value;
        left = null;
        right = null;
    }

    public void add(int value){
        if(value < data){
            // go to the left
            if(hasLeft()){
                left.add(value);
            } else{
                left = new Node(value);
            }
        } else if(value > data){
            // go to the right
            if(hasRight()){
                right.add(value);
            } else{
                right = new Node(value);
            }
        } else{
            System.out.println("The item is already there");
        }
    }

    public boolean hasLeft(){
        return left != null;
    }

    public boolean hasRight(){
        return right != null;
    }
}