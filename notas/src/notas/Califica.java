package notas;
/**
* Clase Califica
* muestra por pantalla la calificacion de un alumno
* @author Andres Garcia
* @version 0.7, 20023/02/01
*/
public class Califica {

	/**metodo califica, el código dicta la calificacion dependiendo del parametro de la nota del alumno
	 * @param num_nota nota del alumno que sera pasado al metodo
	* @see notas.Notas#main Código al que se hace referencia
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
