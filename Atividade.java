import java.util.Scanner;

public class Atividade {

public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //pergunta o tamanho do vetor
        System.out.print("Quantos valores quer digitar? ");
        int tamanho = sc.nextInt();

        //cria o vetor no tamanho informado
        int[] vetor = new int [tamanho];

        //preenche o vetor com os valores
        for(int i=0; i<tamanho; i++){
        System.out.println("Digite o valor da posição "+ i +": ");
        vetor[i] = sc.nextInt();
       
    }


    System.out.println("Valorews digitados: ");
    for (int i=0; i<tamanho; i++){
        System.out.println("posição"+i+": " +vetor[i]);
    }
    sc.close();

           } 
    }

     public static void bubbleSort(int[] numeros) {
        //bubble Sort
        for (int i=0; i<numeros.length -1; i++){
            boolean trocou = false; //flag
            for (int j=0; j<numeros.length -1; j++){
                System.out.println("\nInteração " + i + " : " + j);
                //compara elementos vizinhos
                if (numeros[j] > numeros[j+1]){
                    //troca de valores
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;

                    trocou = true;
                }
                visualizaVetor(numeros);
                    
                }
                if (!trocou){
                        System.out.println("\nVetor ordenado");
                        break;
            }
        }
    }
}
