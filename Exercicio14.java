// Valor de cada quilowatt, valor a ser pago e valor com desconto

public class Exercicio14 {
	public static void main(String[] args) {
		double SalMin, QtdW, VW, VPago, Desconto, VDesc;

		System.out.print("Informe o valor do salário mínimo: ");
		SalMin = Double.parseDouble(System.console().readLine());
		
		System.out.print("Informe a quantidade de quilowatts consumida: ");
		QtdW = Double.parseDouble(System.console().readLine());

		VW = SalMin / 5;

		VPago = VW * QtdW;

		Desconto = VPago * 15/100;
		
		VDesc = VPago - Desconto;
		

		System.out.printf("O valor de cada quilowatt é R$ %.2f;\nO valor a ser pago por essa residência é R$ %.2f;\nO valor a ser pago com desconto é R$ %.2f.\n", VW, VPago, VDesc);
	
	}
}
