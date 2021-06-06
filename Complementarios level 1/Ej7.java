import java.util.Scanner;

public class Ej7 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Igrese texto");
        String palabra = scan.nextLine();
        scan.close();
        String palabranueva = "";
        

        for (int i = 0; i< palabra.length(); i++) {

            
            switch (palabra.charAt(i)) {
                case 'a':

                    palabranueva = palabranueva+"A";
                    
                    break;

                case 'b':
                    palabranueva = palabranueva+"B";
                    
                    break;
                case 'c':
                    palabranueva = palabranueva+"C";
                    
                    break;
                case 'd':
                    palabranueva = palabranueva+"D";
                    
                    break;
                    
                case 'e':
                    palabranueva = palabranueva+"E";
                    
                    break;
                
                    
                default:
                    palabranueva = palabranueva+palabra.charAt(i);
            }

        System.out.println(palabranueva);


        }
    }
    
}
