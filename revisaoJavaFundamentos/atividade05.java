package revisaoJavaFundamentos;

import java.util.Scanner;

public class atividade05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1 - Sacar\r\n"
						+ "2 - Depositar\r\n"
						+ "3 - Verificar Saldo\r\n"
						+ "4 - Sair\r\n");
		int choose = Integer.parseInt(scan.nextLine());
		
		switch ( choose) {
		case 1:
			System.out.println("Você escolheu a opção Sacar.");
			break;
		case 2: 
			System.out.println("Você escolheu a opção Depositar.");
			break;
		case 3:
			System.out.println("Você escolheu a opção Verificar Saldo.");
			break;
		case 4:
			System.out.println("Você escolheu a opção Sair.");
			break;
		default:
			System.out.println("Opção inválida.");
		}
		scan.close();		
	}
}
 