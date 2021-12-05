/*
	Faça um programa que peça N números inteiros,
	calcule e mostre a quantidade de números pares
	e a quantidade de números ímpares.
*/

package exerciciosLopps;

import java.util.Scanner;

public class Exercicio04ParImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int qtdNumeros;
		int numero;
		int qtdPares = 0, qtdImpares = 0;
		
		System.out.println("Digite a quantidade de números: ");
		qtdNumeros = scan.nextInt();
		
		int count = 0;
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			if(numero % 2 == 0) qtdPares++;
			else qtdImpares++;
			
			count++;
			
		}while(count < qtdNumeros);
		
		System.out.println("A quantidade de números pares é: " + qtdPares);
		System.out.println("A quantidade de números ímpares é: " + qtdImpares);
	}

}
