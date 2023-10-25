import java.util.Scanner;
public class NombreMesesApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce un número: ");
    int n = Integer.parseInt(sc.nextLine());
    
    if (n == 1) {
      System.out.println("El mes 1 es Enero");
    }else if (n == 2) {
      System.out.println("El mes 2 es Febrero");
    }else if (n == 3) {
      System.out.println("El mes 3 es Marzo");
    }else if (n == 4) {
      System.out.println("El mes 4 es Abril");
    }else if (n == 5) {
      System.out.println("El mes 5 es Mayo");
    }else if (n == 6) {
      System.out.println("El mes 6 es Junio");
    }else if (n == 7) {
      System.out.println("El mes 7 es Julio");
    }else if (n == 8) {
      System.out.println("El mes 8 es Agosto");
    }else if (n == 9) {
      System.out.println("El mes 9 es Septiembre");
    }else if (n == 10) {
      System.out.println("El mes 10 es Octubre");
    }else if (n == 11) {
      System.out.println("El mes 11 es Noviembre");
    }else if (n == 12) {
      System.out.println("El mes 12 es Diciembre");
    }else {
      System.out.println("Introduce un número válido (del 1 al 12)");
    }
    
  }
}
