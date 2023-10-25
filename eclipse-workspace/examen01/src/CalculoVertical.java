import java.util.Scanner;
public class CalculoVertical {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("EXAMEN DE PABLO AGUILERA SALINAS. CALCULO DE LANZAMIENTO VERTICAL");
	final double G = 9.8; 
	final double PIE = 3.28;
	System.out.print("Introduce la velocidad inicial del objeto (en m/s): ");
	double v = Double.parseDouble(sc.nextLine());
	double t = v/G;
	double h = v*t-(G*t*t)/2;
	System.out.print("La altura máxima en metros es de ");
	System.out.println(h);
	System.out.print("Esta altuta equivale a ");
	int pies =  (int)(h * PIE);
	System.out.print(pies); 
	System.out.println(" pies");
	System.out.print("El tiempo necesario es de ");
	System.out.print(t);
	System.out.print(" segundos");
  }
}
