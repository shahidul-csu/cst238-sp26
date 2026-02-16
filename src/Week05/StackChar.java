package Week05;

public class StackChar {
    private char[] data;
    //top will point to the most recent item in the stack
    private int top;
    public static final int CAPACITY = 5;

    public StackChar(){
        data = new char[CAPACITY];
        top = -1;
    }

    public StackChar(int capacity){
        data = new char[capacity];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    //Add an item to the top of the stack
    public void push(char item){
        if(top == data.length - 1){
            System.out.println("Stack full");
        } else {
            data[++top] = item;
        }
    }

    //Return the top value
    public char top(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return 0; //return a garbage value
        } else{
            return data[top];
        }
    }

    //Remove the top value
    public void pop(){
        if (isEmpty()){
            System.out.println("Stack Empty");
        } else{
//            data[top] = null; // Needed when we store an object to save memory
            top--;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        if(isEmpty()){
            return "Empty Stack";
        }
        sb.append("Stack: ");
        for(int i = top; i >= 0; i--){
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }

    public void display(){
        for(int i = top; i >= 0; i--){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
