import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double N;
		int c=0;
		
		for (int i = 0; i < 6; i++) {
			N = sc.nextDouble();
			if (N > 0.0) {
				c++;
			}
		}
		
		System.out.println(c + " valores positivos");
		
		sc.close();
	}

}
