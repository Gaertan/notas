package notas;

import java.util.Scanner;
/**
* Clase Notas
* Clase main del proyecto que pide una nota por teclado y ostrara una calificacion llamando a la clase Califica
* @author Andres Garcia
* @version 0.7, 20023/02/01
*/


public class Notas {


public static void main(final String[] args) { 
	/**clase main
	 * comienza la ejecucion
	 * @param reader leerá de teclado la nota
	 * @param notaAlumno nota que se le pasara a la clase Califica
	 * @see notas.Califica#Califica Código al que se hace referencia
	 *
	 * */
// Para pedir un dato numérico por teclado	
final Scanner reader = new Scanner(System.in); 
System.out.println("Introduzca el valor de una calificación: "); 
int notaAlumno = reader.nextInt(); 
reader.close();
Califica.califica(notaAlumno); 

}

/**aqui el comentario, el código dicta la calificacion dependiendo del parametro de la nota del alumno
 * @deprecated Use {@link Califica#califica(int)} instead
 */
public static void cali(int notaAlumno) {
	Califica.califica(notaAlumno);
}

/**aqui el comentario, el código dicta la calificacion dependiendo del parametro de la nota del alumno
 * @deprecated Use {@link Califica#califica(int)} instead
 */
public static void califica(int num_nota) {
	Califica.califica(num_nota);
}
}