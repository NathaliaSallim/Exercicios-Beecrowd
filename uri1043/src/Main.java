import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double perimetro;
		double area;
		
		if (((B - C) < A) && (A < B + C) && ((A - C) < B) && (B < A + C) && ((A - B) < C) && (C < A + B)) {
			perimetro = A + B + C;
			System.out.println("Perimetro = " + perimetro);
		}
		else {
			area = (A + B) * C / 2.0;
			System.out.println("Area = " + area);
		}
		
		sc.close();
	
	}

}
