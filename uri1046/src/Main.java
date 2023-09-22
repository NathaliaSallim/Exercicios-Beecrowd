import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int total;
		
		if (horaInicial < horaFinal) {
			total = horaFinal - horaInicial;
		}
		else {
			total = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O JOGO DUROU " + total + " HORA(S)");

		sc.close();
	}

}
