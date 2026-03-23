package Week10;

public class Recursion {
    public static void main(String[] args){
//        foo();
        counter(5);
        System.out.println();
        System.out.println("Sum: " + sum(3));
        System.out.println("Sum: " + sum(5));
        System.out.println();

        int[] data = {5, 7, 3, 1};
        print(data, data.length);
        System.out.println();
    }

    public static void print(int[] data, int size){
        if(size > data.length){
            System.out.println("Size is out of bound");
            return;
        }
        if(size == 0){
            return;
        }
//        System.out.print(data[size - 1] + " ");
        print(data, size - 1);
        System.out.print(data[size - 1] + " ");
    }

    // Return the sum from 1 to n
    // sum(n) = n + sum(n-1)
    // sum(0) = 0
    public static int sum(int n){
        if(n == 0){
            return 0;
        }
        return n + sum(n-1);
    }

    public static void counter(int n){
        //Base Condition
        if(n <= 0){
            return;
        }

        System.out.println(n);
        //Recursive Call
        counter(n-1);
        System.out.println(n);
    }

    // [Warning!!!] Never Ending Method Call
    public static void foo(){
        System.out.println("In Foo");
        foo();
    }
}
