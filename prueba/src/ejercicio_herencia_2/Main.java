package ejercicio_herencia_2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Tipos de coche");
    System.out.println("1. [c] camioneta");
    System.out.println("2. [l] Carro de lujo");
    System.out.println("3. [v] Vagoneta");
    System.out.println();
    System.out.print("Seleccione la opción correspondiente: ");

    char opcion = sc.nextLine().charAt(0);

    System.out.println("Inserte la marca del vehículo");
    String marca = sc.nextLine();
    System.out.println("Inserte el número de serie del motor");
    int numeroDeSerie = sc.nextInt();
    System.out.println("Inserte el año del modelo");
    int fecha = sc.nextInt();
    System.out.println("Insete el precio del vehículo");
    int precio = sc.nextInt();

    if (opcion == 'c') {
      System.out.println("inserte la capacidad de carga");
      double capacidadCarga = sc.nextDouble();

      System.out.println("inserte la cantidad de ejes");
      int ejes = sc.nextInt();
      System.out.println("inserte la cantidad de rodadas");
      int rodadas = sc.nextInt();

      Camioneta c = new Camioneta(numeroDeSerie, marca, fecha, 0.15, precio, capacidadCarga, ejes, rodadas);
      System.out.printf("El precio de la camioneta con descuento es: %1f", c.getPrecioDescuento());
    }
    if (opcion == 'l') {
      Lujo l = new Lujo(numeroDeSerie, marca, fecha, 0.10, precio);
      System.out.printf("El precio del vehículo de lujo con descuento es: %f", l.getPrecioDescuento());
    }
    if (opcion == 'v') {
      int cantidadPasajeros = sc.nextInt();
      double capacidadCarga = sc.nextDouble();

      Vagoneta v = new Vagoneta(numeroDeSerie, marca, fecha, 0.20, precio, capacidadCarga, cantidadPasajeros);
      System.out.printf("El precio de la vagoneta es: %1f", v.getPrecioDescuento());

    }

    sc.close();
  }
}
