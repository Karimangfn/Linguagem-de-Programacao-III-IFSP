package Exemplo2;

import java.util.stream.IntStream;

public class Paradigma_Funcional {
	
	public static void main(String[] args) {
		int soma = IntStream.rangeClosed(1, 10)
				.reduce(0, (a, b) -> a + b);
		System.out.println("A soma dos números de 1 a 10 é " + soma);
	}
}
