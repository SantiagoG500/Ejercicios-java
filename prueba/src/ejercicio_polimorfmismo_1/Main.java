package ejercicio_polimorfmismo_1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println();
    System.out.println("Seleccione uno de los siguientes libros");
    System.out.println();
    System.out.println("1. [t] Libro de texto");
    System.out.println("2. [u] Libre de investigación UDEC ");
    System.out.println("3. [n] Novelas");
    System.out.println();

    System.out.print("Seleccione una de las opciones: ");
    char opcion = sc.nextLine().charAt(0);
    System.out.println();

    System.out.print("Inserte el título del libro: ");
    String titlo = sc.nextLine();
    System.out.print("Autor del libro: ");
    String autor = sc.nextLine();

    System.out.print("Precio del libro: ");
    double precio = sc.nextDouble();
    System.out.println();

    if (opcion == 't') {
      System.out.print("Curso sociado al libro: ");
      int curso = sc.nextInt();

      LibroTexto l = new LibroTexto();

      l.setTitulo(titlo);
      l.setAutor(autor);

      l.setDescuento(0.4);
      l.setPrecio(precio);

      l.setCurso(curso);

      System.out.println();
      System.out.println("Título: " + l.getTitulo());
      System.out.println("Autor: " + l.getAutor());

      System.out.println("Precio: " + l.getPrecioConDescuento());
      System.out.println("curso asociado al libro: " + l.getCurso());
    }
    if (opcion == 'u') {
      System.out.print("Facultad publicadora: ");
      sc.nextLine();
      String facultad = sc.nextLine();
      System.out.println();

      LibroInvestigacion l = new LibroInvestigacion();

      l.setTitulo(titlo);
      l.setAutor(autor);

      l.setPrecio(precio);
      l.setDescuento(0.25);

      l.setPublicadoPor(facultad);

      System.out.println("Título: " + l.getTitulo());
      System.out.println("Autor: " + l.getAutor());

      System.out.println("Precio: " + l.getPrecioConDescuento());
      System.out.println("Libro publicado por: " + l.getPublicadoPor());
    }
    if (opcion == 'n') {
      System.out.print("Genero de la novela: ");
      sc.nextLine();
      String genero = sc.nextLine();

      Novela l = new Novela();

      l.setTitulo(titlo);
      l.setAutor(autor);

      l.setPrecio(precio);
      l.setDescuento(0.15);

      l.setTipoNovela(genero);

      System.out.println("Título: " + l.getTitulo());
      System.out.println("Autor: " + l.getAutor());

      System.out.println("Precio: " + l.getPrecioConDescuento());
      System.out.println("Genero de la novela: " + l.getTipoNovela());
    }

    sc.close();
  }
}
