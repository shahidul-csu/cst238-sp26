package Week08;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        int[] data = {1, 13, 7, 5, 2, 3, 4};
        printArray(data);
        Arrays.sort(data);
        printArray(data);

        ArrayList<String> words = readDataFromFile();
        System.out.println(words);
        Collections.sort(words);
        System.out.println(words);

        ArrayList<Person> people = readPersonFromFile();
        printArrayList(people);
        Collections.sort(people);
        printArrayList(people);
    }

    public static void printArrayList(ArrayList<Person> people){
        System.out.println();
        for(Person p:people){
            System.out.println(p);
        }
    }

    public static ArrayList<Person> readPersonFromFile() throws IOException{
        ArrayList<Person> words = new ArrayList<>();
        FileReader fr = new FileReader("src/Week08/person.txt");
        Scanner fin = new Scanner(fr);

        while(fin.hasNext()){
            Person p = new Person(fin.next(), fin.nextInt(), fin.nextInt());
            words.add(p);
        }

        fr.close();
        return words;
    }

    public static ArrayList<String> readDataFromFile() throws IOException{
        ArrayList<String> words = new ArrayList<>();
        FileReader fr = new FileReader("src/Week08/data.txt");
        Scanner fin = new Scanner(fr);

        while(fin.hasNext()){
            words.add(fin.next());
        }

        fr.close();
        return words;
    }

    public static void printArray(int[] data){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
