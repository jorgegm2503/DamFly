import java.util.Scanner;

public class BuclesEj4 {

	int suma;
	int numeros;
	
	public static void main(String[] args) {


		
	}
	
	public int pideNumeros(){
		Scanner sc=new Scanner(System.in);
		numeros=sc.nextInt();
		do{
			System.out.println("Introduce los numeros que quieres sumar");
			numeros=sc.nextInt();
			suma=numeros+numeros;
			
		}while(numeros!=0);
			
		System.out.println("La suma de los numeros es: "+suma);
		return suma;
	}
	

}
