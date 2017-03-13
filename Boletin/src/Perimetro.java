import java.util.Scanner;

public class Perimetro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el radio");
		double radio=sc.nextInt();
		double pi=3.14;
		double perimetro=2*pi*radio;
		System.out.println("El perimetro del circulo es: "+perimetro);

	}

}
