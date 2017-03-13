import java.util.Scanner;

public class Circulo{
	
public static void main(String[] args) {
	
      Scanner teclado=new Scanner (System.in);
      
      System.out.println("Introduce el radio del circulo");
      int radio=teclado.nextInt();
      double area=Math.pow(radio, 2)*(3.14);
      
      
      System.out.println("Area="+area+"cm2");
      

	}
}

