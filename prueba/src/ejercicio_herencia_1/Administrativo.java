package ejercicio_herencia_1;

public class Administrativo extends Empleado {

  private double sueldoMensual;

  Administrativo(String nombre, String departamento, String puesto, double sueldoMensual) {
    super(nombre, departamento, puesto);
    this.sueldoMensual = sueldoMensual;

    calcSalarioQuincenal();
  }

  private void calcSalarioQuincenal() {
    salarioQuincenal = sueldoMensual / 2;
  }

}
