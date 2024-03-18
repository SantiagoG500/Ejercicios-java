package ejercicio_polimorfismo_2;

public class Abarrote extends Farmacia {
  private double descuento;
  private double precioTotal;
  private double totalConDescuento;

  public void setDescuento(double value) {
    descuento = value;
    calcPrecios();
  }

  public double getPrecio() {
    if (diaCompra == 3 || diaCompra == 5)
      return totalConDescuento;
    else
      return precioTotal;
  }

  @Override
  void calcPrecios() {
    for (int i = 1; i <= cantidad; i++) {
      System.out.println(i);
      precioTotal += precio;
    }
    if (cantidad > 1) {
      double precioDescuento = precio * descuento;

      for (int i = 1; i <= cantidad; i++) {
        totalConDescuento += precioDescuento;
      }
    }

  }

}
