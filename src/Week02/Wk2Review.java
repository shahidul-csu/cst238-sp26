package Week02;

import java.util.Random;
import java.util.Scanner;

public class Wk2Review {
    public static void main(String[] args){
        Random r = new Random();
        int num = r.nextInt();
        System.out.println(num);

//        Scanner in = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num2 = in.nextInt();
//        System.out.println("Num: " + num2);

        Student s1 = new Student();
        System.out.println(s1);
        s1.setName("John Doe");
        System.out.println("Student Name: " + s1.getName());
    }
}
