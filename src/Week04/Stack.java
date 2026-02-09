package Week04;

public class Stack {
    private String[] data;
    //top will point to the most recent item in the stack
    private int top;
    public static final int CAPACITY = 5;

    public Stack(){
        data = new String[CAPACITY];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    //Add an item to the top of the stack
    public void push(String item){
        if(top == data.length - 1){
            System.out.println("Stack full");
        } else {
            data[++top] = item;
        }
    }

    //Return the top value
    public String top(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return null;
        } else{
            return data[top];
        }
    }

    //Remove the top value
    public void pop(){
        if (isEmpty()){
            System.out.println("Stack Empty");
        } else{
            data[top] = null;
            top--;
        }
    }

    public void display(){
        for(int i = top; i >= 0; i--){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
