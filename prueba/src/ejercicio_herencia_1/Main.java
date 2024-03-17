package ejercicio_herencia_1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Inserta el tipo de trabajador: ");
    System.out.println();
    System.out.println("1) 'A' para Administrativo");
    System.out.println("1) 'M' para Mecánico");
    System.out.println("1) 'V' para Vendedor");

    System.out.println();
    System.out.print("Inserta una opción: ");

    String input = sc.nextLine();
    char opcion = input.charAt(0);
    System.out.println();

    if (opcion == 'A') {
      System.out.print("Inserte el nombre del administrativo: ");
      String nombre = sc.nextLine();
      System.out.println();
      System.out.print("Inserte el departamento del administrativo: ");
      System.out.println();
      String departamento = sc.nextLine();
      System.out.println();
      System.out.print("Inserte el puesto del administrativo: ");
      String puesto = sc.nextLine();
      System.out.println();

      System.out.print("Inserte el salario anual del administrativo: ");
      Double salarioAnual = sc.nextDouble();

      System.out.println();
      Administrativo admin = new Administrativo(nombre, departamento, puesto, salarioAnual);
      System.out.print("El salario quicenal del administrativo es: " + admin.getsalarioQuincenal());

    } else if (opcion == 'M') {
      System.out.print("Inserte el nombre del mecánico: ");
      String nombre = sc.nextLine();
      System.out.print("Inserte el departamento del mecánico: ");
      String departamento = sc.nextLine();
      System.out.print("Inserte el puesto del mecánico: ");
      String puesto = sc.nextLine();

      System.out.print("Inserte La cantidad de trabajos realizados ");
      int trabajosRealizados = sc.nextInt();
      double sumaTrabajos = 0;

      for (int i = 0; i < trabajosRealizados; i++) {
        System.out.printf("Inserte el valor del trabajo #%d ", i + 1);
        sumaTrabajos += sc.nextDouble();
      }

      Mecanico meca = new Mecanico(nombre, departamento, puesto, sumaTrabajos);
      System.out.print("El salario quicenal del mecánico es: " +
          meca.getsalarioQuincenal());
      System.out.println("Mecánico");

    } else if (opcion == 'V') {
      System.out.print("Inserte el nombre del administrativo: ");
      String nombre = sc.nextLine();
      System.out.print("Inserte el departamento del administrativo: ");
      String departamento = sc.nextLine();
      System.out.print("Inserte el puesto del administrativo: ");
      String puesto = sc.nextLine();

      System.out.print("Inserte el salario mínimo: ");
      Double salarioMinimo = sc.nextDouble();
      System.out.print("Inserte el valor del a venta: ");
      Double valorVenta = sc.nextDouble();

      Vendedor vend = new Vendedor(nombre, departamento, puesto, salarioMinimo, valorVenta);

      System.out.print("El salario quincenal del vendedor es: " + vend.getsalarioQuincenal());

    } else {
      System.out.println("Opción no válida");
    }

    sc.close();
  }

}
