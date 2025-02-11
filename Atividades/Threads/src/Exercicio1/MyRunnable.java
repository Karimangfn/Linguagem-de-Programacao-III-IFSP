//Criando uma thread usando a interface runnable

package Exercicio1;

//classe MyRunnable implementa a interface Runnable
public class MyRunnable implements Runnable {

	//Método run() contem o codigo executado pela thread
	@Override
	public void run() {
		//Imprime mensagem de execução da Thread
		System.out.println("Executando nova Thread");
	}

}
