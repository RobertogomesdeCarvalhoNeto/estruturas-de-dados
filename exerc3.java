//exponencial fibonacci
public class exerc3 {

    static int iteracao=0;

    public static void main(String[] args) {
        int n=10;
        System.err.println("O Fibonacci de"+n+"é:"+calcularFibonacci(n));
    }
    public static int calcularFibonacci(int n){
        //casos base
        if (n<=1){
            return n;
        }
        //chamada recursiva dupla:aqui nasce o 0(2^n)
        //para cada chamada, o programa se divide em 2 novas tarefas
        System.err.println("Calculando iteração:"+iteracao++);
        return calcularFibonacci(n-1)+calcularFibonacci(n-2);
    }
    
}
