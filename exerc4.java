//logaritmico busca binaria curta
public class exerc4 {
    public static void main(String[] args) {
        int[] lista={10,20,30,40,50,60,70,80,90,100};
        int alvo=70, inicio=0, fim=lista.length-1;

        while (inicio<=fim) {
            int meio=(inicio+fim)/2; //divide o problema ao meio

            if (lista[meio]==alvo){
                System.err.println("Encontrado no índice:"+meio);
                return;
            }
            if (lista[meio]<alvo)inicio=meio+1;//descarta a metade esquerda
            else fim=meio-1;                   //descarta a metade esquerda
        }
    }
}
