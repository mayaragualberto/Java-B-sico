// Valor do salário a receber

public class Exercicio13 {
	public static void main(String[] args) {
		double HorasTrab, SalMin, VHorasTrab, SB, Imp, SFinal;

		System.out.print("Informe o número de horas trabalhadas: ");
		HorasTrab = Double.parseDouble(System.console().readLine());

		System.out.print("Informe o salário mínimo: ");	
		SalMin = Double.parseDouble(System.console().readLine());

		VHorasTrab = SalMin/10;

		SB = HorasTrab * VHorasTrab;

		Imp = SB * 0.03;

		SFinal = SB - Imp;

		System.out.printf("O valor final a receber é R$ %.2f\n", SFinal);
	}
}
