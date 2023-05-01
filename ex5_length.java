package ex_repeticao;

import java.util.Scanner;


public class ex5_length {
	
	public static void main(String[] args) {
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		int[] listaNum = new int [10];
		// limite máximo da lista é 10.
		
		System.out.println("Digite um sequencia de 10 números: ");
		
		// lenght = número de itens de uma array
		for (int i = 0; i < listaNum.length; i++) {
			System.out.println( "Número: ");
			listaNum[i] = scanner.nextInt();
		}
		
		// o que esta entre "[]" é a indexação do iten.
		int numMaior = listaNum[0];
		int numMenor = listaNum[0];
		
		for (int i = 1; i <listaNum.length; i++) {
			if (listaNum[i] > numMaior) {
				numMaior = listaNum[i];
				
			} else if (listaNum[i] < numMenor) {
				numMenor = listaNum[i];
			}
			
		
			
		}
		
		System.out.println("Maior número da sequência: " + numMaior);
		System.out.println("Menor número da sequência: " + numMenor);
		

	}

}
