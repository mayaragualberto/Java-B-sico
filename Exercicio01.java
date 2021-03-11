// Subtracao de um numero pelo segundo numero

public class Exercicio01 {
	public static void main(String[] args) {
		int N1, N2, SUB;

		System.out.print("Informe o primeiro numero: ");
		N1 = Integer.parseInt(System.console().readLine());

		System.out.print("Informe o segundo numero: ");
		N2 = Integer.parseInt(System.console().readLine());

		SUB = N1 - N2;

		System.out.printf("Subtracao = %d\n", SUB);
	}
}
