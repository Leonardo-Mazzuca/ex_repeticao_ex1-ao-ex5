package ex_repeticao;

import java.util.Scanner;


//Em uma eleição presidencial existem quatro candidatos. Os votos são informados por meio de
//código. Os códigos utilizados são:
//1, 2, 3, 4 Votos para os respectivos
//candidatos
//5 Voto Nulo
//6 Voto em Branco
//Faça um programa que calcule e mostre:
//a) O total de votos para cada candidato:
//b) O total de votos nulos:
//c) O total de votos em branco:
//d) A porcentagem de votos nulos sobre o total de votos:
//e) A porcentagem de votos em branco sobre o total de votos:
//Para finalizar a leitura de dados digite Zero para o código.

public class ex2 {
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
	
		
		int voto;
		int totCand1 = 0, 
		totCand2 = 0, 
		totCand3 = 0, 
		totCand4 = 0,
		totVotoNulo = 0,
		totVotoBranco = 0;
		int contPessoas = 0;
	
		
		//entrando no loop
		System.out.println("Inisira o voto: ");
		voto = scanner.nextInt();
		
		while (voto != 0 ) {
			
			while (voto > 6) {
				System.out.println("Voto inválido, redigíte: ");
				voto = scanner.nextInt();
				contPessoas--;
			}

			if (voto == 1) {
				totCand1++;
			} else if (voto == 2) {
				totCand2++;
			} else if (voto == 3) {
				totCand3++;
			} else if (voto == 4) {
				totCand4++;
			} else if (voto == 5) {
				totVotoNulo++;
			} else if (voto == 6) {
				totVotoBranco++;
			}
			
		
			System.out.println("Inisira o voto: ");
			voto = scanner.nextInt();
			contPessoas++;
			// fazendo o loop continuar
			
		}
		
		
		System.out.println("Total de eleitores: " + contPessoas);
		System.out.println("Total de votos candidato 1: " + totCand1);
		System.out.println("Total de votos candidato 2: " + totCand2);
		System.out.println("Total de votos candidato 3: " + totCand3);
		System.out.println("Total de votos candidato 4: " + totCand4);
		System.out.println("Total de votos nulos: " + totVotoNulo);
		System.out.println("Total de votos em branco: " + totVotoBranco);
		System.out.println("Porcentagem de votos nulos: " + (double)totVotoNulo / (double)contPessoas * 100);
		System.out.println("Porcentagem de voto brancos: " +(double)totVotoBranco / (double)contPessoas * 100);
		
		
		
		
		
		
		
		
	}

}
