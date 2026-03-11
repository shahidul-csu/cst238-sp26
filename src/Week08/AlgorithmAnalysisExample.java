package Week08;

public class AlgorithmAnalysisExample {

    public static void main(String[] args){

    }

    // O (n)
    public static int foo(int[] data){
        int sum = 0;
        for(int i = 0; i < data.length; i++){
            sum += data[i]; // sum = sum + data[i]
        }
        return sum * data.length;
    }

    //O (n^2)
    public static int bar(int[] data){
        int sum = 0;
        for(int i = 0; i < data.length; i++){
            for(int k = 0; k < data.length; k++){
                sum += data[i];
            }
        }
        return sum;
    }
}

