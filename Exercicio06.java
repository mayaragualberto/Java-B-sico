// Comissao e salario final

public class Exercicio06 {
	public static void main(String[] args) {
		double SFixo, VVendas, Com, SFinal;

		System.out.print("Informe o salário fixo: ");
		SFixo = Double.parseDouble(System.console().readLine());

		System.out.print("Informe o valor das vendas: ");
		VVendas = Double.parseDouble(System.console().readLine());

		Com = VVendas * 0.04;

		SFinal = SFixo + Com;

		System.out.printf("A sua comissão é de R$ %.2f e o salário final é R$ %.2f.\n", Com, SFinal);
	}
}
