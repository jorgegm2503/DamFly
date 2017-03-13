import java.util.Scanner;

public class UnaMatriuIrregular {
	Fruita laMatriu[][];
	String diesSetmana[] = { "dilluns", "dimarts", "dimecres", "dijous", "divendres", "disabte", "diumenge" };

	public static void main(String[] args) {
		UnaMatriuIrregular umi = new UnaMatriuIrregular();

		umi.construeixMatriuIrregular();
		umi.omplirMatriuAmbFruites();
	}

	public void construeixMatriuIrregular() {
		Scanner sc = new Scanner(System.in);
		// Construim el numero de files
		int numDies;
		do {
			System.out.println("Introduiu el numero de dies");
			numDies = sc.nextInt();
		} while (numDies > 7 || numDies < 0);

		this.laMatriu = new Fruita[numDies][];
		// PER A CADA FILA: construim el numero de columnes que necessitem
		for (int fila = 0; fila < this.laMatriu.length; fila++) {
			System.out.println("Introduiu el numero de fruites del " + diesSetmana[fila]);
			int numFruites = sc.nextInt();
			this.laMatriu[fila] = new Fruita[numFruites];

		}
	}

	public void omplirMatriuAmbFruites() {

		for (int fila = 0; fila < laMatriu.length; fila++) {
			for (int columna = 0; columna < laMatriu[fila].length; columna++) {
				Fruita unaFruita = demanaDadesFruita(fila, columna);
				// Guardar l'objecte Fruita en la matriu
				laMatriu[fila][columna] = unaFruita;
			}
		}
	}

	public Fruita demanaDadesFruita(int fila, int columna) {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"dia: " + diesSetmana[fila] + " fruita numero: " + (columna + 1) + "/" + laMatriu[fila].length);
		// demanar les dades de la Fruita
		System.out.print("Nom de la Fruita:");
		String nomFruita = sc.nextLine();
		System.out.println();
		System.out.print("Quantitat en Kg:");
		float kgFruita = sc.nextFloat();
		System.out.println();
		// Construir un objecte Fruita
		Fruita unaFruita = new Fruita(nomFruita, kgFruita);

		return unaFruita;
	}

	/*public int buscaPos(String nFruta) {
		String arrayTotales[];
		int pos = 0;
		for (int i = 0; i < arrayTotales.length; i++) {
			Fruita unaFruita = arrayTotales[i];
			if (unaFruita = null) {
				if (nFruita.compareTo(unaFruita.getNom()) == 0) {
					pos = i;
					break;
				}
			}
		}
		return pos;
	}*/

}
