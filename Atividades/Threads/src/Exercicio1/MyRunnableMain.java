package Exercicio1;

public class MyRunnableMain {

	public static void main(String[] args) {
		//cria uma nova instancia da classe MyRunnable
		MyRunnable runnable = new MyRunnable();

		//cria a instancia de uma classe thread e "passa" a instancia MyRunnable como argumento
		Thread thread = new Thread(runnable);

		//inicia nova thread
		thread.start();

		// imprime uma mensagem de impressão na thread principal
		System.out.println("Executando na thread principal");
	}

}
