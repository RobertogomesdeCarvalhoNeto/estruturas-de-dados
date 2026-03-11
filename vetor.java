public class vetor {

    public static void main(String[] args) {
        new vetor();//vetor programa=new vetor();
        System.out.println("rodou");
        
    }
    public vetor(){
        double a[]={10,20,30,4.3,3.2,-1,-2};
        
        String msg="Vetor de valores reais";
        //visualizaVetor(msg,a);
        System.out.println();
        calculaSomaDosElementos(a);
    }

    public void calculaSomaDosElementos(double vet[]){
        double soma=0;
             for (int i=0; i<vet.length; i++){
                 soma=soma+vet[i];
             }
             System.err.println("soma dos valores"+soma);
    }
    public void visualizaVetor(String mensagem, double vet[]){
        System.out.println(mensagem);
        //mensagem="vetorizado";
        for (int i=0; i<vet.length; i++){
            System.err.print(vet[i]+ "||");
            //vet[i]=vet[i]*2;
        }
    }
}
    

