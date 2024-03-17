package ejercicio_herencia_1;

public class Vendedor extends Empleado {
  private double salarioMinimo;
  private double valorVenta;

  public Vendedor(String nombre, String departamento, String puesto, double salarioMinimo, double valorVenta) {
    super(nombre, departamento, puesto);
    this.valorVenta = valorVenta;
    this.salarioMinimo = salarioMinimo;

    calcsalarioQuincenal();
  }

  private void calcsalarioQuincenal() {
    salarioQuincenal = salarioMinimo / 2;
    valorVenta *= 0.02;
    salarioQuincenal += valorVenta;
  }
}
