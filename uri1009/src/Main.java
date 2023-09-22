import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		String NOME;
		double SALARIO, VENDAS, TOTAL;
	
		
		NOME = sc.next();
		SALARIO = sc.nextDouble();
		VENDAS = sc.nextDouble();
		
		
		TOTAL = SALARIO + VENDAS * 0.15;
		
		System.out.println("TOTAL = R$ " + df.format(TOTAL));
		
		
		
		sc.close();

	}

}
