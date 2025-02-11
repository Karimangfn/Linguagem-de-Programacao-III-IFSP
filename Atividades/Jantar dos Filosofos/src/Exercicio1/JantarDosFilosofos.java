package Exercicio1;

import java.util.concurrent.Semaphore;

public class JantarDosFilosofos {
	public static void main(String[] args) {
		final int NUM_FILOSOFOS = 5;
		Semaphore[] garfos = new Semaphore[NUM_FILOSOFOS];

		for (int i = 0; i < NUM_FILOSOFOS; i++) { garfos[i] = new Semaphore(1);
		}

		Filosofo[] filosofos = new Filosofo[NUM_FILOSOFOS];
		for (int i = 0; i < NUM_FILOSOFOS; i++) { filosofos[i] = new Filosofo(i, garfos); new Thread(filosofos[i]).start();
		}
	}
}

