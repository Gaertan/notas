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
califica(notaAlumno); 

}

/**aqui el comentario, el código dicta la calificacion dependiendo del parametro de la nota del alumno
 * @param notaAlumno
 * @deprecated Use {@link #califica(int)} instead
 */
public static void cali(int notaAlumno) {
	califica(notaAlumno);
}

/**aqui el comentario, el código dicta la calificacion dependiendo del parametro de la nota del alumno
 * @param num_nota
 */
public static void califica(int num_nota) {
	String calificacionAlumno;
	if (num_nota >= 0 && num_nota< 5) {	calificacionAlumno  = "Suspenso";}
	
	else if (num_nota >= 5 && num_nota< 7){	calificacionAlumno  = "Aprobado";}
	
	else if (num_nota >= 7 && num_nota <9){	calificacionAlumno  = "Notable";}
	
	else if (num_nota >= 9 && num_nota<= 10){	calificacionAlumno  = "Sobresaliente";}
	
	else {calificacionAlumno  = "El valor de la calificación introducida no es correcta";}
	
	System.out.println(calificacionAlumno );
}
}