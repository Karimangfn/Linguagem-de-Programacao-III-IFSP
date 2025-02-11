package Exemplo1;

import java.util.Arrays;

public class Paradigma_Funcional {
	
	public static void main(String[] args) {
		int[] numeros = {10, 20, 30};
		double resultado = calcularMedia(numeros);
		System.out.println("A media dos numeros eh: " + resultado);
	}

	public static double calcularMedia(int[] numeros) {
		return Arrays.stream(numeros).average().orElse(Double.NaN);
	}
}

