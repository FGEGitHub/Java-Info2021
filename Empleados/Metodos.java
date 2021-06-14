package otros.Empleados;

import java.util.*;


public class Metodos {

    public static List<Empleados> getEmpleadosConLetra (List<Empleados> emp, char letra) {
        List<Empleados> listaEmp = new ArrayList<>();
        for (Empleados e : emp) {
            String  l = e.getApellido();
           
             if (letra ==  l.charAt(0))            //  VER
               listaEmp.add(e);
        }

        return listaEmp;
    }

    /**
     * This method returns a map with
     * the most old employee and
     * the most young employee
     * @param employees
     * @return
     */
    public static Map<String, Empleados> getviejos(List<Empleados> employees) {
        Map<String, Empleados> mapaEmp = new HashMap<>();
        employees.sort(Comparator.comparing(Empleados::getEdad));

        mapaEmp.put("El Mas joven", employees.get(0));
        mapaEmp.put("El mas Viejo", employees.get(employees.size() - 1));
        return mapaEmp;
    }

    /**
     * Returns 2 employees with the
     * best and poor salary
     * @param employees
     * @return
     */
    public static Map<String, Empleados> getPeorSalario(List<Empleados> e) {
        Map<String, Empleados> MapE = new HashMap<>();
        e.sort(Comparator.comparing(Empleados::getSalario));

        MapE.put("Peor salario", e.get(0));
        MapE.put("Mejor Salario", e.get(e.size() - 1));
        return MapE;
    }

    /**
     * Returns the same list of employees
     * but sorted by name and lastname
     * @param employees
     * @return
     */
    public static List<Empleados> Ordenar(List<Empleados> employees) {
        employees.sort(Comparator.comparing(Empleados::getNombre).thenComparing(Empleados::getApellido));
        return employees;
    }  
}
