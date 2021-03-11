// Conversão de Celsius para Fahrenheit

public class Exercicio15 {
	public static void main(String[] args) {
		double TempC, TempF;

		System.out.print("Informe a temperatura em Celsius: ");
		TempC = Double.parseDouble(System.console().readLine());

		TempF = ((9*TempC)/5)+32;


		System.out.printf("A temperatura em Fahrenheit é %.2f.\n",TempF);

	}
}
