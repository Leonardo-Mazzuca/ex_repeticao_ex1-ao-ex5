package ex_repeticao;

//Faça a leitura de 10 números inteiros e identifique o maior e o menor número digitado
import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num = 0, numMenor = 0, numMaior = 0;

		for (int cont = 1; cont <= 10; cont++) {
			System.out.println("Digite o " + cont + "° número: ");
			num = scanner.nextInt();
			//num = Integer.split(" ");

			if (cont == 1) {
				numMaior = num;
				numMenor = num;
			} else if (num > numMaior) {
				numMaior = num;

			} else if (num < numMenor) {
				numMenor = num;

			}

		}
		System.out.println("Maior número: " + numMaior);
		System.out.println("Menor número: " + numMenor);
		
		scanner.close();

	}

}
