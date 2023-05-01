package ex_repeticao;

import java.util.Scanner;

//3. Foi feita uma pesquisa de audiência de canal de TV em várias casas de uma cidade, em um
//determinado dia. Para cada casa consultada foi fornecido o número do canal (4,5,7,12) e o
//número de pessoas que estavam assistindo aquele canal. Se a televisão estivesse desligada,
//nada era anotado, ou seja, essa casa não entrava na pesquisa. Faça um programa que:
//a) Leia um número indeterminado de dados (número do canal e o número de pessoas que estavam
//assistindo):
//b) Calcule e mostre a porcentagem de audiência de cada canal:
//Para encerrar a entrada de dados digite o número do canal ZERO.

public class ex3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numCanal = 0,
		totCanal4 = 0,
		totCanal5 = 0,
		totCanal7 = 0,
		totCanal12 = 0,
		numPessoas = 0,
		totPessoas = 0;

		System.out.println("Insira o número do canal: ");
		numCanal = scanner.nextInt();

		while (numCanal != 4 && numCanal != 5 && numCanal != 7 && numCanal != 12) {
			System.out.println("Digite um número de canal válido: ");
			numCanal = scanner.nextInt();
		}

		while (numCanal != 0) {
			

			if (numCanal == 4) {
				System.out.println("Digite o número de pessoas: ");
				numPessoas = scanner.nextInt();
				totCanal4 += numPessoas;
			} else if (numCanal == 5) {
				System.out.println("Digite o número de pessoas: ");
				numPessoas = scanner.nextInt();
				totCanal5 += numPessoas;
			} else if (numCanal == 7) {
				System.out.println("Digite o número de pessoas: ");
				numPessoas = scanner.nextInt();
				totCanal7 += numPessoas;
			} else if (numCanal == 12) {
				System.out.println("Digite o número de pessoas: ");
				numPessoas = scanner.nextInt();
				totCanal12 += numPessoas;
			}

			totPessoas += numPessoas;

			System.out.println("Insira o número do canal: ");
			numCanal = scanner.nextInt();
			
			
		

		}
		
		
		if (totPessoas != 0) {
		System.out.println("Porcentagem canal 4: " + (double) totCanal4 / (double) totPessoas  * 100 + "%");
		System.out.println("Porcentagem canal 5: " + (double) totCanal5 / (double) totPessoas  * 100 + "%");
		System.out.println("Porcentagem canal 7: " + (double) totCanal7 / (double) totPessoas  * 100 + "%");
		System.out.println("Porcentagem canal 12: " + (double) totCanal12 / (double) totPessoas  * 100 + "%");
		}

	}
}
