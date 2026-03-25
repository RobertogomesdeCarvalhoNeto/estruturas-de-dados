
public class exerc1 {
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
        
    

  

    

