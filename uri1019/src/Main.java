import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int N, resto, horas, minutos, segundos;
		
		N = sc.nextInt();
		horas = N / 3600;
		resto = N % 3600; //resto da divisão de N / 3600, operador mod
		
		minutos = resto / 60; // o resto do passo anterior / 60
		
		segundos = resto % 60; // o resto do passo anterior / 60
		

		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
	}

}
