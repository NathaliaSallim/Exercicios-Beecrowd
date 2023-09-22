import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade, anos, meses, dias, resto;
		
		idade = sc.nextInt();
		
		anos = idade / 365;
		resto = idade % 365;
		meses = resto / 30;
		dias = resto % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		sc.close();

	}

}
