import java.util.Scanner;

public class MenorAMayor {

	public static void main(String[] args) {
		int mayor = 0;
		int menor = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce numero 1:");
		int n1 = sc.nextInt();
		System.out.println("Introduce numero 2:");
		int n2 = sc.nextInt();
		System.out.println("Introduce numero 3:");
		int n3 = sc.nextInt();

		if (n1 >= n2 && n1 >= n3) {
			mayor = n1;
		} else if (n2 >= n1 && n2 >= n3) {
			mayor = n2;
		} else if (n3 >= n1 && n3 >= n2) {
			mayor = n3;
		} else if (n1 <= n2 && n1 <= n3) {
			menor = n1;
		} else if (n2 <= n1 && n2 < n3) {
			menor = n2;
		} else if (n3 >= n1 && n3 >= n2) {
			menor = n3;
		}
		int medio = (n1 + n2 + n3) - (mayor + menor);

		System.out.println("Numero de menor a mayor " + menor + " " + medio + " " + mayor);
	}

}
