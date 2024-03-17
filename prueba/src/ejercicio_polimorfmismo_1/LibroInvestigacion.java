package ejercicio_polimorfmismo_1;

public class LibroInvestigacion extends Libro {
  private int curso;
  private double descuento;
  private String publicadoPor;

  public int getCurso() {
    return curso;
  }

  public String getPublicadoPor() {
    return publicadoPor;
  }

  public void setDescuento(double value) {
    descuento = value;
    System.out.println(descuento);
    calcDesc();
  }

  public void setPrecio(double value) {
    precio = value;
  }

  public void setCurso(int value) {
    curso = value;
  }

  public void setPublicadoPor(String value) {
    publicadoPor = value;
  }

  @Override
  void calcDesc() {
    double cantidadDescuento = precio * descuento;
    precioConDescuento = precio - cantidadDescuento;
  }

}
