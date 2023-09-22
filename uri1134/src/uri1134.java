//Um Posto de combustíveis deseja determinar qual de seus produtos tem a 
//preferência de seus clientes. Escreva um algoritmo para ler o tipo de 
//combustível abastecido (codificado da seguinte forma: 
//1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código 
//inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que
//seja válido). O programa será encerrado quando o código informado for o 
//número 4.
//
// EXEMPLOS:      ENTRADA:    8  |   SAÍDA:   MUITO OBRIGADO
//                            1  |            Alcool: 1
//                            7  |            Gasoline: 2
//                            2  |            Diesel: 0
//                            2  |
//                            4  |

import java.util.Scanner;

public class uri1134 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int produto = sc.nextInt();
			
		while (produto != 4) {
			if (produto == 1) {
				alcool = alcool + 1;
			}
			else if (produto == 2) {
				gasolina = gasolina + 1;
			}
			else if (produto == 3) {
				diesel = diesel + 1;
			}
			produto = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
	}

}
