package revisaoJavaFundamentos;

public class atividade02 {

	public static void main(String[] args) {
		int a = 0;
		int soma = 0;
		
		while (a <= 100) {
			a++;
			if(a % 2 == 0) {
				soma = soma + a;
			}
		}
		System.out.println(soma);
	}
}
