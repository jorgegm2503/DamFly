import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce una nota");
		int nota = sc.nextInt();

		if (nota == 10 || nota == 9) {
			System.out.println(nota + " es un Sobresaliente");
		} else if (nota == 8 || nota == 7) {
			System.out.println(nota + " es un Notable");
		} else if (nota == 6) {
			System.out.println(nota + " es un Bien");
		} else if (nota == 5) {
			System.out.println(nota + " es un Suficiente");
		} else if (nota <= 4) {
			System.out.println(nota + " es un Insuficiente");
		}
	}

}
