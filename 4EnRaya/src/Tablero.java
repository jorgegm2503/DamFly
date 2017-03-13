
public class Tablero {

	private Ficha matriz[][];
	
	public Tablero (int numFilas, int numColumnas){
		if(numFilas<4)||(numColumnas){
			System.out.println("El tamaño de tablero tiene que ser mayor de 4x4");
			matriz=null;
			
		}
		
		matriz=new Ficha [numFilas][numColumnas];
	}

	public Ficha[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(Ficha[][] matriz) {
		this.matriz = matriz;
	}
}
