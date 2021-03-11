// Valor do lucro, impostos e preço final

public class Exercicio12 {
	public static void main(String[] srgs) {
		double PrecoFabr, PercLucro, PercImp, Lucro, Imposto, PrecoFinal;

		System.out.print("Informe o preço de fábrica do veículo: ");
		PrecoFabr = Double.parseDouble(System.console().readLine());

		System.out.print("Informe o percentual do lucro (%): ");
		PercLucro = Double.parseDouble(System.console().readLine());

		System.out.print("Informe o percentual de imposto (%): ");
		PercImp = Double.parseDouble(System.console().readLine());

		Lucro = PrecoFabr * (PercLucro/100);

		Imposto = PrecoFabr * (PercImp/100);

		PrecoFinal = PrecoFabr + Lucro + Imposto;

		System.out.printf("O valor correspondente ao lucro do distribuidor é R$ %.2f;\nO valor correspondente aos impostos é R$ %.2f;\nO preço final do produto é R$ %.2f.\n",Lucro,Imposto,PrecoFinal);
	}
}


