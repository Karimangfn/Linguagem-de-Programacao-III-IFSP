package Exercicio1;

public class FuncaoImpura {
	static int count = 0;

	public static int incrementCount() {
		count++;
		return count;
	}

	public static void main(String[] args) {
		System.out.println(incrementCount()); // Output: 1
		System.out.println(count); // Output: 1
	}
}
