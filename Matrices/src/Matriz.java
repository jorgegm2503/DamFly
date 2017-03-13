import java.util.Scanner;


public class Matriz {
	
	int matriz1[][];
	int matriz2[][];
	int matriz3[][];
	
	public Matriz(int numFiles, int numCol){
		matriz1= new int[numFiles][numCol];
		matriz2= new int[numFiles][numCol];
		matriz3= new int[numFiles][numCol];
		
	}
	
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el numero de filas");
		int valorFiles=teclado.nextInt();
		System.out.println("Introduce el numero de columnas");
		int valorCol=teclado.nextInt();
		System.out.println("Introduce el valor de la matriz 1");
		int valorMatriz1=teclado.nextInt();
		System.out.println("Introduce el valor de la matriz 2");
		int valorMatriz2=teclado.nextInt();
		Matriz miMatriz=new Matriz(valorFiles,valorCol);
		miMatriz.llenarMatriz(valorMatriz1, valorMatriz2);
		
		
		int opcion=miMatriz.menu();
		switch(opcion){
		case 1: miMatriz.matriz3=sumaMatrices(miMatriz.matriz1, miMatriz.matriz2);
				muestraMatriz(miMatriz.matriz3);
			break;
		case 2: miMatriz.matriz3=restaMatrices(miMatriz.matriz1, miMatriz.matriz2);
				muestraMatriz(miMatriz.matriz3);
			break;
		case 3: miMatriz.matriz3=multiplicaMatrices(miMatriz.matriz1, miMatriz.matriz2);
				muestraMatriz(miMatriz.matriz3);
			break;
		case 4: System.out.println("Cerrar programa");
			break;
		default: System.out.println("Opcion Incorrecta");
		
		}
	}
	
	public void llenarMatriz(int valorMatriz1, int valorMatriz2){
		for(int i=0; i<matriz1.length; i++){
			for(int j=0; j<matriz1[i].length; j++){
				matriz1[i][j]= valorMatriz1;
			}
		}
		for(int a=0; a<matriz2.length; a++){
			for(int b=0; b<matriz2.length; b++){
				matriz2[a][b]= valorMatriz2;
			}
		}

		
	}
	 
	public int menu(){
		Scanner teclado=new Scanner(System.in);
		int opcion=0;
		do{
		System.out.println("**OPCIONES**");
		System.out.println("1- Sumar las matrices");
		System.out.println("2- Restar las matrices");
		System.out.println("3- Multiplicar matrices");
		System.out.println("4- Salir");
		opcion = teclado.nextInt();
		
		}while ((opcion<1)||(opcion>3));
		return opcion;
	}
	
	public static int[][] sumaMatrices(int matriz1[][], int matriz2[][]){
		int resultado1[][]=new int[matriz1.length][matriz1[0].length];
		for(int fila=0; fila<matriz1.length; fila++){
			for(int col=0; col<matriz1[fila].length; col++){
				resultado1[fila][col]=matriz1[fila][col]+matriz2[fila][col];
			}
		}
		return resultado1;
		
		
	}
	
	public static int[][] restaMatrices(int matriz1[][], int matriz2[][]){
		int resultado[][]=new int[matriz1.length][matriz1[0].length];
		for(int fila=0; fila<matriz1.length; fila++){
			for(int col=0; col<matriz1[fila].length; col++){
				resultado[fila][col]=matriz1[fila][col]-matriz2[fila][col];
			}
		}
		return resultado;
	}
	public static int[][] multiplicaMatrices(int matriz1[][], int matriz2[][]){
		int resultado2[][]=new int[matriz1.length][matriz1[0].length];
		for(int fila=0; fila<matriz1.length; fila++){
			for(int col=0; col<matriz1.length; col++){
				resultado2[fila][col]=matriz1[fila][col]*matriz2[fila][col];
			}
		}
		return resultado2;
	}
	
	public static void muestraMatriz(int matriz3[][]){
		for(int a=0; a<matriz3.length; a++){
			for(int b=0; b<matriz3.length; b++){
				
		System.out.print(matriz3[a][b]);
		}
	System.out.println();
			}
		}
	}