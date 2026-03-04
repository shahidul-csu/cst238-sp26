package Week07;

public class Foo {
    private int bar;
    private String state;
    private static int fooCount = 0;

    public Foo(){
        this(10);
        System.out.println("Constructor 1 Called");
    }

    public Foo(int bar){
        this(bar, "Default State");
        System.out.println("Constructor 2 Called");
    }

    public Foo(int bar, String state){
        this.bar = bar;
        this.state = state;
        fooCount++;
        System.out.println("Constructor 3 Called");
    }

    public Foo getMe(){
        return this;
    }

    public int getBar(){
        return bar;
    }

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
    }

    public static int getFooCount(){
        return fooCount;
    }
}
