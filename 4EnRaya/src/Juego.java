import java.util.Scanner;

public class Juego {

	private boolean finDelJuego;
	private boolean primerTurno;
	private Tablero tableroDelJuego;
	
	public Juego(){
		finDelJuego=false;
		primerTurno=true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int nomColumna;
		Juego cuatroEnRalla=new Juego();
		cuatroEnRalla.tableroDelJuego=new Tablero(7,10);
		
		if(cuatroEnRalla.tableroDelJuego!=null){
		
		do{
			if(cuatroEnRalla.primerTurno==true){
				Ficha unaFicha= new Ficha('X');
				System.out.println("Turno de"+unaFicha.getSimbolo());
				cuatroEnRalla.primerTurno=false;
				System.out.println("Introduce la columna que quieres");
				nomColumna=sc.next();
			}else{
				Ficha unaFicha= new Ficha('O');
				System.out.println("Turno de"+unaFicha.getSimbolo());
				cuatroEnRalla.primerTurno=true;
				
			}
		}while(cuatroEnRalla.finDelJuego==false);	
	}
		
	}

}
