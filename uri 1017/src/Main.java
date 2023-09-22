import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		
		int HORAS, KMH, DISTANCIA;
		double LITROS;
		
		HORAS = sc.nextInt();
		KMH = sc.nextInt();
		DISTANCIA = HORAS * KMH;
		LITROS = DISTANCIA / 12.0;
		
		System.out.println(df.format(LITROS));

		sc.close();
	}

}
