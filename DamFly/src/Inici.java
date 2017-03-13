import java.util.Scanner;


public class Inici {

	boolean avio[];
	Scanner sc;
	
	public Inici(int tam){
		sc=new Scanner(System.in);
		if(tam%2==0)
			avio = new boolean[tam];
		else{
			System.out.println("El nombre de places de l'avió ha de ser un nombre parell");
			System.exit(-1);
		}
	}
	
	public static void main(String[] args) {
		
		// Creem un avio amb 80 places
		Inici damFly = new Inici(80);
		int opcio=0;
		do{
			
			do{
				opcio = damFly.menu();
			}while(opcio>3 || opcio<1);
			
			// A partir d'aci, opció valdrà 1, 2 o 3
			switch(opcio){
			case 1: damFly.reservaSeient();
					break;
			case 2: damFly.mostraPlacesAvio();
					break;
			case 3: return;
				
			}
		}while(opcio!=3);
	}

	public int menu(){
		System.out.println("---- MENU ----");
		System.out.println("1.- Reservar Plaça");
		System.out.println("2.- Mostrar places avió");
		System.out.println("3.- Eixir");
		System.out.print(">");
		return sc.nextInt();
	}
	
	public void reservaSeient(){
		// Demanem fumador o no fumador
		boolean fumador,triaSeient;
		
		System.out.println("Fumador? (S/N)");
		String resp = sc.next();
		resp = resp.toLowerCase();
		switch(resp){
			case "s":
			case "si":
				fumador=true;
				break;
			case "n":
			case "no":
			default:
				fumador=false;
				break;
		}
		// Triar seient o assignar el primer lliure
		System.out.println("Triar Seient? (S/N)");
		resp = sc.next();
		resp = resp.toLowerCase();
		switch(resp){
			case "s":
			case "si":
				triaSeient=true;
				break;
			case "n":
			case "no":
			default:
				triaSeient=false;
				break;
		}
		if(triaSeient==true){
			int resultatReserva;
			do{
				resultatReserva= reservaSeient2(fumador);
			} while(resultatReserva==-1);
		}else{
			//assignaPrimerSeientLiure(fumador);
		}
	}
	
	// tornem 0 si el procés ha anat bé. -1 si no s'ha pogut reservar el seient 
	public int reservaSeient2(boolean fuma){
		int rdo;
		int numSeient;
		do{
			rdo=0;
			System.out.println("Introdueix el numero de seient (0.."+(avio.length-1)+")");
			
			numSeient=sc.nextInt();
			if(fuma==true){
				if(numSeient>=40){
					System.out.println("Error, el seient "+numSeient+" correspon a No Fumadors, i vosté ha triat "+(fuma?"Fumadors":"No fumadors"));
					rdo=-1;
				}
			}else{
				// No fuma
				if(numSeient<40){
					System.out.println("Error, el seient "+numSeient+" correspon a Fumadors, i vosté ha triat "+(fuma?"Fumadors":"No fumadors"));
					rdo=-1;
				}
			}
		}while(rdo==-1);
		// les posicions triades són correctes, falta vore si estan reservades o no
		if(avio[numSeient]==false){  // no esta reservada
			avio[numSeient]=true;
			System.out.println("El seient "+numSeient+" ha sigut reservat correctament");
			return 0;
		}else{
			// El seient ja esta reservat
			return -1;
		}
	}
	public void mostraPlacesAvio(){
		// Mostrem la linia principal
		System.out.println();
		System.out.print(" ");
		for(int i=0;i<avio.length/2;i++){
			if(i%10==0)
				System.out.print(" "+i+" ");
			else
				System.out.print("-");
		}
		System.out.print(" | ");
		for(int i=avio.length/2;i<avio.length;i++){
			if(i%10==0)
				System.out.print(" "+i+" ");
			else
				System.out.print("-");
		}
		System.out.println();
		// Mostrem les reserves fetes
		for(int i=0;i<avio.length/2;i++){
			if(i%10==0)
				System.out.print("  "+(avio[i]?" ":"X")+" ");
			else
				System.out.print(avio[i]?" ":"X");
		}
		System.out.print(" | ");
		for(int i=avio.length/2;i<avio.length;i++){
			if(i%10==0)
				System.out.print("  "+(avio[i]?" ":"X")+" ");
			else
				System.out.print(avio[i]?" ":"X");
		}
		System.out.println();	
	}
}
