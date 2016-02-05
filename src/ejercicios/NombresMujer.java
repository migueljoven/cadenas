package ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NombresMujer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nombreMujer;
		//lista que contiene todos los nombres
		List<String> todosLosNombre = new ArrayList<String>();
		//lista con los nombre mas grandes
		List<String> nombresGrandes = new ArrayList<String>();
		//lista con los nombre mas pequeños
		List<String> nombresPequenos = new ArrayList<String>();
		//lista para nombre que comiencen por a/A
		List<String> listaComienzaPorA = new ArrayList<String>();
		//lista para nombre que comiencen por a/A
		List<String> listaAcabanEnConsonante = new ArrayList<String>();
		int nombreMujerGrande=0;
		int nombreMujerPequeno=Integer.MAX_VALUE;
		while (in.hasNextLine()){
			nombreMujer=in.nextLine();
			todosLosNombre.add(nombreMujer);
			if (nombreMujer.length()>nombreMujerGrande)
				nombreMujerGrande = nombreMujer.length();
			if (nombreMujer.length() < nombreMujerPequeno)
				nombreMujerPequeno = nombreMujer.length();
		
		}
		//recorro la lista
		if (args.length > 0 && args[0].length()>1){
			if (todosLosNombre.contains(args[0]))
				System.out.println("Existe el nombre: "+args[0]);
			else{
				String dosPrimerasLetras= args[0].substring(0, 2);
				for (String nombre : todosLosNombre) {
					//con expresión regular
					//nombre.matches(dosPrimerasLetras+".*");
					if(nombre.startsWith(dosPrimerasLetras))
						System.out.println(nombre);
				}
			}
		}
		else{
			for (String nombre : todosLosNombre) {
					if (nombre.toLowerCase().startsWith("a"))
						listaComienzaPorA.add(nombre);
					if (nombre.toLowerCase().matches(".*[^aeiou]$"))
						listaAcabanEnConsonante.add(nombre);
					if (nombre.length() == nombreMujerGrande)
						nombresGrandes.add(nombre);
					if (nombre.length() == nombreMujerPequeno)
						nombresPequenos.add(nombre);
			}
			System.out.println("Nº de nombres de mujer leidos: "+todosLosNombre.size());
			System.out.println(listaComienzaPorA);
			System.out.println(listaAcabanEnConsonante);
			System.out.println(nombresGrandes);
			System.out.println(nombresPequenos);
			}
		
	}

}
