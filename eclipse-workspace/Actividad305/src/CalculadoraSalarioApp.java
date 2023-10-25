import java.util.Scanner;
public class CalculadoraSalarioApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    final int horan = 16;
    final int horae = 20;
    System.out.print("Introduce el número de horas trabajadas: ");
    int horas = Integer.parseInt(sc.nextLine());
    
    if (horas <= 40) {
      System.out.println("Tu sueldo es de: " + (horas * horan));
    }else {
      System.out.println("Tu sueldo es de: " + ((horan * 40) + (horas - 40) * horae));
    }
  }
}
