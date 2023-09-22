import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int km, MINUTOS;
		
		km = sc.nextInt();
		MINUTOS = (60 * km) / 30;

		
		System.out.println(MINUTOS + " minutos");
		
		sc.close();
		

	}

}
