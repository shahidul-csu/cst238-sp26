package Week10;

public class MoreRecursion {
    public static void main(String[] args){
        int[] data = {5, 8, 4, 1};
        System.out.println("Sum: " + sumOfArray(data, 0));
        System.out.println("Max: " + maxInArray(data, 0));
        System.out.println();
        foo(5, 2);
    }

    //foo(-1, 5)
    //foo(1, 4)
    //foo(3, 3)
    //foo(5, 2)
    public static void foo(int a, int b){
        if(a <= 0){
            System.out.println();
            return;
        }
        System.out.println(a + ", " + b);
        foo(a - 2, b + 1);
        int res = a + b;
        System.out.println(a + ", " + b + ", " + res);
    }

    //maxInArray(data, 3) -> return 1
    //maxInArray(data, 2) -> max(4, 1) -> return 4
    //maxInArray(data, 1) -> max(8, 4) -> return 8
    //maxInArray(data, 0) -> max(5, 8) -> return 8
    public static int maxInArray(int[] data, int start){
        if(start == data.length - 1){
            return data[start];
        }
        int currentMax = maxInArray(data, start + 1);
        return Math.max(data[start], currentMax);
    }

    /*With Iteration
    int sum = 0; //Accumulator variable
    for(int i = 0; i < data.length; i++){
        sum += data[i];
    }
    * */
    public static int sumOfArray(int[] data, int start){
        if(start == data.length - 1){
            return data[start];
        }
        int sum = sumOfArray(data, start + 1);
        System.out.println(sum);
        return data[start] + sum;
    }
}
