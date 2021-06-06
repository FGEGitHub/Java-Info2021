import java.util.Scanner;


public class Ej8 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese Nombre y Apellido");
        String nombre = scan.nextLine();
        System.out.println("Ingrese Edad");
        int edad = scan.nextInt();
        System.out.println("ingrese direccion");
        String direccion = scan.nextLine();
        System.out.println("Ingrese Ciudad");
        String ciudad = scan.nextLine();
        System.out.println(ciudad+" - "+direccion+" - "+edad+" - "+nombre);
        scan.close();



    }

}
