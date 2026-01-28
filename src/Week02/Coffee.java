package Week02;

public class Coffee {
    //Attributes
    private int size;
    private String[] syrups;
    private int syrupCount;

    //Constant
    public static final int MAX_SYRUPS = 3;

    //Constructor
    public Coffee(int aSize){
        System.out.println("Constructor Called");
        //size = aSize;
        setSize(aSize);
        syrups = new String[MAX_SYRUPS];
        syrupCount = 0;
    }

    //Methods
    public void addSyrup(String aSyrup){
        if(syrupCount < syrups.length){
            syrups[syrupCount++] = aSyrup;
        } else{
            System.out.println("Too many syrups");
        }
    }

    public String[] getSyrups(){
        String[] copySyrups = new String[syrupCount];
        for(int i = 0; i < syrupCount; i++){
            copySyrups[i] = syrups[i];
        }
        return copySyrups;
    }

    public int getSize(){
        return size;
    }

    public void setSize(int aSize){
        size = aSize;
        if(size > 32){
            size = 32;
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Size: ").append(size).append(", Syrups: ");
        if(syrupCount == 0){
            sb.append("No Syrups");
        } else{
            for(int i = 0; i < syrupCount; i++){
                sb.append(syrups[i]).append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args){
        Coffee c1 = new Coffee(12);
        System.out.println(c1);
        System.out.println("Coffee 1 Size: " + c1.getSize());
        Coffee c2 = new Coffee(42);
        System.out.println("Coffee 2 Size: " + c2.getSize());
        c2.setSize(20);
        System.out.println("Coffee 2 Size: " + c2.getSize());
        c2.addSyrup("Vanilla");
        c2.addSyrup("Honey");
        String[] syrups = c2.getSyrups();
        for (int i = 0; i < syrups.length; i++){
            System.out.println(syrups[i]);
        }
        c2.addSyrup("Mango");
        c2.addSyrup("Mocha");
        System.out.println(c2);
    }
}
