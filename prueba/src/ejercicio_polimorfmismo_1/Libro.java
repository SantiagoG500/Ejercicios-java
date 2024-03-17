package ejercicio_polimorfmismo_1;

abstract class Libro {
  protected String titulo;
  protected String autor;

  protected double precio;
  protected double precioConDescuento;

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public double getPrecioConDescuento() {
    return precioConDescuento;
  }

  public void setTitulo(String value) {
    titulo = value;
  }

  public void setAutor(String value) {
    autor = value;
  }

  abstract void calcDesc();
}
