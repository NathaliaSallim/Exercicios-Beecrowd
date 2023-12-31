import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		double R, VOLUME;
		double pi = 3.14159;
		
		R = sc.nextInt();
		VOLUME = 4.0/3.0 * pi * Math.pow(R,3.0);
		
		System.out.printf("VOLUME = %.3f%n", VOLUME);
		
		sc.close();

	}

}
