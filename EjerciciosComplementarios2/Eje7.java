import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Eje7 {
 
    

    public static void main(String[] args) {
        List <String> lista = new ArrayList<String>();


        

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese numeros ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        for (int i=a; i<= b; i++){

            String x = verificar(i,a,b);
            lista.add(x);


        }
        
       System.out.println(lista); 


    }
    public static String verificar (int i, int a, int b) {

                if ((i==a)||(i==b) ){
                String x = String.valueOf(i);
                return x;
            }
            else{
                    if ((i%2==0) && (i%3==0) ){
                    
                        String x = ("FizzBuzz");
                        return x;

                    }
                    else if (i%2==0){
                        
                        String x = ("Fizz");
                        return x;

                    }
                    else if (i%3==0){
                        String x = ("Buzz");
                        return x;
                               }
                    else {
                        String x = String.valueOf(i);
                        return x;
            
                    }
                }

        
        

    }
}
    



