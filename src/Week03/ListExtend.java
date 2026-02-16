package Week03;

//Introduction to List [To be Completed in the next session]

// Abstract Data Type (ADT): defines a collection of data with behaviors [What is allowed]
// List is an ADT:
// Ordered collection of elements
// Operations: add an item, remove an item, find an item, iterate through the list, etc.

// How to implement? -> Using Data Structure (Array, Linked List)

public class ListExtend {
    // Attributes
    private String[] data;
    private int size;
    public static final int DEFAULT_CAPACITY = 50;

    // Constructor(s)
    public ListExtend(){
        data = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    public ListExtend(int capacity){
        data = new String[capacity];
        size = 0;
    }

    // Other methods

    // Return the total number of characters in the list
    public int charCount(){
        int chCount = 0;
        for(int i = 0; i < size; i++){
            chCount += data[i].length();
        }
        return chCount;
    }

    // Return a string with the first character of each element
    public String firstLetter(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++){
            sb.append(data[i].charAt(0));
        }
        return sb.toString();
    }

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

    //Add a new item at a given position
    // 0 1 2 3 [Array Index]
    // A M B _
    // A A M B [Right Shift]
    // K A M B [Goal]
    public void insert(String s, int index){
        if(size >= data.length){
            System.out.println("List is full");
        } else if(index < 0 || index > size){
            System.out.println("Invalid index");
        } else{
            // Right Shift
            for(int i = size; i > index; i--){
                data[i] = data[i - 1];
            }
            data[index] = s;
            size++;
        }
    }

    // Remove an item, given a position
    public void delete(int index){
        if (isEmpty()){
            System.out.println("Empty List");
        } else if(index < 0 || index >= size){
            System.out.println("Invalid index");
        } else{
            // Left Shift
            for(int i = index; i < size - 1; i++){
                data[i] = data[i + 1];
            }
            //If you are storing an object, set to null
            //If you are storing primitive data (e.g., int, char, double, etc.), do not need to reset the value
            data[size - 1] = null;
            size--;
        }
    }

    public int getSize(){
        return size;
    }

    public String toString(){
        if(isEmpty()){
            return "Empty List";
        } else{
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < size; i++){
                sb.append(data[i]).append(" ");
            }
            return sb.toString();
        }
    }
}
