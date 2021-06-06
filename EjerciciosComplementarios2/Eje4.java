import java.util.ArrayList;
import java.util.List;

public class Eje4 {


    public static void main(String[] args) {
        
        List<String> lista =  new ArrayList<>();
        lista.add("lucas1");
        lista.add("lucas2");
        lista.add("lucas3");
        lista.add("lucas4");
        lista.add("lucas5");
        lista.add("lucas6");
        lista.add("lucas7");
        lista.add("lucas8");
        lista.add("lucas9");
        lista.add("lucas10");
        lista.add("lucas11");
        lista.add("lucas12");


        List<String> lista1 = lista.subList(0,4);
        List<String> lista2 = lista.subList(4,8);
        List<String> lista3 = lista.subList(8,12);
        System.out.println(lista1);
        System.out.println(lista2);
        System.out.println(lista3);



    }
    
}
