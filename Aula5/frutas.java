public class frutas{
    public static void main(String[] args) {
        String frutas1 = "morango";
        String frutas2 = "melão";

        if(frutas1.compareTo(frutas2)>0){
            System.out.println(frutas1);
        }else{
            System.out.println(frutas2);
        }
        System.out.println(frutas1.compareTo(frutas2));
        System.out.println(frutas1.compareTo(frutas1));
        System.out.println(frutas2.compareTo(frutas1));

    }

}