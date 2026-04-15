package Week12;

public class Foo {
    int num;
    String name;

    public Foo(int num, String name){
        this.num = num;
        this.name = name;
    }

    public String toString(){
        return num + ", " + name;
    }
}
