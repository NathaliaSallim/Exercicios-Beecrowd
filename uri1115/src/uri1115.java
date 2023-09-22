//Escreva um programa para ler as coordenadas (X,Y) de uma quantidade 
//indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o 
//quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos 
//uma de duas coordenadas for NULA (nesta situação sem escrever mensagem 
//alguma).
//
// EXEMPLOS:   ENTRADA:   2 2    | SAÍDA:   primeiro
//                        3 -2   |          quarto
//                        -8 - 1 |          terceiro
//                        -7 1   |          segundo
//                        0 2    |

import java.util.Scanner;

public class uri1115 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (y > 0 && x > 0) {
				System.out.println("primeiro");
		
			}
			else if (y > 0 && x < 0) {
				System.out.println("segundo");
				
			}
			else if (y < 0 && x < 0) {
				System.out.println("terceiro");
				
			}
			else {
				System.out.println("quarto");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		

		sc.close();
	}

}
