package notas;

import java.util.Scanner;

//clase para comprobar las notas de un alumno
public class Notas { // NOPMD by tzeen on 1/2/23 18:11

//clase main
public static void main(final String[] args) {//comienza la ejecucion // NOPMD by tzeen on 1/2/23 18:14

// Para pedir un dato numérico por teclado	
final Scanner reader = new Scanner(System.in); // NOPMD by tzeen on 1/2/23 18:14
String calificacionAlumno ;
System.out.println("Introduzca el valor de una calificación: "); // NOPMD by tzeen on 1/2/23 18:14
int notaAlumno = reader.nextInt(); // NOPMD by tzeen on 1/2/23 18:14
reader.close();
if (notaAlumno >= 0 && notaAlumno< 5) {	calificacionAlumno  = "Suspenso";}

else if (notaAlumno >= 5 && notaAlumno< 7){	calificacionAlumno  = "Aprobado";}

else if (notaAlumno >= 7 && notaAlumno <9){	calificacionAlumno  = "Notable";}

else if (notaAlumno >= 9 && notaAlumno<= 10){	calificacionAlumno  = "Sobresaliente";}

else {calificacionAlumno  = "El valor de la calificación introducida no es correcta";}

System.out.println(calificacionAlumno ); // NOPMD by tzeen on 1/2/23 18:15

}
}