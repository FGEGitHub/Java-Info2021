import java.util.Scanner;

public class Ej3 {
    

    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    int nro = scan.nextInt();
    scan.close();
    for (int i=1; i<=nro ;i++){
        for (int j=1; j< i; j++){
            System.out.print(j);
        }
        System.out.println(i);

    }

    }
}
