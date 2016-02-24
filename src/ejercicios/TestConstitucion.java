package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;
public class TestConstitucion {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
        	//creamos una lista para añadir TODAS las palabras
        	List<String> listaPalabras = new ArrayList<String>(); 
        	StringBuilder sBuilder = new StringBuilder();
            Scanner in = new Scanner(System.in);
            //in.useDelimiter("[(\\d\\d?\\.)\"-;/,\\.:\\s*]");
            String palabra="";
            String palabraCambiada="";

            while (in.hasNext()){
                    palabra = in.next();
                    //eliminamos los signos de puntuación
                    palabraCambiada = palabra.replaceAll(".*[.;,:]$",palabra.substring(0,palabra.length()-1));
                    //cogemos las palabras que encajan con solo letras, incluso un email no entraría
                            if (palabraCambiada.toLowerCase().matches("[a-záéíóú]+"))
                                   // System.out.println(palabraCambiada);
                            	listaPalabras.add(palabraCambiada);
            }
            int posicionInicial = (int) (Math.random()*(listaPalabras.size()-499));
            for (int i = posicionInicial; i < posicionInicial+500; i++) {
				sBuilder.append(listaPalabras.get(i));
			}
            System.out.println("Nº de palabras "+ UtilidadesString.numeroPalabras(sBuilder.toString().trim()));
            System.out.println("Nº de artículos determinados "+ UtilidadesString.numeroArticulosDeterminados(sBuilder.toString().trim()));
            System.out.println("Nº de artículos indeterminados "+ UtilidadesString.numeroArticulosIndeterminados(sBuilder.toString().trim()));
            System.out.println("Nº de preposiciones "+ UtilidadesString.numeroPreposiciones(sBuilder.toString().trim()));
            int inicio =0;
            int fin = 0;
            while (inicio >= fin){
            	inicio = (int) (Math.random()*501);
            	fin = (int) (Math.random()*501);
            }
            System.out.println(inicio+"--"+fin);
            System.out.println(UtilidadesString.devolverMayusculaCaracteres(inicio, fin, sBuilder.toString().trim()));
            System.out.println(UtilidadesString.devolverMayusculaCaracteresFraseCompleta(inicio, fin,sBuilder.toString().trim()));
            System.out.println(UtilidadesString.devolverMayusculaPalabras(inicio, fin,sBuilder.toString().trim()));
            System.out.println(UtilidadesString.devolverMayusculaPalabrasFrase(inicio, fin,sBuilder.toString().trim()));

            
            
    }

}
