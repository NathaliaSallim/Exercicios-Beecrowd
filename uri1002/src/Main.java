import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, n, raio;
		
		raio = sc.nextDouble();
		n = 3.14159;
		
		raio = Math.pow(raio, 2.0);
		A = n * raio;
		
		System.out.printf("A=%.4f%n" , A);
		
		sc.close();
	}
		
}
