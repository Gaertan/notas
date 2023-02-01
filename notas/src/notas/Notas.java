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
Califica.califica(notaAlumno); 

}

/**aqui el comentario, el código dicta la calificacion dependiendo del parametro de la nota del alumno
 * @param notaAlumno
 * @deprecated Use {@link Califica#califica(int)} instead
 */
public static void cali(int notaAlumno) {
	Califica.califica(notaAlumno);
}

/**aqui el comentario, el código dicta la calificacion dependiendo del parametro de la nota del alumno
 * @param num_nota
 * @deprecated Use {@link Califica#califica(int)} instead
 */
public static void califica(int num_nota) {
	Califica.califica(num_nota);
}
}