import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random gerador = new Random();
		
		// Defining variables
		String name = "";
		int number1 = 0;
		int number2 = 0;
		int user_answer = 0;
		int right_answer = 0;
		String game = "S";
		int score = 0;
		
		// Welcome and instructions
		System.out.println("BEM VINDO AO JOGO DA TABUADA!!!");
		System.out.println();
		System.out.println("O objetivio do jogo é acertar o máximo de multiplicações entre os dois números que aparecerem na tela. Boa sorte! ");
		System.out.println();
		
		while(name == "") {
			System.out.print("Para começar digite seu nome: ");
			name = input.next();
		}
			
		// Making the game logic
		while(game.equals("S")){
			// Generating randows numbers
			number1 = gerador.nextInt(8)+2;
			number2 = gerador.nextInt(8)+2;
			
			// Print the numbers
			System.out.println();
			System.out.println("Primeiro número: " + number1);
			System.out.println("Segundo número: " + number2);
			right_answer = number1 * number2;
			
			// Asking user name
			System.out.print("Sua resposta: ");

			user_answer = input.nextInt();
			
			if (user_answer == right_answer) {
				System.out.println("Resposta correta: " + right_answer);
				score +=1;
			}
			else{
				System.out.println("Resposta correta: " + right_answer);
				System.out.println("Fim de jogo, "+ name +", sua pontuação é: "+ score);
				
				System.out.println();
				
				// Start the game again
				System.out.println("Deseja jogar novamente? S/N");
				System.out.print("Digite sua resposta: ");
				game = input.next();
				score = 0;
			}					
		}
		input.close();
	}
}