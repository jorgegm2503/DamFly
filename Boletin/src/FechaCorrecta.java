import java.util.Scanner;

public class FechaCorrecta {

	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		int dia, mes, a�o;
		// para que una fecha sea correcta se tiene que cumplir
		// d�a en el rango 1..30
		// mes en el rango 1..12
		// a�o cualquiera distinto del 0
		System.out.print("Introduzca d�a: ");
		dia = Entrada.nextInt();
		System.out.print("Introduzca mes: ");
		mes = Entrada.nextInt();
		System.out.print("Introduzca a�o: ");
		a�o = Entrada.nextInt();
		if (dia >= 1 && dia <= 30)
			if (mes >= 1 && mes <= 12)
				if (a�o != 0) {
					System.out.println("Fecha correcta");
				} else {
					System.out.println("A�o incorrecto");
				}
			else {
				System.out.println("Mes incorrecto");
			}
		else {
			System.out.println("D�a incorrecto");
		}
	}
}
