package Exercicio2;

public class FuncaoSemImutabilidade {
	public static void main(String[] args) {
		int number = 10;
		number = 20; // modificando a variável number após a sua inicialização
		System.out.println(number); // 20
	}
}
