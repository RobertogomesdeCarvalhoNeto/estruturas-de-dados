import java.util.Random;

public class Ex_random {
    

    public static void main(String[]args){
        new Ex_random();
    }

    public Ex_random(){
        //geração aleatória dos itens do vetor
        float vet [] = new float[10];
        for (int i=0; i<vet.length; i++){
            vet[i] = geraFloat();
        } 
        visualizaVetor(vet);
    }

    public float geraFloat(){
        Random rnd = new Random();
        float numero = rnd.nextFloat();//gera números entre 0,0 e 1,0
        return (numero * 10);
    }

    public void visualizaVetor(float vetor[]){
        for (int i=0; i<vetor.length; i++){
            System.out.print(vetor[i] + "  ||  ");
        }
        System.out.println();
    }
    
}
    

