package trim1;

import java.util.Scanner;

public class Desafio_Campeonato_Futebol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// inicialização de variáveis
        final int qtdeTimes = 5;
        final int qtdeJogadores = 11;
        
        int i, j;
        
        int idade;
        double altura, peso;
        
        float mediaIdade = 0, mediaAltura = 0;
        int contMediaIdade = 0, contMediaAltura = 0;
        
        int qtdeMenor18Anos = 0, qtdeAcima80Kg = 0;
        
        Scanner sc = new Scanner(System.in);
        
        for (i = 1; i <= qtdeTimes; i++) { // contador os times
            for (j = 1; j <= qtdeJogadores; j++) { // contador para qtde de jogadores por time
                System.out.printf("Informe a idade do jogador %d: ", j);
                idade = sc.nextInt();
                System.out.printf("Informe a altura do jogador %d: ", j);
                altura = sc.nextDouble();
                System.out.printf("Informe o peso do jogador %d: ", j);
                peso = sc.nextDouble();
                
                if (idade < 18) {
                	qtdeMenor18Anos++; // Conta quantos do campeonato jogadores são menores de idade
                }
                if (peso > 80) {
                    qtdeAcima80Kg++; // Conta quantos jogadores do campeonato estão estão com peso acima de 80Kg
                }
                
                // Prepara as variáveis para cálculo da média de cada time
                mediaIdade += idade;
                contMediaIdade++;
                mediaAltura += altura;
                contMediaAltura++;
            }
            System.out.printf("A média de idade do time %d é: %f\n", i, mediaIdade/contMediaIdade);
            System.out.printf("A altura média do time %d é: %f\n", i, mediaAltura/contMediaAltura);
            
            // Reinicializa as variáveis para cacular as médias de outro time
            mediaIdade = 0;
            contMediaIdade = 0;
            mediaAltura = 0;
            contMediaAltura = 0;
		 }
		 System.out.printf("O campeonato apresenta %d jogadores menores que 18 anos\n", qtdeMenor18Anos);
		 System.out.printf("O campeonato apresenta %d jogadores acima de 80 Kg\n", qtdeAcima80Kg);
	}
		    
}
