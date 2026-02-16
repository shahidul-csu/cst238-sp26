package Week04;

//Implement a circular queue where we always keep one empty spot
public class Queue {
    private int[] data;
    //'front' will point to the first item in the queue
    private int front;
    //'back' will point the next available empty spot
    private int back;

    public static final int CAPACITY = 5;

    public Queue(){
        data = new int[CAPACITY];
        front = 0;
        back = 0;
    }

    public boolean isEmpty(){
        return front == back;
    }

    public void enqueue(int value){
        int newBack = (back + 1) % data.length;
        if(newBack == front){
            System.out.println("Queue is full, cannot add " + value);
            return;
        }
        data[back] = value;
        back = newBack;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue empty, nothing to remove");
        } else {
            front = (front + 1) % data.length;
        }
    }

    public String arrayState(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < data.length; i++){
            sb.append(data[i]).append(" ");
        }
        sb.append(" f: ").append(front).append(", b: ").append(back);
        return sb.toString();
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = front; i != back; i = (i + 1) % data.length){
            sb.append(data[i]).append(" ");
        }
        return sb.toString();
    }
}
