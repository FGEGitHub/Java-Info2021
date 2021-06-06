import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class eje3 {

    public static void main(String[] args) {
      List <Integer> cartas = new ArrayList<>();
      cartas.add(1);
      cartas.add(2);
      cartas.add(3);
      cartas.add(4);
      cartas.add(5);
      cartas.add(6);
      cartas.add(7);
      cartas.add(8);
      cartas.add(9);

      System.out.println(cartas);
      Collections.reverse(cartas);
      System.out.println(cartas); 
      Collections.shuffle(cartas);
      System.out.println(cartas); 





    }
    


}
