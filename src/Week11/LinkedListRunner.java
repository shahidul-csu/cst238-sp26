package Week11;

public class LinkedListRunner {
    public static void main(String[] args){
//        Node n1 = new Node(7);
//        System.out.println(n1.getData());
//        System.out.println(n1.hasNext());
//
//        Node n2 = new Node(4);
//        System.out.println(n2.getData());
//        n1.setNext(n2);
//        System.out.println("n1 next: " + n1.hasNext());
//        System.out.println("n2 next: " + n2.hasNext());
        LinkedList ll = new LinkedList();
        System.out.println(ll);
        System.out.println(ll.isEmpty());
        ll.append(7);
        ll.append(4);
        ll.append(2);
        System.out.println(ll);
        ll.append(1);
        ll.append(6);
        System.out.println(ll);
        System.out.println(ll.countEven());
    }
}
