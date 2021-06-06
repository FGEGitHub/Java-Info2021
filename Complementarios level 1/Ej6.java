import java.util.Scanner;

public class Ej6 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numeros");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int resul = 1;
        scan.close();

        for (int i= 1; i<= b; i++ ){
            resul *= a;


        }
        System.out.println("El resultado es:"+ resul);
    }
}
