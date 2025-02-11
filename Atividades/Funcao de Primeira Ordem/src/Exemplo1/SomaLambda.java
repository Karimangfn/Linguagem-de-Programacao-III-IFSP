package Exemplo1;

import java.util.function.*;

public class SomaLambda {
	public static void main(String[] args) {
		// Definindo a expressão lambda que soma dois inteiros com o uso da interface IntBinaryOperator
		IntBinaryOperator soma = (a, b) -> a + b;

		// Utilizando a expressão lambda para somar dois números
		// applyAsInt é um método da interface funcional IntBinaryOperator do Java. Esse método é usado para aplicar a operação representada pela interface a dois valores inteiros e retornar o resultado como um inteiro.
		int resultado = soma.applyAsInt(2, 3);

		// Exibindo o resultado da soma
		System.out.println(resultado); // Imprime 5
	}
}
