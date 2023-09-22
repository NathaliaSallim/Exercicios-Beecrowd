import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int FUNCIONARIO, horasT;
		double valorH, salario;
		
		FUNCIONARIO = sc.nextInt();
		horasT = sc.nextInt();
		valorH = sc.nextDouble();
		
		salario = horasT * valorH;
		
		System.out.println("NUMBER = " + FUNCIONARIO);	
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();

	}

}
