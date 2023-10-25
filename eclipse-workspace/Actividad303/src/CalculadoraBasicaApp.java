import java.util.Scanner;
public class CalculadoraBasicaApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Elije una operación: Suma(r), Resta(r), multiplicación(m) o división(d): ");
    String op = sc.nextLine().toLowerCase();
    System.out.println("Introduce dos numeros: ");
    double n1 = Double.parseDouble(sc.nextLine());
    double n2 = Double.parseDouble(sc.nextLine());
    if (op == "s") {
      System.out.println("El resultado de la suma es: " + n1 + n2);
    }else if (op == "r") {
      System.out.println("El resultado de la resta es: " + (n1 - n2));
    }else if (op == "m") {
      System.out.println("El resultado de la multiplicación es: " + n1 * n2);
    }else if (op == "d") {
      System.out.println("El resultado de la división es: " + n1 / n2);
    }else {
      System.out.println("Opción incorrecta, introduzca una letra válida");
    }
  }
}
