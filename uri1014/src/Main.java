import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		int X;
		double Y, TOTAL;
		
		X = sc.nextInt();
		Y = sc.nextDouble();
		
		TOTAL = X / Y;
		
		System.out.println(df.format(TOTAL) + " km/l");
		
		
		sc.close();

	}

}
