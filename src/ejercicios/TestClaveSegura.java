package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestClaveSegura {
	static final String FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLmMnN"
			+ "ñÑoOpPqQrRsStTuUvVwWxXyYzZ0123456789¿?()=@.:,;!¡&{}";
	static List<String> listaClavesGeneradas = new ArrayList<String>();
	static List<String> listaClavesSeguras = new ArrayList<String>();

	public static void main(String[] args) {
		//Generamos de forma aleatoria el número de claves
		//máximo de 100
		int numeroClaves = (int) (Math.random()*101);
		System.out.println("Generando "+numeroClaves+ "claves");
		for (int i = 0; i < numeroClaves; i++) {
			//generamos de forma aleatoria el tamaño de la clave
			//con un tamaño máximo de 100
			int tamanoClave = new Random().nextInt(101);
			//guardamos los caracter obtenidos aleatoriamente
			//de FUENTE_CARACTERES en un StringBuilder y los
			//añadimos con el método append
			StringBuilder sBuilder = new StringBuilder();
			for (int j = 0; j < tamanoClave; j++) {
				//obtenemos la posición de forma aleatoria
				int posicion = (int) (Math.random()*FUENTE_CARACTERES.length());
				char caracterEscogido = FUENTE_CARACTERES.charAt(posicion);
				sBuilder.append(caracterEscogido);
			}
			//System.out.println(sBuilder);
			listaClavesGeneradas.add(sBuilder.toString());
			ClaveSegura c = new ClaveSegura(sBuilder.toString());
			if (c.esClaveSegura())
				listaClavesSeguras.add(sBuilder.toString());
		}
		System.out.println(listaClavesGeneradas);
		System.out.println(listaClavesSeguras);
		System.out.println("Nº de claves seguras: "+listaClavesSeguras.size());
	}
}
