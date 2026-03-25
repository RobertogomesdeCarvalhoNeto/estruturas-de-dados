public class BubbleSort {

    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 4, 2};
        //exibindo o vetor antes da ordenação
        System.out.println("Antes da ordenação: ");
        visualizaVetor(numeros);

       bubbleSort(numeros);

        //exibindo o vetor depois da ordenação
        System.out.println("\nDepois da ordenação: ");
        visualizaVetor(numeros); 
    }
      public static void visualizaVetor(int vetor[]){
        for (int i=0; i<vetor.length; i++){
            System.out.print(vetor[i] + "  ||  ");
        }
        System.out.println();
    }
 
    public static void bubbleSort(int[] numeros) {
        //bubble Sort
        for (int i=0; i<numeros.length -1; i++){
            for (int j=0; j<numeros.length -1; j++){
                System.out.println("\nInteração " + i + " : " + j);
                //compara elementos vizinhos
                if (numeros[j] > numeros[j+1]){
                    //troca de valores
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }
    }
}
