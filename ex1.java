package ex_repeticao;

import java.util.Scanner;

//1. Faça um programa que receba a idade de 20 pessoas. Calcule e mostre:
//a) A quantidade de pessoas em cada faixa etária:
//b) A porcentagem de pessoas na primeira faixa etária, com relação ao total de pessoas:
//Faixa Etária Idade
//1ª Até 15 anos
//2ª De 16 a 30 anos
//3ª De 31 a 45 anos
//4ª De 46 a 60 anos
//5ª Acima de 61 anos


public class ex1 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int contIdade = 0, 
		idade = 0, 
		faixa1 = 0, faixa2 = 0, 
		faixa3 = 0, faixa4 = 0, 
		faixa5 = 0;

		
		double porcFaixa1 = 0;
		
		for (contIdade = 1; contIdade <= 20; contIdade++) {
			System.out.println(contIdade + "° pessoa. Insira sua idade: ");
			idade = scanner.nextInt();
			
			if (idade < 15) {
				faixa1++;
			} else if (idade <= 30) {
				faixa2++;
			} else if (idade <= 45) {
				faixa3++;
			} else if (idade <= 60) {
				faixa4++;
			} else {
				faixa5++;
			}
			
		}
		
		porcFaixa1 = ((double)faixa1 / 20) * 100;
		
		System.out.println("Faixa 1 :" + faixa1);
		System.out.println("Faixa 2 :" + faixa2);
		System.out.println("Faixa 3 :" + faixa3);
		System.out.println("Faixa 4 :" + faixa4);
		System.out.println("Faixa 5 :" + faixa5);
		System.out.println("Porcentagem da faixa 1 em relação as outras: " + porcFaixa1 + "%");
		
		
		
	}

}
