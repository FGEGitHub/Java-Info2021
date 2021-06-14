package otros.Empleados;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empleados {
    private String nombre;
    private String apellido;
    private LocalDate fechaNac;
    private Double salario;
    

    public Empleados(String nombre, String apellido, String fechaNac, String salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac =  LocalDate.parse(fechaNac, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.salario =  Double.parseDouble(salario);



    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
    
        public  String getApellido() {
            return this.apellido;
        }

        public void setFechaNac(String birth) {
            this.fechaNac = LocalDate.parse(birth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }
    
        public LocalDate getFechaNac() {
            return fechaNac;
        }
    
        public void setSalario(Double salario) {
            this.salario = salario;
        }
    
        public Double getSalario() {
            return this.salario;
        }
    
        public int getEdad() {
            Period difference = Period.between(this.fechaNac, LocalDate.now());
            return difference.getYears();
        }


    

}
