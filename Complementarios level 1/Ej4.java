import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
          

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numero");
        int nro = scan.nextInt();
        
        int resul = 1;
        scan.close();

        for (int i=1; i<=nro; i++){
            resul *= i;
        }
        System.out.println("El resultado es "+resul);


    }
}
