// Salario a receber

public class Exercicio05 {
	public static void main(String[] args) {
		double SB, Grat, Imp, SaL;

		System.out.print("Informe o salário base: ");
		SB = Double.parseDouble(System.console().readLine());

		Grat = SB * 0.05;

		Imp = SB* 0.07;

		SaL = SB + Grat - Imp;

		System.out.printf("O salário a receber é R$ %.2f\n", SaL);
	}
}
