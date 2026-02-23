package Week06;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        int size = 15;
        int[] data = new int[size];

//        Random rand = new Random();
        Random rand = new Random(3);

        for(int i = 0; i < data.length; i++){
            data[i] = getARandom(rand, 1, size);
        }

        print(data);

        System.out.println("Max value in the data: " + max(data));

        Scanner in = new Scanner(System.in);
        int num = 0;
        do{
            System.out.print("Enter a number to search: ");
            num = in.nextInt();
            System.out.println("Is " + num + " in the data?: " + search(data, num));
            System.out.println("The location of " + num + " is: " + searchIndex(data, num));
            System.out.println("The last location of " + num + " is: " + searchIndexRev(data, num));

            //Return all indices of num
            ArrayList<Integer> al1 = searchAllIndices(data, num);
            System.out.println("The locations for " + num + ": " + al1);

        }while(num > 0);
    }

    public static ArrayList<Integer> searchAllIndices(int[] data, int key){
//        ArrayList<int> al1; //X Generics cannot accept primitive datatype
//        ArrayList<String> as = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < data.length; i++){
            if(data[i] == key){
                al.add(i);
            }
        }

        return al;
    }

    public static int searchIndexRev(int[] data, int num){
        for(int i = data.length - 1; i >= 0; i--){
            if(data[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static int searchIndex(int[] data, int num){
        for(int i = 0; i < data.length; i++){
            if(data[i] == num){
                return i;
            }
        }
        return -1;
    }

    public static boolean search(int[] data, int num){
        for(int i = 0; i < data.length; i++){
            if(data[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int max(int[] data){
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i < data.length; i++){
            if(maxValue < data[i]){
                maxValue = data[i];
            }
        }
        return maxValue;
    }

    public static void print(int[] data){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static int getARandom(Random r, int start, int range){
        return Math.abs(r.nextInt()) % range + start;
    }
}
