package sbuilder;


import java.util.Scanner;

public class Ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ejecutamos cat log.txt | java Ejemplo
		//leemos los datos con Scanner
		//creamos un StringBuilder y añadimos
		//IP usando una expresión regular.
		//Creamos el Scanner
		Scanner in = new Scanner(System.in);
		//Creamos el StringBuilder vacío
		StringBuilder sBuilder = new StringBuilder();
		//Creamos el patrón de IP
		final String REGEX_IP = "((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)\\.){3}"
				+ "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)";
		//leemos palabra a palabra
		//variable para almacenar in.next()
		int contador=0; //contamos IP (número de accesos)
		String palabra="";
		while(in.hasNext()){
			palabra=in.next();
			if(palabra.matches(REGEX_IP)){
				sBuilder.append(palabra);
				//añadimos un separador
				sBuilder.append("-");
				contador++;
			}
		}
		//cerramos el Scanner
		//quitamos el último caracter
		//sBuilder.delete(sBuilder.length()-1,sBuilder.length());
		//otra forma sería darle la vuelta y eliminar el primero
		sBuilder.reverse(); //está al revés
		//ahora eliminamos el primero
		sBuilder.delete(0,1);
		sBuilder.reverse(); //vuelve a estar como al inicio
		//es mas costoso, pues hay que darle la vuelta dos veces
		in.close();
		System.out.println(sBuilder);
		System.out.println("Número de accesos: "+contador);
	}

}
