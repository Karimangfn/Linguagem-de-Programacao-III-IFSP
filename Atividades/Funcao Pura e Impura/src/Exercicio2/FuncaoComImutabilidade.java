package Exercicio2;

public class FuncaoComImutabilidade {
	public static void main(String[] args) {
		final int number = 10;
		//number = 20; // erro de compilação: a variável number é final e não pode ser modificada
		System.out.println(number); // 10
	}
}
