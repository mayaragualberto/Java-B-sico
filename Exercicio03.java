// Media de tres notas

public class Exercicio03 {
	public static void main(String[] args) {
		double N1, N2, N3, MED;

		System.out.print("Informe a primeira nota: ");
		N1 = Double.parseDouble(System.console().readLine());

		System.out.print("Informe a segunda nota: ");
		N2 = Double.parseDouble(System.console().readLine());

		System.out.print("Informe a terceira nota: ");
		N3 = Double.parseDouble(System.console().readLine());

		MED = (N1+N2+N3)/3;

		System.out.printf("Media das notas = %f\n", MED);
	}
}
