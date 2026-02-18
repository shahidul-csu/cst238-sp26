package Week05;

public class CoffeeRevisited {
    //Attributes
    private int size;
    private Syrup[] syrups;
    private int syrupCount;

    //A static field is shared by all objects (belong to the class)
    public static final int DEFAULT_MAX_SYRUP = 3;
    private static int coffeCount = 0;

    //Constructor(s)
    public CoffeeRevisited(){
        size = 12;
        syrups = new Syrup[DEFAULT_MAX_SYRUP];
        syrupCount = 0;
        coffeCount++;
    }

    public CoffeeRevisited(int aSize){
        size = aSize;
        syrups = new Syrup[DEFAULT_MAX_SYRUP];
        syrupCount = 0;
        coffeCount++;
    }

    //Other Methods
    public void resize(){
        //Create a new array
        Syrup[] moreSyrups = new Syrup[syrups.length * 2];

        // copy contents
        for(int i = 0; i < syrupCount; i++){
            moreSyrups[i] = syrups[i];
        }

        //Change reference
        syrups = moreSyrups;

    }

    //A static method also belong to the class, not an individual object
    //You can call static method without creating an object
    public static int getCoffeeCount(){
//        System.out.println(size);
//        CoffeeRevisited c = new CoffeeRevisited();
//        c.addSyrup(new Syrup("Strawberry"));
        return coffeCount;
    }

    public void addSyrup(Syrup aSyrup){
        if(syrupCount >= syrups.length){
            if(size >= 20){
                resize();
            } else {
                System.out.println("Too many syrups");
                return;
            }
        }
        syrups[syrupCount++] = aSyrup;
    }

    public String toString(){
        if(syrupCount == 0){
            return "No Syrups";
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < syrupCount; i++){
            sb.append(syrups[i]).append(" ");
        }

        return sb.toString();
    }
}
