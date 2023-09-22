import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	

		int horaInicial = sc.nextInt();
		int minutoInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		int minutoFinal = sc.nextInt();
		int Inicio = horaInicial * 60 + minutoInicial;
		int Final = horaFinal * 60 + minutoFinal;
		
		int duracao;
		if (Inicio < Final) {
			duracao = Final - Inicio;
		}
		else {
			duracao = (24 * 60 - Inicio) + Final;
		}
		
		int duracaoHoras = duracao / 60;
		int duracaoMinutos = duracao % 60;
		
		System.out.println("O JOGO DUROU " + duracaoHoras + " HORA(S) E " + duracaoMinutos + " MINUTO(S)");
		
		sc.close();
	}

}
