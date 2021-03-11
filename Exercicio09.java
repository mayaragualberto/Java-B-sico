// Área de um quadrado

public class Exercicio09 {
	public static void main(String[] args) {
		double Lado, Area;

		System.out.print("Informe a medida do lado: ");
		Lado = Double.parseDouble(System.console().readLine());

		Area = Lado*Lado;

		System.out.printf("A área do quadrado é %.2f.\n",Area);
	}
}
