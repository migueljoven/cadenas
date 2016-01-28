package regex;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final String INPUT = "Mozilla Safari mkjfkdsj jfkljkdfl Mozilla"
			//	+ "Safari Mozilla kdjfklj sdskjkljf sdkljfklj";
		Scanner in = new Scanner(System.in);
		String input = "";
		while (in.hasNext())
			input += in.next();
		in.close();
		final String PATRON_MOZILLA_SAFARI = "(Mozilla|Safari)";
		Pattern patron = Pattern.compile(PATRON_MOZILLA_SAFARI);
		Matcher matcher = patron.matcher(input);
		int contador=0;
		//System.out.println(input);
		while(matcher.find())
			contador++;
		System.out.println("Nº ocurrencias de Mozilla/Safari "+contador);

	}

}
