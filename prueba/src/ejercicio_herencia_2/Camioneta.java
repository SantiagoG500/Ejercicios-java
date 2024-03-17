package ejercicio_herencia_2;

public class Camioneta extends Vehiculo {
  private double capacidadCarga;
  private int ejes;
  private int rodadas;

  Camioneta(int numeroDeSerie, String marca, int fecha, double descuento, double precio,
      double capacidadCarga, int ejes, int rodadas) {
    super(numeroDeSerie, marca, fecha, descuento, precio);
    this.capacidadCarga = capacidadCarga;
    this.ejes = ejes;
    this.rodadas = rodadas;
  }

  public double getCapacidadCarga() {
    return capacidadCarga;
  }

  public int getEjes() {
    return ejes;
  }

  public int getRodadas() {
    return rodadas;
  }
}
