import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, c = 0;
		
		for (int i = 0; i < 5; i++) {
			N = sc.nextInt();
			if (N % 2 == 0) {
				c++;
			}
		}
		System.out.println(c + "valores pares");

		sc.close();
	}

}
