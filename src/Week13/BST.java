package Week13;

public class BST {
    private Node root;

    public BST(){
        root = null;
    }

    public void postOrder(){
        if(isEmpty()){
            System.out.println("Empty Tree");
        } else{
            root.postOrder();
            System.out.println();
        }
    }

    public void inOrder(){
        if(isEmpty()){
            System.out.println("Empty Tree");
        } else{
            root.inOrder();
            System.out.println();
        }
    }

    public void preOrder(){
        if(isEmpty()){
            System.out.println("Empty Tree");
        } else{
            root.preOrder();
            System.out.println();
        }
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

    public void postOrder(){
        if(hasLeft()){
            left.postOrder();
        }
        if(hasRight()){
            right.postOrder();
        }
        System.out.print(data + " ");
    }

    public void inOrder(){
        if(hasLeft()){
            left.inOrder();
        }
        System.out.print(data + " ");
        if(hasRight()){
            right.inOrder();
        }
    }

    public void preOrder(){
        System.out.print(data + " ");
        if(hasLeft()){
            left.preOrder();
        }
        if(hasRight()){
            right.preOrder();
        }
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