import java.util.ArrayList;
import java.util.List;

public class main {

public static void main(String[]args){
    List<Byte[]>fotosNaMemoria=new ArrayList<>();
    int cont=0;

    while(true){
        //simula uma foto de 10 MB (10*1024*1024 bytes)
        byte[]fotoAltaResolucao=new byte[10*1024*1024];

        fotosNaMemoria.add(fotoAltaResolucao);
        cont++;

        System.out.println("fotos carregadas:"+cont+
            "("+(+cont*10)+"MB)");
        }
    }
}