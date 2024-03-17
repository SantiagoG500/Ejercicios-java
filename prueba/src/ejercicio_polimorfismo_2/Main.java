package ejercicio_polimorfismo_2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println();
    System.out.println("Opciones de producto disponibles");
    System.out.println();
    System.out.println("1. [a] Abarrote");
    System.out.println("2. [m] Medicamento");
    System.out.println();

    System.out.print("Seleccione una de las opciones: ");
    char opcion = sc.nextLine().charAt(0);
    System.out.println();

    if (opcion == 'a') {
      Abarrote a = new Abarrote();

      System.out.println("Nombre del abarrote: ");
      String nombre = sc.nextLine();
      System.out.println("Clave del producto: ");
      int clave = sc.nextInt();
      System.out.println("Dia de compra: ");
      int dia = sc.nextInt();
      System.out.println("Unidades del producto: ");
      int cantidad = sc.nextInt();

      System.out.println("Precio: ");
      double precio = sc.nextDouble();
      System.out.println("Descuento: ");
      double descuento = sc.nextDouble();
      System.out.println();

      while (dia > 7) {
        System.out.println("El día no puede ser mayor a 7");
        System.out.println("Inserte le día de nuevo: ");
        dia = sc.nextInt();

        System.out.println();
      }
      while (descuento < 0) {
        System.out.println("El descuento no puede ser negativo ");
        System.out.print("Insertela el descuento de nuevo: ");
        descuento = sc.nextDouble();

        System.out.println();
      }
      while (precio < 0) {
        System.out.println("El precio no puede ser negativo ");
        System.out.print("Insertela el precio de nuevo: ");
        precio = sc.nextDouble();

        System.out.println();
      }
      while (cantidad < 0) {
        System.out.println("La cantidad de productodes no puede ser negativo ");
        System.out.print("Inserte la el cantidad de nuevo: ");
        cantidad = sc.nextInt();

        System.out.println();
      }

      a.setNombre(nombre);
      a.setClave(clave);
      a.setDiaCompra(dia);

      a.setCantidad(cantidad);
      a.setPrecio(precio);
      a.setDescuento(descuento);

      System.out.println();

      System.out.println("Nombre: " + a.getNombre());
      System.out.println("Clave: " + a.getClave());
      System.out.println("Día de compra: " + a.getDiaCompra());
      System.out.println("Precio: " + a.getPrecio());
      System.out.println("Cantidad: " + a.getCantidad());
    }
    if (opcion == 'm') {
      Medicamento m = new Medicamento();

      System.out.println("Nombre del medicamento: ");
      String nombre = sc.nextLine();
      System.out.println("Clave del producto: ");
      int clave = sc.nextInt();
      System.out.println("Dia de compra: ");
      int dia = sc.nextInt();
      System.out.println("Unidades del producto: ");
      int cantidad = sc.nextInt();

      System.out.println("Precio: ");
      double precio = sc.nextDouble();
      System.out.println("Descuento: ");
      double descuento = sc.nextDouble();
      System.out.println();

      while (dia > 7) {
        System.out.println("El día no puede ser mayor a 7");
        System.out.println("Inserte le día de nuevo: ");
        dia = sc.nextInt();

        System.out.println();
      }
      while (descuento < 0) {
        System.out.println("El descuento no puede ser negativo ");
        System.out.print("Insertela el descuento de nuevo: ");
        descuento = sc.nextDouble();

        System.out.println();
      }
      while (precio < 0) {
        System.out.println("El precio no puede ser negativo ");
        System.out.print("Insertela el precio de nuevo: ");
        precio = sc.nextDouble();

        System.out.println();
      }
      while (cantidad < 0) {
        System.out.println("La cantidad de productodes no puede ser negativo ");
        System.out.print("Inserte la el cantidad de nuevo: ");
        cantidad = sc.nextInt();

        System.out.println();
      }

      m.setNombre(nombre);
      m.setClave(clave);
      m.setDiaCompra(dia);

      m.setCantidad(cantidad);
      m.setPrecio(precio);
      m.setDescuento(descuento);

      System.out.println();

      System.out.println("Nombre: " + m.getNombre());
      System.out.println("Clave: " + m.getClave());
      System.out.println("Día de compra: " + m.getDiaCompra());
      System.out.println("Precio: " + m.getPrecio());
      System.out.println("Cantidad: " + m.getCantidad());
    }

    sc.close();
  }
}
