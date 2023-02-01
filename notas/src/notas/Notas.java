package notas;

import java.util.Scanner;

//clase para comprobar las notas de un alumno
public class Notas {

//clase main
public static void main(final String[] args) {//comienza la ejecucion 

// Para pedir un dato numérico por teclado	
final Scanner reader = new Scanner(System.in); 
System.out.println("Introduzca el valor de una calificación: "); 
int notaAlumno = reader.nextInt(); 
reader.close();
cali(notaAlumno); 

}

/**aqui el comentario, el código dicta la calificacion dependiendo del parametro de la nota del alumno
 * @param notaAlumno
 */
public static void cali(int notaAlumno) {
	String calificacionAlumno;
	if (notaAlumno >= 0 && notaAlumno< 5) {	calificacionAlumno  = "Suspenso";}
	
	else if (notaAlumno >= 5 && notaAlumno< 7){	calificacionAlumno  = "Aprobado";}
	
	else if (notaAlumno >= 7 && notaAlumno <9){	calificacionAlumno  = "Notable";}
	
	else if (notaAlumno >= 9 && notaAlumno<= 10){	calificacionAlumno  = "Sobresaliente";}
	
	else {calificacionAlumno  = "El valor de la calificación introducida no es correcta";}
	
	System.out.println(calificacionAlumno );
}
}