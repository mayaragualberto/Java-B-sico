// Conversão de medidas para polegadas, jardas e milhas

public class Exercicio10 {
	public static void main(String[] args) {
		double Pe, Pol, Jd, Mil;

		System.out.print("Informe a medida em pés: ");
		Pe = Double.parseDouble(System.console().readLine());

		Pol = Pe*12;

		Jd = Pe/3;

		Mil = Jd/1760;

		System.out.printf("A conversão é: %.3f polegadas, %.3f jardas e %.3f milhas.\n", Pol, Jd, Mil);

	}
}
