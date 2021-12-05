/*
	Desenvolva um gerador de tabuada,
	capaz de gerar a tabuada de qualquer n�mero inteiro entre 1 a 10.
	O usu�rio deve informar de qual numero ele deseja ver a tabuada.
	A sa�da deve ser conforme o exemplo abaixo:
	Tabuada de 5:
	5 X 1 = 5
	5 X 2 = 10
	...
	5 X 10 = 50
*/

package exerciciosLopps;

import java.util.Scanner;

public class Exercicio05Tabuada {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor para tabuda: ");
		int tabuada = scan.nextInt();
		
		System.out.println("Tabuada de " + tabuada);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
		}
	}

}
