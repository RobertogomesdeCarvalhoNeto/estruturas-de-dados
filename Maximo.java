public class Maximo {
    public static void main(String[] args) {
        new Maximo();
    }
    public Maximo(){
        int a[] = {12, 34, 56, 787, 90, 54, 7 ,125, 747, 876, 9765, 92545};
        System.out. println("Maior dos valores 1: " + maximoIterativo(a));
    }
    public int maximoIterativo (int vet[]){
        int max = vet[0];
        for (int i = 1; i<vet.length;i++){
            if(vet[i] > max)max = vet[i];
        }
        return max;
    }
}
