import java.util.ArrayList;
import java.util.Map;

class UberBlack extends Car{
    Map<String, ArrayList<String, Integer>> typeCarAccepted; //Map es un tipo de dato y es traído por util.Map
    ArrayList<String> seatsMaterial; //ArrayList es un arreglo y es traído por util.ArrayList
    public UberBlack(String license, Account driver, 
    Map<String, ArrayList<String, Integer>> typeCarAccepted, ArrayList<String> seatsMaterial ){
        super(license, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }

}