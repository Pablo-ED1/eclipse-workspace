import java.util.Scanner;
public class ClasificaTriangulosApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce la longitud del lado 1: ");
    double l1 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la longitud del lado 2: ");
    double l2 = Double.parseDouble(sc.nextLine());
    System.out.print("Introduce la longitud del lado 3: ");
    double l3 = Double.parseDouble(sc.nextLine());
    
    if ((l1 == l2) && (l1 == l3)) {
      System.out.println("El triángulo es equilátero");
    }else if ((l1 == l2) || (l2 == l3) || (l1 == l3)) {
      System.out.println("El triángulo es isósceles");
    }else {
      System.out.println("El triángulo es escaleno");
    }
  }
}
