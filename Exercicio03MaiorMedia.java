/*
	Fa�a um programa que leia 5 n�meros
	e informe o maior n�mero
	e a m�dia desses n�meros.
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
			System.out.println("N�mero: ");
			numero = scan.nextInt();
			
			media = media + numero;
			
			 if (numero > maiorNumero) maiorNumero = numero;
			
			count = count + 1;
			
		} while(count < 5);
			
		System.out.println("O maior n�mero �: " + maiorNumero);
		System.out.println("A m�dia dos n�meros �: " + (media/5));
	}

}
