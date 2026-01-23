package Week01;

public class Wk1Review {
    public static void main(String[] args){
        for(int i = 0; i < 20; i += 2){ // i += 2 <=> i = i + 2;
            if(i % 3 == 0){
                System.out.println(i + " is even and multiple of 3");
            } else {
                System.out.println(i + " is even but not multiple of 3");
            }
        }
    }
}
