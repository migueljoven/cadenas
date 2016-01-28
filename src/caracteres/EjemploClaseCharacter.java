package caracteres;

import java.util.Scanner;

public class EjemploClaseCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos el Scanner
		Scanner in = new Scanner(System.in);
		//leemos hasta que no quede nada en el fichero
		String input="";
		//leeemos hasta que acabe el fichero
		int contadorSaltoLinea=0;
		while(in.hasNextLine()){
			input+=in.nextLine();
			contadorSaltoLinea++;
		}
		in.close();
		//convertir el String a un array de char
		char[] arrayChar = input.toCharArray();
		//lo recorremos
		int contadorLetras=0;
		int contadorNumeros=0;
		int contadorSimbolos=0;
		for (char c : arrayChar) {
			if(Character.isDigit(c))
				contadorNumeros++;
			else if(Character.isLetter(c))
				contadorLetras++;
			else
				contadorSimbolos++;
		}
		System.out.printf("%s %d %s %d %s %d %s %d%n","Dígitos:",contadorNumeros,"Letras:",contadorLetras,"Símbolos:",contadorSimbolos,"Saltos de línea:",contadorSaltoLinea);
	}

}
