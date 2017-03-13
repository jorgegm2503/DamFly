import java.util.Scanner;
import java.util.ArrayList;

public class Mascotas {
		
	static ArrayList<Mascota> Mascotas = new ArrayList<Mascota>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        leerMascota();
        System.out.println("Mascotas introducidas:");
        mostrarMascota();
        //mostrarPorRaza();
        //mostrarPorEdad();
        Mascota m =mostrarMenorEdad();
        System.out.println("Mascota con menor número de años: " +m.getNombre() +" que tiene "+m.getEdad());
        System.out.println("Mascota ordenados de menor a mayor número de años: ");
        mostrarOrdenadosPorEdad();
    }
   

public static void leerMascota(){

        String nombre;
        int edad;
        String raza;

        int i, n;

        do {
            System.out.print("Número de mascotas? ");
            n = sc.nextInt();
        } while (n < 0);
        sc.nextLine();
        for (i = 1; i <= n; i++) {

            System.out.println("Mascota " + i);
            nombre=sc.nextLine();
            System.out.print("Edad: ");
            edad = sc.nextInt();
            sc.nextLine();
            System.out.print("Raza: ");
            raza = sc.nextLine();
            Mascota unaMascota=new Mascota();
            unaMascota.setNombre(nombre);
            unaMascota.setEdad(edad);
            unaMascota.setRaza(raza);
                      
           
            Mascotas.add(unaMascota);
        }
    } 

  
public static void mostrarMascota(){      
    for(int i = 0; i< Mascotas.size(); i++)
        System.out.println(Mascotas.get(i).getNombre());  
}




public static void mostrarPorRaza(){
    String raza;
    System.out.print("Introduce la raza: ");
    raza = sc.nextLine();
    System.out.println("Mascotas de la raza " + raza);
    for(int i = 0; i<Mascotas.size(); i++){
        if(Mascotas.get(i).getRaza().equalsIgnoreCase(raza))
            System.out.println(Mascotas.get(i));
    }
}


public static void mostrarPorEdad(){
    int edad;
    System.out.print("Introduce la edad: ");
    edad = sc.nextInt();
    System.out.println("Mascotas con menos de " + edad + " años");
    for(int i = 0; i<Mascotas.size(); i++){
        if(Mascotas.get(i).getEdad() < edad)
            System.out.println(Mascotas.get(i));
    }
}


public static Mascota mostrarMenorEdad(){
    Mascota menor = Mascotas.get(0);
    for(int i = 0; i < Mascotas.size(); i++){
        if(Mascotas.get(i).getEdad() < menor.getEdad()){
            menor = Mascotas.get(i);
        }
    }
    return menor;
}



public static void mostrarOrdenadosPorEdad(){
    int i, j;
    Mascota edad;
    for(i=0; i< Mascotas.size()-1; i++)
        for(j=0;j<Mascotas.size()-i-1; j++)
            if(Mascotas.get(j+1).getEdad() < Mascotas.get(j).getEdad()){
                edad = Mascotas.get(j+1);
               Mascotas.set(j+1, Mascotas.get(j));
                Mascotas.set(j, edad);                
            }
    mostrarMascota();
	}
}