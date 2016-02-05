package ejercicios;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {
		final String[] PREPOSICIONES = {"a", "ante", "bajo", "cabe", "con", "contra", "de", "desde", "durante", "en", "entre", 
				"hacia", "hasta", "mediante","a","a", "para", "por", "según", "sin","so", "sobre", "tras", "versus", "vía"};
		//convertimos en lista
		List<String> listaPreposiciones =  Arrays.asList(PREPOSICIONES);
		System.out.println(listaPreposiciones);
		int numeroPreposiciones= Collections.frequency(listaPreposiciones, "a");
		System.out.println(numeroPreposiciones);
		String frase = "hola que mundo, espero que funcione";
		String[] palabras = frase.split(" ");
		List<String> listaPalabras = Arrays.asList(palabras);
		int numeroPalabras = Collections.frequency(listaPalabras,"que");
		System.out.println(numeroPalabras);
	}
}
