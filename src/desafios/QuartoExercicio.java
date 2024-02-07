package desafios;

import java.util.Scanner;

public class QuartoExercicio {

	public static void main(String[] args) {
		float numero1;
		float numero2;
		float numero3;
		float numero4;
		
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = leitura.nextFloat();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = leitura.nextFloat();
		
		System.out.println("Digite o terceiro numero: ");
		numero3 = leitura.nextFloat();
		
		System.out.println("Digite o quarto numero: ");
		numero4 = leitura.nextFloat();
		
		leitura.close();
		
		float calculo = (numero1 * numero2) - (numero3 * numero4);
		
		System.out.println("A diferença é: " + calculo);

	}

}
