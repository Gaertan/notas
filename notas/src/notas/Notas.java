package notas;

import java.util.Scanner;

//clase para comprobar las notas de un alumno
public class Notas { // NOPMD by tzeen on 1/2/23 18:11

//clase main
public static void main(final String[] args) {//comienza la ejecucion // NOPMD by tzeen on 1/2/23 18:14

// Para pedir un dato numérico por teclado	
final Scanner reader = new Scanner(System.in); // NOPMD by tzeen on 1/2/23 18:14
String calificacion;
System.out.println("Introduzca el valor de una calificación: "); // NOPMD by tzeen on 1/2/23 18:14
int nota = reader.nextInt(); // NOPMD by tzeen on 1/2/23 18:14
reader.close();
if (nota >= 0 && nota< 5) {	calificacion = "Suspenso";}

else if (nota >= 5 && nota< 7){	calificacion = "Aprobado";}

else if (nota >= 7 && nota <9){	calificacion = "Notable";}

else if (nota >= 9 && nota<= 10){	calificacion = "Sobresaliente";}

else {calificacion = "El valor de la calificación introducida no es correcta";}

System.out.println(calificacion); // NOPMD by tzeen on 1/2/23 18:15

}
}