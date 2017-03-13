import java.util.Scanner;

public class CuentaNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero entre 0 y 9.999");
		int numero = sc.nextInt();

		if (numero >= 0 && numero <= 9) {
			System.out.println(numero + " tiene una cifra");
		} else if (numero >= 10 && numero <= 99) {
			System.out.println(numero + " tiene dos cifra");
		} else if (numero >= 100 && numero <= 999) {
			System.out.println(numero + " tiene tres cifra");
		} else if (numero >= 1000 && numero <= 9999) {
			System.out.println(numero + " tiene cuatro cifra");
		}

	}

}
