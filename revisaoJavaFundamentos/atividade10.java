package revisaoJavaFundamentos;

import java.util.Scanner;

public class atividade10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double escolha;
		double soma = 0;
		System.out.println("Digite um número entre 2 e 5: ");
		escolha = Double.parseDouble(scan.nextLine());
		if (escolha > 5 || escolha < 2) {
			System.out.println("Número inválido, tente novamente: ");
			escolha = Double.parseDouble(scan.nextLine());
			for (escolha = escolha; escolha > 1; escolha--) {
				soma = soma * (escolha - 1);
			}
		}
		scan.close();
		System.out.println(soma);
	}
}
