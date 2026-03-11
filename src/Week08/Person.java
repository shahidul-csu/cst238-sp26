package Week08;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int heightInInches;

    public Person(String name, int age, int heightInInches){
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
    }

    // Compares two objects and return value to set their order
    // Returns 0 if both are equal
    // Return a negative value if this object should come before the parameter object
    // Return a positive value if this object comes after the parameter object
    public int compareTo(Person p){
        if(this.age == p.age){
            return this.name.compareTo(p.name);
        }
        return p.age - this.age;// - p.age;

//        return this.heightInInches - p.heightInInches;
//        return this.age - p.age;
    }

    public String toString(){
        return "Name: " + this.name + ", Age: " + this.age + ", Height: " + this.heightInInches;
    }
}
