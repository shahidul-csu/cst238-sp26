package Week09;

public class PrintFormat {
    public static void main(String[] args){
        double pi = 3.14159;
        double rando = 5327.71354928;

        //%f[float], %d[int], %s[String]
        System.out.printf("[%f][%f]\n", 3.14, rando);
        System.out.printf("[%.3f][%.2f]%n", pi, rando);
        System.out.printf("[%20.2f][%20.2f]%n", pi, rando);
        System.out.printf("[%-20f][%-20f]%n", pi, rando);
        System.out.printf("[%-20.4f][%-20.4f]%n", pi, rando);
        System.out.println();

        int num = 52;
        System.out.printf("[%d][%7d][%07d]%n", num, num, num);
        String text = String.format("[%d][%7d][%07d]%n", num, num, num);
        System.out.println(text);
    }
}
