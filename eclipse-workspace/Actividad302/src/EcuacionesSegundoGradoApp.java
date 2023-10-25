import java.util.Scanner;
public class EcuacionesSegundoGradoApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce los valores de tu polinomio para resolver tu ecuación Ax2 + By + C");
    System.out.print("A: ");
    double a = Double.parseDouble(sc.nextLine());
    System.out.print("B: ");
    double b = Double.parseDouble(sc.nextLine());
    System.out.print("C: ");
    double c = Double.parseDouble(sc.nextLine());
    double raiz = Math.sqrt(b  * b - 4 * a * c);
    double sol1 = ((- b + raiz) / (2 * a));
    double sol2 = ((- b - raiz) / (2 * a));
    
    if (raiz < 0) {
      System.out.println("La ecuación no tiene solución");
    }else if (raiz == 0){
      System.out.println("La ecuación tiene una solución: " );
    }else {
      System.out.println("La ecuación tinene dos soluciones: " + sol1 + " y " + sol2);
    }

    
  }
}
