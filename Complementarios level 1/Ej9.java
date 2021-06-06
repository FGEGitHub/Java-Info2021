import java.util.Scanner;


public class Ej9 {
    

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese Texto");
        String cadena = scan.nextLine();
        System.out.println("Ingrese caracter");
        char letra = scan.nextLine().charAt(0);
        int cant = 0;
        scan.close();

    


        for (int i=0; i<cadena.length(); i++){

            if (letra == cadena.charAt(i)){
                cant+= 1;
            }

        }
        System.out.println(cant);


    }
}
