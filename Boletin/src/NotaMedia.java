import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce las 3 notas");
		int nota1 = sc.nextInt();
		int nota2 = sc.nextInt();
		int nota3 = sc.nextInt();
		float media = (nota1 + nota2 + nota3) / 3;

		if (media >= 5) {
			System.out.println("La nota media est� aprobada:" + media);
		} else {
			System.out.println("La nota media esta suspendida" + media);
		}
	}

}
