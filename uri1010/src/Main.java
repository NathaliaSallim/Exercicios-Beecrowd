import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int CODIGO1, PECAS1, CODIGO2, PECAS2;
		double valorPeca1, valorPeca2, TOTAL;
		
		CODIGO1 = sc.nextInt();
		PECAS1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		CODIGO2 = sc.nextInt();
		PECAS2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		TOTAL = (PECAS1 * valorPeca1) + (PECAS2 * valorPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", TOTAL);		
		
		sc.close();				

	}

}
