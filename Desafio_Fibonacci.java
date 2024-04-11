package trim1;

import java.util.Scanner;

public class Desafio_Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont, rept, num1, num2, res;
		Scanner sc = new Scanner(System.in);
		
		num1 = 0;
		num2 = 1;
		
		System.out.println("Informe a quantidade de repetições: ");
		rept = sc.nextInt();
		
		sc.close();
		
		System.out.printf("%d  ", num2);
		
		for (cont = 2; cont <= rept; cont++) {
			res = num1 + num2;
			System.out.printf("%d  ", res);
			num1 = num2;
			num2 = res;
		}
	}
}
