
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, 
		TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, 
		RETANGULO, pi;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		pi = 3.14159;
		TRIANGULO = A * C / 2.0;
		CIRCULO = pi * C * C;
		TRAPEZIO = (A + B) / 2.0 * C;
		QUADRADO = Math.pow(B, 2);
		RETANGULO = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
		System.out.printf("CIRCULO: %.3f%n", CIRCULO);
		System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
		System.out.printf("QUADRADO: %.3f%n", QUADRADO);
		System.out.printf("RETANGULO: %.3f%n", RETANGULO);
		
		sc.close();	

	}

}
