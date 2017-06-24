import java.awt.EventQueue;

import Ventana.VentanaEstacionAnyo;

/*
 * By Paco Gomez
 * Esta ventana unicamente será el main que lanza la ventana
 * 
 * */
public class estacionAnyo {

	public static void main(String[] args) {
		//Lanzamos la ventana que Calculara la letra
		VentanaEstacionAnyo ventanaEstacion = new VentanaEstacionAnyo();
		ventanaEstacion.setVisible(true);	
		
	}
	
	char calculaLetra(int dni)
    {
    String juegoCaracteres="TRWAGMYFPDXBNJZSQVHLCKE";
    int modulo= dni % 23;
    char letra = juegoCaracteres.charAt(modulo);
    return letra; 
    } 

}