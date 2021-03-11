// Divisao do primeiro numero pelo segundo

public class Exercicio02 {
	public static void main(String[] args) {
		double N1, N2, DIV;

		System.out.print("Informe o primeiro numero: ");
		N1 = Double.parseDouble(System.console().readLine());

		System.out.print("Informe o segundo numero: ");
		N2 = Double.parseDouble(System.console().readLine());

		DIV = N1 / N2;

		System.out.printf("Divisao = %f\n", DIV);
	}
}
