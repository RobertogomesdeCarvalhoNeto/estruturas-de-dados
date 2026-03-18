import java.util.ArrayList;

public class cidade {
    public static void main(String[] args) {
        ArrayList<String>cidades=new ArrayList<String>();
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Brasília");
        cidades.add("Belo Horizonte");
        cidades.add("Santos");
        System.out.println(cidades);

        //remove um elemento
        cidades.remove(1);
        System.out.println(cidades);

        //exibe a quantidade de elementos
        System.out.println("numero de cidades: "+cidades.size());

        //exibe em forma de lista (vertical)
        System.out.println("Lista de cidades com laço FOR");
        for (int i=0; i<cidades.size(); i++){
            System.out.println(cidades.get(i)); 
        }

        //modo mais facil da lista vertical
        System.out.println("Lista de cidades com laço FOR-EACH");
        for (String cidade:cidades){
            System.out.println(cidade);
        }
    }
}
