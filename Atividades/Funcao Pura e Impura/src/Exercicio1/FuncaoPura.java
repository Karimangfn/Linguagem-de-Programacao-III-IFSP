package Exercicio1;

public class FuncaoPura {
	public static int incrementCount(int count) {
        return count + 1;
    }

    public static void main(String[] args) {
        int count = 0;
        int newCount = incrementCount(count);

        System.out.println(count); // 0
        System.out.println(newCount); // 1
    }
}
