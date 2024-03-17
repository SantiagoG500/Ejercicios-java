package ejercicio_polimorfismo_2;

abstract class Farmacia {
  protected String nombre;
  protected int clave;
  protected double precio;

  protected int cantidad;
  protected int diaCompra;
  // protected String tipoProducto;

  // setters
  public void setNombre(String value) {
    nombre = value;
  }

  public void setClave(int value) {
    clave = value;
  }

  public void setPrecio(double value) {
    precio = value;
  }

  public void setCantidad(int value) {
    cantidad = value;
  }

  public void setDiaCompra(int value) {
    diaCompra = value;
  }

  // getters
  public String getNombre() {
    return nombre;
  }

  public int getClave() {
    return clave;
  }

  public double getPrecio() {
    return precio;
  }

  public int getCantidad() {
    return cantidad;
  }

  public int getDiaCompra() {
    return diaCompra;
  }

  // metodos abstractos
  abstract void calcPrecios();
}
