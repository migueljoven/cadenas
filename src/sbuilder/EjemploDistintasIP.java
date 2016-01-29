package sbuilder;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class EjemploDistintasIP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ejecutamos cat log.txt | java Ejemplo
		//leemos los datos con Scanner
		//creamos un StringBuilder y añadimos
		//IP usando una expresión regular.
		//Creamos el Scanner
		Scanner in = new Scanner(System.in);
		//Creamos un Set de String
		//guarda objetos diferentes
		//Creamos el patrón de IP
		Set<String> conjuntoIPDiferentes = new HashSet<String>();
		final String REGEX_IP = "((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)\\.){3}"
				+ "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)";
		//leemos palabra a palabra
		//variable para almacenar in.next()
		String palabra="";
		while(in.hasNext()){
			palabra=in.next();
			if(palabra.matches(REGEX_IP))
				conjuntoIPDiferentes.add(palabra);
		}
		//cerramos el Scanner
		in.close();
		System.out.println(conjuntoIPDiferentes);
		System.out.println("Número de accesos: "+conjuntoIPDiferentes.size());
	}

}

