import java.util.ArrayList;
import java.util.List;

public class Eje2 {


    public static void main(String[] args) {
        
        List <Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        System.out.println("tamaño de la lista: "+lista.size());
        System.out.println(lista);
        lista.add(0,0);
        lista.add(4);
        System.out.println(lista);
        System.out.println("tamaño de la lista: "+lista.size());
        


    }
    
}
