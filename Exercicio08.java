// Área de um triângulo

public class Exercicio08 {
	public static void main(String[] args) {
		double Base, Altura, Area;

		System.out.print("Informe a medida da base: ");
		Base = Double.parseDouble(System.console().readLine());

		System.out.print("Informe a medida da altura: ");
		Altura = Double.parseDouble(System.console().readLine());

		Area = (Base*Altura)/2;

		System.out.printf("A área do triângulo é %.2f.\n",Area);
	}
}
