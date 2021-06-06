import java.util.Scanner;

public class Eje1 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese ciudad favorita");
        String ciudad = scan.nextLine();
        System.out.println("Ingrese segunda ciudad favorita");
        String ciudad2 = scan.nextLine();
        System.out.println("Ingrese tercera ciudad favorita");
        String ciudad3 = scan.nextLine();
        String[] arreglo =  {ciudad,ciudad2,ciudad3} ;

        scan.close();
        System.out.println("#1: "+arreglo[0]);
        System.out.println("#2: "+arreglo[1]);
        System.out.println("#1: "+arreglo[2]);
        


    }
    
}
