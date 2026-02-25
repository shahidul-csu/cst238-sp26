package Week06;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SearchFun {
    public static void main(String[] args) throws IOException{
        // Indices: 0->11
//        int[] data = {1, 4, 4, 7, 9, 14, 15, 19, 24, 25, 30, 37};

        int[] data = new int[20];
        int count = readData(data);
        print(data, count);
        Arrays.sort(data, 0, count);
        print(data, count);
        int key = 6;
        int location = binarySearch(data, count, key);
        System.out.println("Location of " + key + " is : " + location);
    }
    // Example to search 8
    // low : 0   0 3 4 4
    // high: 11  4 4 4 3
    // mid : 5   2 3 4
    public static int binarySearch(int[] data, int count, int key){
        int low = 0;
        int high = count - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            System.out.println(low + ", " + high + ", " + mid);
            if(key == data[mid]){ // We found the item
                return mid;
            } else if(key < data[mid]){ // Key is lower
                //Go left
                high = mid - 1;
            } else{ // Key is higher
                // Go right
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void print(int[] data, int count){
        for(int i = 0; i < count; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static int readData(int[] data) throws IOException{
        Scanner cin = new Scanner(System.in);
        System.out.print("Enter filename: ");
        String filename = cin.next();
        FileReader fr = new FileReader(filename);
        Scanner fin = new Scanner(fr);
        int count = 0;
        while(fin.hasNextInt() && count < data.length){
            data[count++] = fin.nextInt();
        }
        fr.close();
        return count;
    }
}
