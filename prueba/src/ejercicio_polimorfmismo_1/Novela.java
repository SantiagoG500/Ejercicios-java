package ejercicio_polimorfmismo_1;

public class Novela extends Libro {
  private String tipoNovela;
  private double descuento;

  public void setDescuento(double value) {
    descuento = value;
    calcDesc();
  }

  public void setPrecio(double value) {
    precio = value;
  }

  public void setTipoNovela(String value) {
    tipoNovela = value;
  }

  public String getTipoNovela() {
    return tipoNovela;
  }

  @Override
  void calcDesc() {
    double cantidadDescuento = precio * descuento;
    precioConDescuento = precio - cantidadDescuento;
  }

}
