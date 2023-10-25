import java.util.Scanner;

import es.iespablopicasso.programacion.unidad02.actividad0201.GranHermano;
public class Act1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    GranHermano uno = new GranHermano(12);
    GranHermano dos = new GranHermano(65);
    GranHermano tres = new GranHermano(33);

    System.out.println("Hermanos: ");
    System.out.print(GranHermano.getNumeroObjetosCreados());
  }
}