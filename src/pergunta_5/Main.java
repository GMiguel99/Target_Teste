package pergunta_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite uma string: ");
		String stringOriginal = scanner.nextLine();
		
		inverterString(stringOriginal);
		
		scanner.close();
	}
	
	public static void inverterString(String stringOriginal) {
	      String stringInvertida = "";

	      for(int i = stringOriginal.length() - 1; i >= 0; i--) {
	         stringInvertida += stringOriginal.charAt(i);
	      }

	      System.out.println("String invertida: " + stringInvertida);
	}
}
