import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;




public class Eje6 {

    
    

    public static void main(String[] args) {

        Set<Empleado> nombresa = new HashSet<>();

        Map<Integer,Integer> DNI = new HashMap<>();
   

     
        Empleado person1 = new Empleado();
        Empleado person2 = new Empleado();
        
        person1.setDni(34821515);
        person1.setNombre("Pabler");
        person1.setHoras(5);
        person1.setValor(10);
        
        nombresa.add(person1);

        person2.setDni(12345678);
        person2.setNombre("22121");
        person2.setHoras(6);
        person2.setValor(10);
        
        nombresa.add(person2);


        for (Empleado d: nombresa){

            DNI.put(d.getDni(),d.calcularSueldo());
            d.getDni();

        }
        
        for (Map.Entry<Integer,Integer> registro: DNI.entrySet()){
            System.out.println("DNI: " + registro.getKey() + " Saldo: " + registro.getValue());

        }
            

        
            
        

       

        
        


    }

    
}

