package regex;

public class Regex1 {

	public static void main(String[] args) {
		//usamos las cadenas dentro del string
		//uso de las comillas como parte de la cadena
		String cadenaPrueba1 = "hola \"mundo\"";
		System.out.println(cadenaPrueba1);
		String cadenaPrueba2 = "  La policía no solo detectó trazas"
				+ " de Polonio 210 en la tetera y en la taza usada por Litvinenko,"
				+"también en los servicios del hotel visitados por sus dos"
				+ " \"envenenadores\", Dimitru Kovtun y Andrei Lugovoi, en las"
				+ " habitaciones de ambos, en la mesa del restaurante Pescatori,"
				+ " en la barra del bar Dar Marrakesh y hasta en los asientos"
				+ " usados por Lugovoi y su familia en el Estadio Emirates"
				+ " del Arsenal, donde presenciaron el encuentro entre los \"Gunnners\""
				+ " y el CSK de Moscú.";
		//comprueba que empiza con uno o mas espacios en blacon y L
		//^\\s+L
		//Luego contiene 3 dígitos \\d{3}
		//Y termina en ú.   ú\\.$
		if(cadenaPrueba2.matches("^\\s+L.*\\d{3}.*ú\\.$"))
			System.out.println("la cadena SI encaja");
		else
			System.out.println("la cadena NO encaja");

	}

}
