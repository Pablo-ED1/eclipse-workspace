import java.util.Scanner;

public class FDSA {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("nota");
    System.out.println("-----");
    System.out.print("Introduce la nota 1: ");
    double nota1 = Double.parseDouble(scan.nextLine());
    System.out.print("Introduce la nota 2: ");
    double nota2 = Double.parseDouble(scan.nextLine());
    System.out.print("Introduce la nota 3: ");
    double nota3 = Double.parseDouble(scan.nextLine());
    /* El área tiene dos partes. En la inferior es un rectángulo de lados B y C
     * y en la parte superior un triángulo de base B y altura A - C
     */
    double media = (nota1+nota2+nota3)/3;
    boolean aprobado = media >= 5;
    

    System.out.println("La nota final es " +  aprobado);
  }
}
  