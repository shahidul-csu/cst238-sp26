package Week07;

public class Main {
    public static void main(String[] args){
        System.out.println("Foo Count: " + Foo.getFooCount());
        Foo f1 = new Foo(20, "Initial State");
        System.out.println(f1.getBar());
        System.out.println(f1.getState());
        Foo f2 = new Foo(25);
        Foo f3 = new Foo();
        System.out.println(f3.getBar());
        System.out.println("Foo Count: " + Foo.getFooCount());

        System.out.println(f3);
        System.out.println(f3.getMe());

        int a = 5;
        System.out.println(f3.getState());
        System.out.println("a: " + a);
        updateData(f3, a);
        System.out.println("After method call");
        System.out.println(f3.getState());
        System.out.println("a: " + a);

    }

    public static void updateData(Foo f, int a){
        System.out.println("Inside update method");
        f.setState("Updated state");
        a = 10;
        System.out.println(f.getState());
        System.out.println("a: " + a);
    }
}
