import java.util.Scanner;

public class Ej2 {

    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
     
        System.out.println(a+"+"+b+"="+ (a+b));
        System.out.println(a+"-"+b+"="+ (a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"/"+b+"="+(a/b));
        scan.close();
        


    }
}
