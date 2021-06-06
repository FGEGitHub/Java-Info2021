import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nro = scan.nextInt();
        scan.close();
        for (int i=1; i<=10; i++) {
            System.out.println(nro + " * " + i + " = " + nro*i);
        }
    }
}
