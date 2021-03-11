// Media ponderada de tres notas

public class Exercicio07 {
	public static void main(String[] args) {
		double N1, N2, N3, P1, P2, P3, Media;

		System.out.print("Informe a primeira nota: ");
		N1 = Double.parseDouble(System.console().readLine());

		System.out.print("Informe o peso da primeira nota: ");
		P1 = Double.parseDouble(System.console().readLine());

		System.out.print("Informe a segunda nota: ");
		N2 = Double.parseDouble(System.console().readLine());

		System.out.print("Informe o peso da segunda nota: ");
		P2 = Double.parseDouble(System.console().readLine());

		System.out.print("Informe a terceira nota: ");
		N3 = Double.parseDouble(System.console().readLine());

		System.out.print("Informe o peso da terceira nota: ");
		P3 = Double.parseDouble(System.console().readLine());

		Media = (N1*P1 + N2*P2 + N3*P3)/(P1+P2+P3);

		System.out.printf("A média ponderada é %.2f.\n", Media);
	}
}
