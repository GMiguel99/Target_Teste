package pergunta_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o número inteiro que deseja verificar se pertence à sequência de Fibonacci:");
		int getNum = scanner.nextInt();

		if (isFibonacci(getNum)) {
			System.out.println(getNum + " pertence à sequência de Fibonacci.");
		} else {
			System.out.println(getNum + " não pertence à sequência de Fibonacci.");
		}
		
		scanner.close();
	}

	public static boolean isFibonacci(int n) {
		if (n == 0 || n == 1) {
			return true;
		}

		int a = 0, b = 1, c = 1;
		
		while (c < n) {
			c = a + b;
			a = b;
			b = c;
		}

		return c == n;
	}
}