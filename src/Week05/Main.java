package Week05;

public class Main {
    public static void main(String[] args){
        System.out.println(Math.pow(3,4));
        System.out.println(CoffeeRevisited.getCoffeeCount());
//        System.out.println(CoffeeRevisited.addSyrup());
        CoffeeRevisited c = new CoffeeRevisited(20);
//        System.out.println(c);
        Syrup aSyrup = new Syrup("Vanilla");
        c.addSyrup(aSyrup);
        c.addSyrup(new Syrup("Mango"));
        System.out.println(c);
        c.addSyrup(new Syrup("Strawberry"));
        System.out.println(c);
//        c.resize();
        c.addSyrup(new Syrup("Chocolate"));
        System.out.println(c);
        System.out.println(CoffeeRevisited.getCoffeeCount());
        CoffeeRevisited c2 = new CoffeeRevisited();
        System.out.println(CoffeeRevisited.getCoffeeCount());
    }
}
