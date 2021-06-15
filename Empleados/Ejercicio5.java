package otros.Empleados;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String args []) throws IOException{

        List <Empleados> ListaEmpleados = new ArrayList<>();

        String path = D:/Documents/Java 2021/JAVA 2021/Java-Info2021/Empleados.txt";
        String[] emp;
        try (BufferedReader br = new BufferedReader( new FileReader(path))){
            String line = br.readLine();

            while( line != null) {
                
                emp = line.split(",");
                ListaEmpleados.add(new Empleados(emp[0], emp[1], emp[2], emp[3]));
                System.out.println(line);
                line = br.readLine();
            

            }

            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese una letra");
            char letra = scan.nextLine().charAt(0);
            for (Empleados e: Metodos.getEmpleadosConLetra(ListaEmpleados, letra)) {
                System.out.println(e);

            }

            System.out.println("\nEmpleado más viejo y empleado más joven.");
            Map<String, Empleados> mapa = Metodos.getviejos(ListaEmpleados);
            mapa.forEach((k,v) -> System.out.println(k +
                    ":\nEmpleado: " + v.getNombre() + " " + v.getApellido() +
                    " - Edad: " + v.getEdad()));



            System.out.println("\nEmpleado con mejor y peor salario.");
            Map<String, Empleados> bestPoorSalariesMap = Metodos.getPeorSalario(ListaEmpleados);
            bestPoorSalariesMap.forEach((k,v) -> System.out.println(k +
            ":\nEmpleado: " + v.getNombre() + " " + v.getApellido() +
            " - Salario: " + v.getSalario()));


            System.out.println("\nLista de empleados ordenados alfabeticamente por nombre y apellido:");
        for (Empleados e: Metodos.Ordenar(ListaEmpleados)) {
            System.out.println(e);
        }






        }




        
     



    }











}
