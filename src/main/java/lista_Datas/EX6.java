package lista_Datas;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EX6 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.of("America/São_Paulo"));
		
		System.out.print("Informe uma data no padrão 'dd/MM/yyyy' e uma hora no padrão 'HH:mm:ss': ");
		String data = input.nextLine();
		
		
		
	}

}
