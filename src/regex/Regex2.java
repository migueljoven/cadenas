package regex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Regex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leemos con scanner posibles direcciones IP
		//las direcciones IP pueden ser:
		//127.0.0.1 255.255.255.255 192.168.0.1
		//no son válidas 127.0.1 ni 256.255.255.255
		Scanner in = new Scanner(System.in);
		System.out.println("INTRODUCE IPs VÁLIDAS:");
		String posibleIP = in.next();
		//creamos una colección para guardar esas IPs
		List<String> listaIPs = new ArrayList<String>();
		while(validarIP(posibleIP)){
			//si es válida a la lista
			listaIPs.add(posibleIP);
			posibleIP=in.next();
		}
		in.close();
		System.out.println(listaIPs);

	}
	//método que nos valida la dirección IP
	public static boolean validarIP(String ip){
		//primero que encaje con xxx.xxx.xxx.xxx donde x es dígito
	//	return ip.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\.\\d{3}");
		//aquí no encaja 192.168.0.1, modificamos la regex
		//return ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
		//problema es que se traga direcciones superiores a 255.255.255.255
		//return ip.matches("(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)\\."
		//		+ "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)\\."
		//		+ "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)\\."
		//		+ "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)");
		return ip.matches("((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)\\.){3}"
						+ "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]\\d|\\d)");


	}

}
