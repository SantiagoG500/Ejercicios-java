package ejercicio_herencia_1;

public class Empleado {
  protected String nombre;
  protected String departamento;
  protected String puesto;

  protected double salarioQuincenal;

  Empleado(String nombre, String departamento, String puesto) {
    this.nombre = nombre;
    this.departamento = departamento;
    this.puesto = puesto;
  }

  public double getsalarioQuincenal() {
    return salarioQuincenal;
  }

}
