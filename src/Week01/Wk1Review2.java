package Week01;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Wk1Review2 {
    public static void main(String[] args) throws IOException{
        int range = 11;
        int[] data = new int[range];
        data[0] = 3;
        data[1] = 5;
//        data[5] = 8;
//        data[9] = 12;
//        data[10] = 20;
        printArray(data, 2);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a file: " );
        String fileName = in.next();

        int count = loadDataFromFile(fileName, data);

        printArray(data, count);

        printAverage(data, count, fileName);
    }

    public static void printAverage(int[] data, int count, String fileName){
        double sum = 0.0;
        for(int i = 0; i < count; i++){
            sum += data[i];
        }
        System.out.println("Average of data in file " + fileName + ": " + sum/count);
    }

    public static int loadDataFromFile(String fileName, int[] nums) throws IOException {
        FileReader fr = new FileReader(fileName);
        Scanner fin = new Scanner(fr);
        int count = 0;
        while (fin.hasNextInt()){
            nums[count++] = fin.nextInt();
        }

        fr.close();
        return count;
    }

    public static void printArray(int[] data, int count){
//        for(int num: data){
        for(int i = 0; i < count; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
