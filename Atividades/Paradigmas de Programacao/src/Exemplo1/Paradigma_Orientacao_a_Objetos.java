package Exemplo1;

public class Paradigma_Orientacao_a_Objetos {
	
	private int num1;
	private int num2;
	private int num3;

	public Paradigma_Orientacao_a_Objetos(int num1, int num2, int num3) {
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}

	public double calcularMedia() {
		int soma = num1 + num2 + num3;
		return soma / 3.0;
	}

	public static void main(String[] args) {
		Paradigma_Orientacao_a_Objetos media = new Paradigma_Orientacao_a_Objetos(10, 20, 30);
		double resultado = media.calcularMedia();
		System.out.println("A media dos numeros eh: " + resultado);
	}

}
