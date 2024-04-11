package trim1;

import java.util.Scanner;

public class Desafio_Campeonato_Futebol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        final int qtdeTimes = 5;
        final int qtdeJogadores = 11;
        
        int i, j;
        
        int idade;
        double altura, peso;
        
        float mediaIdade = 0, mediaAltura = 0;
        int contMediaIdade = 0, contMediaAltura = 0;
        
        int qtdeMenor18 = 0, qtdeAcima80Kg = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for (i = 1; i <= qtdeTimes; i++) {
            for (j = 1; j <= qtdeJogadores; j++) {
                System.out.println("Informe a idade do jogador: ");
                idade = sc.nextInt();
                System.out.println("Informe a altura do jogador: ");
                altura = sc.nextDouble();
                System.out.println("Informe o peso do jogador: ");
                peso = sc.nextDouble();
                
                if (idade < 18) {
                    qtdeMenor18++;
                }
                if (peso > 80) {
                    qtdeAcima80Kg++;
                }
                
                mediaIdade += idade;
                contMediaIdade++;
                mediaAltura += altura;
                contMediaAltura++;
            }
            System.out.printf("A média de idade do time %d é %f\n", i, mediaIdade/contMediaIdade);
            System.out.printf("A altura média do time %d é %f\n", i, mediaAltura/contMediaAltura);
            
            mediaIdade = 0;
            contMediaIdade = 0;
            mediaAltura = 0;
            contMediaAltura = 0;
		 }
		 System.out.printf("O campeonato apresenta %d jogadores menores que 18 anos\n", qtdeMenor18);
		 System.out.printf("O campeonato apresenta %d jogadores acima de 80 Kg\n", qtdeAcima80Kg);
	}
		    
}
