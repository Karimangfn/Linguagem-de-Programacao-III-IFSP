package Exemplo2;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("olá");
		lista.add("mundo");
		lista.add("como");
		lista.add("vai");
		lista.add("você");

		lista.stream()
		.filter(s -> s.length() > 3) // filtra os elementos com mais de 3 caracteres
		.forEach(s -> System.out.println(s)); // imprime cada elemento restante na lista
	}
}

