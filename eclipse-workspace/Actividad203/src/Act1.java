import java.util.Scanner;
public class Act1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CuentaCorriente cuenta = new CuentaCorriente("1111");
		cuenta.ingresar(1000);
		cuenta.getSaldo();
		cuenta.retirar(1100);
		cuenta.getSaldo();
		cuenta.retirar(900);
		cuenta.getSaldo();
		cuenta.retirar(100);
		cuenta.ingresar(350);
		cuenta.getSaldo();
		cuenta.retirar(400);
		cuenta.getSaldo();
	}
}
