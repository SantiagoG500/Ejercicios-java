package ejercicio_polimorfmismo_1;

public class LibroTexto extends Libro {
  private int curso;
  private double descuento;

  public void setDescuento(double value) {
    descuento = value;
  }

  public void setPrecio(double value) {
    precio = value;
    calcDesc();
  }

  public int getCurso() {
    return curso;
  }

  public void setCurso(int value) {
    curso = value;
  }

  @Override
  void calcDesc() {
    double cantidadDescuento = precio * descuento;
    precioConDescuento = precio - cantidadDescuento;
  }
}
