package Week03;

public class ListExtendTest {
    public static void main(String[] args){
        ListExtend l1 = new ListExtend();
        System.out.println(l1);
        System.out.println("L1 Empty? " + l1.isEmpty());
        l1.append("Orange");
        System.out.println("L1 Empty? " + l1.isEmpty());
        System.out.println("L1 item count: " + l1.getSize());

        ListExtend l2 = new ListExtend(20);
        l2.append("Apple");
        l2.append("Mango");
        l2.append("Banana");
        System.out.println("L2 Empty? " + l2.isEmpty());
        System.out.println("L2 item count: " + l2.getSize());
        System.out.println(l2);
        l2.insert("Kiwi", 0);
        System.out.println(l2);
        l2.insert("Watermelon", 2);
        System.out.println(l2);
        l2.delete(1);
        System.out.println(l2);
        System.out.println(l2.charCount());
        System.out.println(l2.firstLetter());
    }
}
