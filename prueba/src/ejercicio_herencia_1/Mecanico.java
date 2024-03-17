package ejercicio_herencia_1;

public class Mecanico extends Empleado {
  private double trabajos;

  Mecanico(String nombre, String departamento, String puesto, double trabajos) {
    super(nombre, departamento, puesto);
    this.trabajos = trabajos;

    calcSalarioQuincenal();
  }

  private void calcSalarioQuincenal() {
    salarioQuincenal = trabajos * 0.04;
  }
}
