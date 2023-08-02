package exemplos;

import java.util.Scanner;

public class programaCao {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		Cao listaCaes[] = new Cao[4];
		
		// PRRENCHIMENTO DAS INFORMAÇÕES SOBRE A CLASSE CÃO.
		for (int i = 0; i < listaCaes.length; i++) {
			
			Cao cao = new Cao();
			
			System.out.println("Informe o nome do cão: ");
			cao.nome = input.nextLine();
			
			System.out.println("Informe a raça do cão: ");
			cao.raca = input.nextLine();
			
			System.out.println("Informe o peso do cão: ");
			cao.peso = input.nextDouble();
			
			listaCaes[i] = cao;
			
			input.nextLine();
		}
		
		for (int i = 0; i < listaCaes.length; i++) {
			
			if (listaCaes[i].peso > 15) {
				
				System.out.println("Nome: " + listaCaes[i].nome);
				listaCaes[i].falar();
			}
		}
		
		input.close();
	}

}
