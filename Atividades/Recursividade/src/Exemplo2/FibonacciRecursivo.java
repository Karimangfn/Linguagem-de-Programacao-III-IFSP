package Exemplo2;

public class FibonacciRecursivo {
	public static int fibonacci(int n) {
		if (n == 0 || n == 1) { // Casos base
			return n;
		} else { // Caso recursivo
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		int n = 7;
		int resultado = fibonacci(n);
		System.out.println("O " + n + "º termo da sequência de Fibonacci é " + resultado);
	}
}