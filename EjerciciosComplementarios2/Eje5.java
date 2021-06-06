import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Eje5 {

    public static void main(String[] args) {
        

        List<Integer> array1 =  new ArrayList<>();
        List<Integer> array2 =  new ArrayList<>();
        List<Integer> array3 =  new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        for (int i=0; i < 5; i++){
            System.out.println("Ingrese horas trabajadas");
            array1.add(scan.nextInt());

        }
        for (int i=0; i < 5; i++){
            System.out.println("Ingrese valor de horas");
            array2.add(scan.nextInt());

        }
        scan.close();

        System.out.println("Horas trabajadas: " + array1);
        System.out.println("Valor de horas: " + array2);

        for (int i=0; i < 5; i++){
            array3.add(array1.get(i)*array2.get(i));

        }
        System.out.println("Salario:" + array3);
        

        



    }
    
}
