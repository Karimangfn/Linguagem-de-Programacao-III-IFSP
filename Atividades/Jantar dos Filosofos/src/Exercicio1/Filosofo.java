package Exercicio1;

import java.util.concurrent.Semaphore;

// definição da classe Filosofo com o uso da interface Runnable, indicando que ela pode ser executada em uma thread
public class Filosofo implements Runnable {
	// array que representa o semáforo de garfos
	private final Semaphore[] garfos;
	// id do filósofo
	private final int id;
	// construtor da classe que recebe o id do filósofo e o array de semáforos que representa os garfos à disposição dos filósofos.
	public Filosofo(int id, Semaphore[] garfos) {
		this.id = id;
		this.garfos = garfos;
	}

	// Método que roda em uma thread e implementa o comportamento de um filósofo 
	@Override
	public void run() {
		while (true) { 
			pensar(); 
		    try {
				pegarGarfos();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		    comer(); 
		    soltarGarfos();
		}
	}

	// Método que implementa a lógica de pegar os garfos (semáforos) para comer
	private void pegarGarfos() throws InterruptedException {
		int garfoEsquerdo = id;
		int garfoDireito = (id + 1) % garfos.length; // calcula o índice do garfo à direita
		if (id == 0) { // se for o primeiro filósofo, pega primeiro o garfo à direita
			garfos[garfoDireito].acquire(); // adquire o garfo à direita 
			garfos[garfoEsquerdo].acquire(); // adquire o garfo à esquerda
		} else {
			garfos[garfoEsquerdo].acquire(); // adquire o garfo à esquerda 
			garfos[garfoDireito].acquire(); // adquire o garfo à direita
		}
	}

	// Método que implementa a lógica de soltar os garfos (semáforos) após comer
	private void soltarGarfos() {
		int garfoEsquerdo = id;
		int garfoDireito = (id + 1) % garfos.length; // calcula o índice do garfo à direita
		garfos[garfoEsquerdo].release(); // libera o garfo à esquerda 
		garfos[garfoDireito].release(); // libera o garfo à direita
	}

	// Método que implementa a lógica de comer
	private void comer() {
		System.out.println("Filósofo " + id + " está comendo.");
		try {
			Thread.sleep(1000); // espera um tempo para simular a ação de comer
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Método que implementa a lógica de pensar
	private void pensar() {
		System.out.println("Filósofo " + id + " está pensando.");
		try {
			Thread.sleep(1000); // espera um tempo para simular a ação de pensar
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
