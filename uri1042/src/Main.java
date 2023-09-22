import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a < b && a < c && b < c) {
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		else if (a < b && a < c && c < b) {
			System.out.println(a);
			System.out.println(c);
			System.out.println(b);
		}
		else if (b < a && b < c && a < c) {
			System.out.println(b);
			System.out.println(a);
			System.out.println(c);
		}
		else if (b < a && b < c && c < a) {
			System.out.println(b);
			System.out.println(c);
			System.out.println(a);
		}
		else if (c < a && c < b && b < a) {
			System.out.println(c);
			System.out.println(b);
			System.out.println(a);
		}
		
		else {
			System.out.println(c);
			System.out.println(a);
			System.out.println(b);
		}
		
		System.out.println("\n" + a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();
	}

}
