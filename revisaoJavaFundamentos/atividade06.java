package revisaoJavaFundamentos;

import java.util.Scanner;

public class atividade06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int b = Integer.MAX_VALUE;
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			a[i] = Integer.parseInt(scan.nextLine());
			if (b > a[i] ) {
				b = a[i];
			}
		}
		System.out.println("Menor número digitado é: " + b);
		scan.close();
	}
}
