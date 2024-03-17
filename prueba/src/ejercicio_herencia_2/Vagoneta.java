package ejercicio_herencia_2;

public class Vagoneta extends Vehiculo {
  private int cantidadPasajeros;
  private double capacidadCarga;

  Vagoneta(int numeroDeSerie, String marca, int fecha, double descuento, double precio, double capacidadCarga,
      int cantidadPasajeros) {
    super(numeroDeSerie, marca, fecha, descuento, precio);

    this.capacidadCarga = capacidadCarga;
    this.cantidadPasajeros = cantidadPasajeros;
  }

  public int getCantPasajeros() {
    return cantidadPasajeros;
  }

  public double getCapacidadCarga() {
    return capacidadCarga;
  }
}
