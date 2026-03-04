//Algoritmo linear
public class exerc2 {
    public static void main(String[]args){
        int[]numeros={1,2,3,4,5};//Entrada do tamanho n
        int alvo=4;

        //o algoritmo linear é apenas este 'passeio' pela lista:
        for(int 1=0;1<numeros.length;1++){
            System.out.println("Testando posição"+1);


            if(numeros[1]==alvo){
                System.err.println("Achei!");
                break; //para quando encontrar
            }
        }
    }
}
