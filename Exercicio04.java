// Calculo de novo preco

public class Exercicio04 {
	public static void main(String[] args) {
		double P, Desc, NP;

		System.out.print("Informe o preco: ");
		P = Double.parseDouble(System.console().readLine());

		Desc = P * 10/100;

		NP = P - Desc;

		System.out.printf("O novo preco é R$ %.2f\n", NP);
	}
}
