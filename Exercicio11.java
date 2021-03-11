// Idade em anos, meses, dias e em semanas

public class Exercicio11 {
	public static void main(String[] args) {
		int AnoAtual, AnoNasc, Anos, Meses, Dias, Semanas;

		System.out.print("Informe o ano atual: ");
		AnoAtual = Integer.parseInt(System.console().readLine());

		System.out.print("Informe o ano de nascimento: ");
		AnoNasc = Integer.parseInt(System.console().readLine());

		Anos = AnoAtual - AnoNasc;

		Meses = Anos*12;
		
		Dias = Anos*365;

		Semanas = Anos*52;

		System.out.printf("Sua idade em anos é %d, %d meses, %d dias ou %d semanas.\n", Anos, Meses, Dias, Semanas);

	}
}
