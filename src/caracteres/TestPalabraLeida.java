package caracteres;

import java.util.Scanner;

import ejercicios.PalabraLeida;

public class TestPalabraLeida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leemos el atributo usando un Scanner
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce una palabra:");
		String palabraIn = in.next();
		in.close();
		//creamos el objeto
		PalabraLeida palabra = new PalabraLeida(palabraIn);
		System.out.printf("%s tiene %d letras%n",palabraIn,palabra.numeroDeLetras());
		System.out.printf("%s empieza por vocal: %b%n",palabraIn,palabra.comienzarPorVocal());
		System.out.printf("%s acaba en vocal: %b%n",palabraIn,palabra.acabaEnVocal());
		System.out.printf("%s tiene %d vocales%n",palabraIn,palabra.calcularNumeroVocales());
		System.out.printf("%s es un palíndromo: %b%n",palabraIn,palabra.esUnPalindromo());
		System.out.printf("%s contiene H/h: %b%n",palabraIn,palabra.contieneH());
		//programando de forma segura
		if (args.length == 0){
			System.out.println("Falta argumento");
			System.exit(1);
		}
		System.out.printf("%s es igual a %s: %b%n",palabraIn,args[0],palabra.sonIguales(args[0]));

			

	}

}
