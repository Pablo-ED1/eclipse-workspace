import java.util.Scanner;
public class Act2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("introduce la preal del c1 ");
    double preal1 = Double.parseDouble(sc.nextLine());
    System.out.print("introduce la pimaginaria del c1 ");
    double pimaginaria1 = Double.parseDouble(sc.nextLine());
    Complejo complejo1 = new Complejo(preal1,pimaginaria1);
    
    System.out.print("introduce la preal del c2 ");
    double preal2 = Double.parseDouble(sc.nextLine());
    System.out.print("introduce la pimaginaria del c2 ");
    double pimaginaria2 = Double.parseDouble(sc.nextLine());
    Complejo complejo2 = new Complejo(preal2,pimaginaria2);
    
    System.out.println("El complejo 1 es: " + complejo1.getParteReal() + " + " + complejo1.getParteImaginaria());
    System.out.println("El complejo 2 es: " + complejo2.getParteReal() + " + " + complejo2.getParteImaginaria());
    
    Complejo suma = complejo1.sumar(complejo2);
    Complejo resta = complejo1.restar(complejo2);
    Complejo multiplicacion = complejo1.multiplicar(complejo2);
    Complejo division = complejo1.dividir(complejo2);
  }
}
