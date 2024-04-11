package trim1;

import java.util.Scanner;

public class Desafio_Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont, repetidor, num1, num2, res; // Inicializa as variáveis
		Scanner sc = new Scanner(System.in);
		
		// Primeiros valores da sequência
		num1 = 0;
		num2 = 1;
		
		System.out.println("Informe a quantidade de repetições: ");
		repetidor = sc.nextInt(); // Pergunta o número de repetições
		
		sc.close();
		
		System.out.printf("%d  ", num2);
		
		for (cont = 2; cont <= repetidor; cont++) { // Contador inicializa em 2 pois o programa já exibe um número da sequência (num2)
			res = num1 + num2;
			System.out.printf("%d  ", res); // Exibe os resultados
			
			// atribui os novos valores para num1 e num2
			num1 = num2;
			num2 = res;
		}
	}
}
