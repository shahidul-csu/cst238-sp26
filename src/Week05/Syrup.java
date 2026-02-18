package Week05;

public class Syrup {
    private String flavor;

    public Syrup(String aFlavor){
        flavor = aFlavor;
    }

    //Getter (Get method)
    public String getFlavor(){
        return flavor;
    }

    //Setter (Set method)
    public void setFlavor(String newFlavor){
        flavor = newFlavor;
    }

    public String toString(){
        return flavor;
    }
}
