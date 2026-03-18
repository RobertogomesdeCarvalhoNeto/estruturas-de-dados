import java.util.ArrayList;

public class sobremesas {
    public static void main(String[] args) {
        ArrayList<String>sobremesas=new ArrayList<String>();
        sobremesas.add("pudim");
        sobremesas.add("bolo");
        sobremesas.add("chocolate");
        System.out.println(sobremesas);
        sobremesas.add(0,"bolo");
        System.out.println(sobremesas);
        System.out.println(sobremesas.get(2));
        sobremesas.set(2,"torta");
        System.out.println(sobremesas);


    }
}
