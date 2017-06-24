package Logica;
import javax.swing.JOptionPane;

public class CalcularEstacion{

 public static void main(String args[]){
 
  String valor=JOptionPane.showInputDialog("Introduce un numero de mes");
  int mes=Integer.parseInt(valor);
 
  switch(mes){
  
   case 3:
   case 4:
   case 5:
    System.out.println("Estas en Primavera");
   break;
   
   case 6:
   case 7:
   case 8:
    System.out.println("Estas en Verano");
   break;
   
   case 9:
   case 10:
   case 11:
    System.out.println("Estas en Otoño");
   break;
   
   case 12:
   case 1:
   case 2:
    System.out.println("Estas en Invierno");
   break;
   
   default:
    System.out.println("Mes y estacion no existen");
  }
 }
}