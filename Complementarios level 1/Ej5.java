import java.util.Scanner;

public class Ej5 {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int resul = 0;
        scan.close();

        for (int i=1; i<= a; i++){
            resul+=b;


        }
        System.out.println("Resultado: "+ resul+" Calculado por sumas sucesivas");
    }
}
