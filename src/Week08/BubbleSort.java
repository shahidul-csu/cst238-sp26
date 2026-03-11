package Week08;

public class BubbleSort {
    public static void main(String[] args){
        int[] test = {7, 2};
        print(test);
        swap(test, 0, 1);
        print(test);
        System.out.println();

        int[] data = {7, 2, 9, 1, 5, 4, 3, 10, 6};
        print(data);
        bubbleSort(data);
        print(data);
    }

    // O (n^2)
    public static void bubbleSort(int[] data){
        for(int k = 0; k < data.length - 1; k++){
            for(int i = 0; i < data.length - k - 1; i++){
                if(data[i] > data[i + 1]){ //Data is out of order
                    swap(data, i, i + 1);
                    print(data);
                }
            }
            System.out.println();
        }
    }

    public static void swap(int[] data, int index1, int index2){
        int temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    public static void print(int[] data){
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}
