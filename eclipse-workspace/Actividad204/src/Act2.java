import java.util.Scanner;
public class Act2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el numerador de la fraccion 1 ");
    int numerador = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce el denominador de la fraccion 1 ");
    int denominador = Integer.parseInt(sc.nextLine());
    paquete1.Fraccion fraccion1 = new paquete1.Fraccion(numerador,denominador);
    
    System.out.print("Introduce el numerador de la fraccion 2 ");
    numerador = Integer.parseInt(sc.nextLine());
    System.out.print("Introduce el denominador de la fraccion 2 ");
    denominador = Integer.parseInt(sc.nextLine());
    paquete1.Fraccion fraccion2 = new paquete1.Fraccion(numerador,denominador);
    
    paquete1.Fraccion suma = fraccion1.suma(fraccion2);
    paquete1.Fraccion resta = fraccion1.resta(fraccion2);
    paquete1.Fraccion producto = fraccion1.producto(fraccion2);
    paquete1.Fraccion division = fraccion1.division(fraccion2);
    
    System.out.print("La suma de las dos fracciones es: ");
    System.out.println(suma.getNumerador() + ("/") + (suma.getDenominador()));
    System.out.print("La resta de las dos fracciones es: ");
    System.out.println(resta.getNumerador() + ("/") + (resta.getDenominador()));
    System.out.print("El producto de las dos fracciones es: ");
    System.out.println(producto.getNumerador() + ("/") + (producto.getDenominador()));
    System.out.print("La división de las dos fracciones es: ");
    System.out.println(division.getNumerador() + ("/") + (division.getDenominador()));
    
    paquete2.Fraccion suma2 = new paquete2.Fraccion(suma.getNumerador(), suma.getDenominador()).simplifica();
    paquete2.Fraccion resta2 = new paquete2.Fraccion(resta.getNumerador(), resta.getDenominador()).simplifica();
    paquete2.Fraccion producto2 = new paquete2.Fraccion(producto.getNumerador(), producto.getDenominador()).simplifica();
    paquete2.Fraccion division2 = new paquete2.Fraccion(division.getNumerador(), division.getDenominador()).simplifica();
    
    suma2.simplifica();
    resta2.simplifica();
    producto2.simplifica();
    division2.simplifica();
    
    System.out.print("La suma simplificada es: ");
    System.out.println(suma2.getNum() + ("/") + (suma2.getDen()));
    System.out.print("La resta simplificada es: ");
    System.out.println(resta2.getNum() + ("/") + (resta2.getDen()));
    System.out.print("El producto simplificada es: ");
    System.out.println(producto2.getNum() + ("/") + (producto2.getDen()));
    System.out.print("La division simplificada es: ");
    System.out.println(division2.getNum() + ("/") + (division2.getDen()));
  }
}