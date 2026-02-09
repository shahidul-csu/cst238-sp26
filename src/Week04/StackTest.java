package Week04;

public class StackTest {
    public static void main(String[] args){
        Stack s = new Stack();
        s.push("A");
        s.push("B");
        s.push("C");
        s.display();
        s.pop();
        s.push("D");
        s.push("E");
        s.display();
        s.pop();
        s.display();
    }
}
