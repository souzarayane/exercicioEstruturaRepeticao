/*
	Faça um programa que leia 5 números
	e informe o maior número
	e a média desses números.
*/

package exerciciosLopps;

import java.util.Scanner;

public class Exercicio03MaiorMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numero;
		int count = 0;
		int maiorNumero = 0;
		int media = 0;
		
		do {
			System.out.println("Número: ");
			numero = scan.nextInt();
			
			media = media + numero;
			
			 if (numero > maiorNumero) maiorNumero = numero;
			
			count = count + 1;
			
		} while(count < 5);
			
		System.out.println("O maior número é: " + maiorNumero);
		System.out.println("A média dos números é: " + (media/5));
	}

}
