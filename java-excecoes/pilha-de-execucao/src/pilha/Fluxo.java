package pilha;

public class Fluxo {

	public static void main(String[] args) {

		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");

	}

	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}

	private static void metodo2() {
		System.out.println("Inicio do metodo2");

		try {

			for (int i = 1; i <= 5; i++) {
				System.out.print(i + " ");
			}

			System.out.println("\nFim do metodo2");
			int excecao = 2 / 0;

		} catch (Exception e) {

			System.out.println("--> ArithmeticException <--");
		}
	}
}
