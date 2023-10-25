package prog.unidad01.actividad206;
import java.util.Scanner;
import java.util.Random;
import es.iespablopicasso.programacion.bloque02.figuras.Paralelogramo;
public class ParalelogramosApp {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("EXAMEN DE pablo_aguilera_salinas. PROPIEDADES DE LOS PARALELOGRAMOS");
      
      System.out.print("Introduce la longitud de los lados horizonteles: ");
      double h = Double.parseDouble(sc.nextLine());
      
      //Pedimos los valores maximos y minimos entre los que quiere que mida los lados verticales
      System.out.print("Introduce el límite mínimo de los posibles valores de la longitud del lado vertical ");
      double min = Double.parseDouble(sc.nextLine());
      System.out.print("Introduce el límite máximo de los posibles valores de la longitud del lado vertical ");
      double max = Double.parseDouble(sc.nextLine());
      
      //Se calcula de manera aleatoria la longitud de los lados verticales a partir de los valores maximo y minimo que se han pedido
      Random ran = new Random();
      double v = ran.nextDouble(min,max);
      System.out.print("La longitud del lado vertical obtenida al azar es de: " + v);
      
      //Se crea un paralelogramo con la clase Paralelogramo con los lados que ya teniamos
      Paralelogramo paralelogramo = new Paralelogramo(h, v);
      String areaPerimetro = paralelogramo.getAreaPerimetro();
      System.out.println("El área del paralelogramo vale " + areaPerimetro.substring(0,16));
      System.out.println("El perímetro del paralelogramo vale " + areaPerimetro.substring(17,35));
      
      //Se pide el factor para ampliar o reducir el paralelogramo
      System.out.println("Introduce el factor real positivo por el que quieres ampliar o reducir el paralelogramo: ");
      double zoom = Double.parseDouble(sc.nextLine());
      
  }

}
