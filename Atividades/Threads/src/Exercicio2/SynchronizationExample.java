package Exercicio2;

public class SynchronizationExample {

	// Variável compartilhada que pode ser acessada por múltiplas threads
	static int count = 0;

	public static void main(String[] args) {
		// Duas threads são criadas e irão acessar a variável compartilhada "count"
		Thread thread1 = new Thread(() -> incrementCount());

		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				incrementCount();
			}
		});

		// As duas threads são iniciadas
		thread1.start();
		thread2.start();

		// A thread principal aguarda as "threads filhas" se completarem
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// O valor final da variável "count" é printado
		System.out.println("Contador Final: " + count);
	}

	// Este método incrementa o valor da variável compartilhada "count"
	// A "palavra-chave" synchronized keyword garante que somente uma thread pode acessar esse método por vez
	private static synchronized void incrementCount() {
		for (int i = 0; i < 10000; i++)
			count++;
	}
}
