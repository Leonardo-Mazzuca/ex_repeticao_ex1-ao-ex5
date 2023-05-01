package ex_repeticao;

import java.util.Scanner;

//Faça um programa que receba a idade, o peso, a altura, a cor dos olhos (A-Azul, P-Preto,
//V-Verde e C-Castanho) e a cor dos cabelos (P-Preto, C-Castanho, L-Louro e R-Ruivo) de 10
//pessoas (digitação de dados válidos). Calcule e mostre:
//a) A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos:
//b) A média das idades das pessoas com altura inferior a 1,50:
//c) A porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas:
//d) A quantidade de pessoas ruivas e que não possuem olhos azuis:

public class ex4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int idade = 0, contPessoas = 0, qntd50 = 0, qntdAzul = 0;
		double peso = 0, altura = 0, mediaIdade = 0, porcOlhoAzul = 0, qntdRuivo = 0, somaIdade = 0;

		char corOlho, corCabelo;

		for (contPessoas = 1; contPessoas <= 11; contPessoas++) {
			System.out.println(contPessoas +"° pessoa, digite sua idade: ");
			idade = scanner.nextInt();

			System.out.println(contPessoas + "° pessoa, digite sua altura: ");
			altura = scanner.nextDouble();

			System.out.println(contPessoas + "° pessoa, digite seu peso: ");
			peso = scanner.nextDouble();

			System.out.println(contPessoas + "° pessoa, digite a cor de seus olhos: ");
			corOlho = scanner.next().charAt(0);
			corOlho = Character.toUpperCase(corOlho);

			while (corOlho != 'A' && corOlho != 'P' && corOlho != 'V' && corOlho != 'C') {
				System.out.println("Digite uma cor para olho válida: ");
				corOlho = scanner.next().charAt(0);
				corOlho = Character.toUpperCase(corOlho);

			}

			System.out.println(contPessoas + "° pessoa, digite a coloração de seu cabelo: ");
			corCabelo = scanner.next().charAt(0);
			corCabelo = Character.toUpperCase(corCabelo);

			while (corCabelo != 'P' && corCabelo != 'C' && corCabelo != 'L' && corCabelo != 'R') {
				System.out.println("Digite uma coloração de cabelo válida: ");
				corCabelo = scanner.next().charAt(0);
				corCabelo = Character.toUpperCase(corCabelo);
			}

			if (idade > 50 && peso < 60) {
				qntd50++;
			}

			if (altura < 1.50) {
				somaIdade++;
				mediaIdade += idade;
			}

			if (corOlho == 'A') {
				qntdAzul++;

			}

			if (corCabelo == 'R' && corOlho != 'A') {
				qntdRuivo++;

			}

		}

		porcOlhoAzul = qntdAzul / contPessoas * 100;
		System.out.println("Quantidade de pessoas com mais de 50 anos que pesam menos de 60kgs: " + qntd50);
		if(somaIdade != 0) {
			System.out.println("Média de idade das pessoas com menos de 1.50 de altura: "
			 		+ (double)mediaIdade/(double)somaIdade);
		} else {
			System.out.println("Média de idade das pessoas com menos de 1.50 de altura: 0");
		}
	
		System.out.println("Porcentagem de pessoas com olhos azuis: " + porcOlhoAzul);
		System.out.println("Total de pessoas que são ruivas mas não possuem olhos azuis: " + qntdRuivo);

	}

}
