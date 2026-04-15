package Week12;

//Outer Class
public class LinkedListRecursion<T> {
    private Node first;

    public LinkedListRecursion(){
        first = null;
    }

    //Calling Method for Recursive Implementation
    public void append(T data){
        if(isEmpty()){
            first = new Node(data);
        } else{
            first.append(data);
        }
    }

    public boolean isEmpty(){
        return first == null;
    }

    //Iterative Implementation
    public String toString(){
        if(isEmpty()){
            return "Empty List";
        } else{
            StringBuilder sb = new StringBuilder();

            Node n = first;
            //if we use n.hasNext(), it will exclude the last item
            while(n != null){
                sb.append(n.getData()).append(" -> ");
                n = n.getNext();
            }
            sb.append("null");

            return sb.toString();
        }
    }

    //Inner Class
    private class Node{
        //Payload
        private T data;

        //Reference
        private Node next;

        public Node(T data){
            this.data = data;
            this.next = null;
        }

        //Recursively add item at the end of the list
        public void append(T data){
            if(!hasNext()){
                setNext(new Node(data));
            } else{
                getNext().append(data);
            }
        }

        public boolean hasNext(){
            return this.next != null;
        }

        public void setNext(Node n){
            this.next = n;
        }

        public T getData(){
            return this.data;
        }

        public Node getNext(){
            return this.next;
        }

        public String toString(){
            return data.toString();
        }
    }
}
