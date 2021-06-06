public class Empleado {
       
  private int dni;
  private String nombre;
  private int horasTrabajadas;
  private int valorPorHora;

  public void setDni(int dni){
    this.dni = dni;
  }
  public void setNombre(String nombre){
      this.nombre = nombre;
    }
  
  public void setHoras(int horasTrabajadas){
        this.horasTrabajadas = horasTrabajadas;
    }
  public void setValor(int valorPorHora){
      this.valorPorHora = valorPorHora;
  }

  public String getNombre(){
      return this.nombre;
    }
  public int getDni(){
      return this.dni;
    }
  public int calcularSueldo() {
    return (this.horasTrabajadas * this.valorPorHora);
  }

  
}
