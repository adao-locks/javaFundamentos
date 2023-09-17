package revisaoJavaFundamentos;

import java.util.Scanner;

public class atividade04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número entre 2 e 5: ");
		double a = Double.parseDouble(scan.nextLine());
		if (a > 5 || a < 2) {
			System.out.println("Número inválido, tente novamente: ");
			a = Double.parseDouble(scan.nextLine());
		}
		double b = a;
		scan.close();
		
		while (a > 1) {
			b = b *(a-1);
			a--;
		}
		System.out.println(b);
	}
}
