import java.util.Scanner;

public class uri1159 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();		
		
		while (x != 0) {
			
			//se for impar, some + 1
			if ( x % 2 != 0) {
				x = x + 1;
			}
			
			// expressão simpoficada de x + x + 2 + x + 4 + x + 6 + x + 8;
			int soma = 5 * x + 20;
			System.out.println(soma);
			
			x = sc.nextInt();
		}

		
		sc.close();
	}

}
