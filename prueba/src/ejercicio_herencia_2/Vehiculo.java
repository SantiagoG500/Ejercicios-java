package ejercicio_herencia_2;

public class Vehiculo {
  protected int numeroDeSerie;
  protected String marca;
  protected int fecha;

  protected double precio;
  protected double descuento;
  protected double precioConDescuento;

  Vehiculo(int numeroDeSerie, String marca, int fecha, double descuento, double precio) {
    this.numeroDeSerie = numeroDeSerie;
    this.marca = marca;
    this.fecha = fecha;
    this.descuento = descuento;
    this.precio = precio;
    // this.precioConDescuento = precioConDescuento;

    calcDescuento();
  }

  public void calcDescuento() {
    precioConDescuento = precio * descuento;
  }

  public double getDescuento() {
    return descuento;
  }

  public double getPrecioDescuento() {
    return precioConDescuento;
  }

}
