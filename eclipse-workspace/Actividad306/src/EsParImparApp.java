import java.util.Scanner;
public class EsParImparApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Introduce un número ");
    int num = Integer.parseInt(sc.nextLine());
    if ((num % 2) == 0) {
      System.out.println("El número es par");
    }else {
      System.out.println("El número es impar");
    }
  }
    
}
