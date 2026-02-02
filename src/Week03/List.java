package Week03;

//Introduction to List [To be Completed in the next session]

// Abstract Data Type (ADT): defines a collection of data with behaviors [What is allowed]
// List is an ADT:
// Ordered collection of elements
// Operations: add an item, remove an item, find an item, iterate through the list, etc.

// How to implement? -> Using Data Structure (Array, Linked List)

public class List {
    // Attributes
    private String[] data;
    private int size;
    public static final int DEFAULT_CAPACITY = 50;

    // Constructor(s)
    public List(){
        data = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    public List(int capacity){
        data = new String[capacity];
        size = 0;
    }

    // Other methods
    public boolean isEmpty(){
        return size == 0;
//        if(size == 0){
//            return true;
//        } else {
//            return false;
//        }
    }

    // Add a new item at the end of the list
    public void append(String s){
        if(size < data.length){
            data[size++] = s;
        } else{
            System.out.println("List is full");
        }
    }

    public int getSize(){
        return size;
    }

    public static void main(String[] args){
        List l1 = new List();
        System.out.println(l1);
        System.out.println("L1 Empty? " + l1.isEmpty());
        l1.append("Orange");
        System.out.println("L1 Empty? " + l1.isEmpty());
        System.out.println("L1 item count: " + l1.getSize());

        List l2 = new List(20);
        l2.append("Apple");
        l2.append("Mango");
        System.out.println("L2 Empty? " + l2.isEmpty());
        System.out.println("L2 item count: " + l2.getSize());

        List l3 = new List(10000);
        System.out.println("L3 Empty? " + l3.isEmpty());
        System.out.println("L3 item count: " + l3.getSize());
    }
}
