package pilha;

public class Fluxo {

	public static void main(String[] args) {

		System.out.println("Inicio do main");
		
		try {
			metodo1();
		} catch (NullPointerException | ArithmeticException ex) {

			System.out.println("\nException --> " + ex.getMessage() + "\n");
 
		}
		System.out.println("Fim do main"); 
    
	} 

	private static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	} 

	private static void metodo2() {
		System.out.println("Inicio do metodo2");

//		ArithmeticException exception =  new ArithmeticException("Deu ruim!");
//		Lançando exceção e passando mensagem "Deu ruim!" para o construtor .
//		throw exception;  
		throw new ArithmeticException("Deu ruim!");

//		System.out.println("\nFim do metodo2");

	}
}
