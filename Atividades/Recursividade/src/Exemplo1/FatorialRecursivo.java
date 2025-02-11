package Exemplo1;

public class FatorialRecursivo {
	public static int fatorial(int n) {
		if (n == 0) { // Caso base
			return 1;
		} else { // Caso recursivo
			return n * fatorial(n - 1);
		}
	}

	public static void main(String[] args) {
		int n = 5;
		int resultado = fatorial(n);
		System.out.println("O fatorial de " + n + " é " + resultado);
	}
}
