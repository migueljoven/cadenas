package ejercicios;
/**
 * @author Manuel
 * @version 1.0
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalabraLeida {
	//atributos
	private String valor;

	/**
	 * @param valor inicializamos atributo 
	 */
	public PalabraLeida(String valor) {
		this.valor = valor;
	}
	/**
	 * 
	 * @return int con el número de caracteres
	 */
	public int numeroDeLetras(){
		return this.valor.length();
	}
	/**
	 * 
	 * @return true si comienza por vocal
	 */
	public boolean comienzarPorVocal(){
		return this.valor.toLowerCase().matches("[aeiouáéíóú].*");
	}
	/**
	 * 
	 * @return true si acaba en vocal
	 */
	public boolean acabaEnVocal(){
		return this.valor.toLowerCase().matches(".*[aeiouáéíóú]");
	}
	/**
	 * 
	 * @return número de vocales
	 */
	public int calcularNumeroVocales(){
		Pattern patron = Pattern.compile("[aeiouáéíóúü]");
		Matcher matcher = patron.matcher(this.valor.toLowerCase());
		int contador=0;
		while(matcher.find())
			contador++;
		return contador;
	}
	/**
	 * 
	 * @return true si la palabra contiene al menos una 'h'
	 */
	public boolean contieneH(){
		return this.valor.toLowerCase().contains("h");
	}
	/**
	 * 
	 * @return true si es un palíndromo
	 */
	public boolean esUnPalindromo(){
		StringBuilder sBuilder = new StringBuilder(this.valor);
		return this.valor.equalsIgnoreCase(sBuilder.reverse().toString());
	}
	
	/**
	 * 
	 * @param cadena a comparar
	 * @return true si el parámetro es igual al atributo
	 * ignorando mayúsculas y minúsculas.
	 */
	public boolean sonIguales(String palabra){
		return this.valor.equalsIgnoreCase(palabra);
	}
	
	/*public static void main(String[] args) {
		PalabraLeida p = new PalabraLeida("pepe");
		System.out.println(p.sonIguales("PEPE"));
	}*/
}
