import java.util.Scanner;
public class NavajaSuizaCadenasApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el texto de la cadena 1: ");
    String cadena1 = sc.nextLine();
    System.out.print("Introduce el texto de la cadena 2: ");
    String cadena2 = sc.nextLine();
    
    System.out.println("Cadena 1");
    System.out.print("  Longitud: ");
    System.out.println(cadena1.length());
    System.out.print("  Está vacía? ");
    System.out.println(cadena1.isEmpty());
    System.out.print("  Está vacía / blanca? ");
    System.out.println(cadena1.isBlank());
    
    System.out.println("Cadena 2");
    System.out.print("  Longitud: ");
    System.out.println(cadena2.length());
    System.out.print("  Está vacía? ");
    System.out.println(cadena2.isEmpty());
    System.out.print("  Está vacía / blanca? ");
    System.out.println(cadena2.isBlank());
    
    System.out.print("Concatenación: ");
    System.out.println(cadena1 + cadena2);
    
    System.out.print("Son iguales? (sensible a mayusculas): ");
    System.out.println(cadena1.equals(cadena2));
    System.out.print("Son iguales? (no sensible a mayusculas): ");
    System.out.println(cadena1.equalsIgnoreCase(cadena2));
    
    System.out.print("Comparación alfabética (sensible a mayusculas): ");
    System.out.println(cadena1.compareTo(cadena2));
    System.out.print("Comparación alfabética (no sensible a mayusculas): ");
    System.out.println(cadena1.compareToIgnoreCase(cadena2));
    
    System.out.print("Contiene la cadena 1 a la cadena 2? ");
    System.out.println(cadena1.contains(cadena2));
    System.out.print("Empieza la cadena 1 por la cadena 2? ");
    System.out.println(cadena1.startsWith(cadena2));
    System.out.print("Termina la cadena 1 por la cadena 2? ");
    System.out.println(cadena1.endsWith(cadena2));
    
    System.out.print("Primer caracter de la cadena 1: ");
    System.out.println(cadena1.charAt(0));
    System.out.print("Último caracter de la cadena 1: ");
    System.out.println(cadena1.charAt(cadena1.length() - 1));
    System.out.print("Cadena 1 desde el segundo caracter: ");
    System.out.println(cadena1.substring(1));
    System.out.print("Cadena 1 en mayusculas: ");
    System.out.println(cadena1.toUpperCase());
    System.out.print("Cadena 1 en minusculas: ");
    System.out.println(cadena1.toLowerCase());
  }
}
