package Week04;

public class QueueRunner {
    public static void main(String[] args){
        Queue q = new Queue();
        q.enqueue(3);
        q.enqueue(8);
        System.out.println(q);
        q.dequeue();
        System.out.println(q);
        q.enqueue(5);
        q.enqueue(6);
        q.dequeue();
        System.out.println(q);
        q.enqueue(7);
        q.enqueue(4);
        System.out.println(q);
    }
}
