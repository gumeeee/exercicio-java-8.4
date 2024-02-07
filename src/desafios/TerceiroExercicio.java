package desafios;

import java.util.Scanner;

public class TerceiroExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float salarioBruto;
		float adicionalNoturno;
		float horasExtras;
		float descontos;
		float salarioLiquido;

		Scanner leitura = new Scanner(System.in);

		System.out.println("Digite o salário bruto: ");
		salarioBruto = leitura.nextFloat();

		System.out.println("Digite o Adicional Noturno: ");
		adicionalNoturno = leitura.nextFloat();

		System.out.println("Digite o Horas Extras: ");
		horasExtras = leitura.nextFloat();

		System.out.println("Digite o Descontos: ");
		descontos = leitura.nextFloat();

		leitura.close();

		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		System.out.println("Salario liquido é: " + salarioLiquido);
	}

}
