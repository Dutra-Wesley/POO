package lista_Datas;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um dia: ");
		int dia = input.nextInt();
		
		LocalDate data = LocalDate.now();
		
		LocalDate dataFutura = data.plusDays(dia);
		DayOfWeek diaDaSemana = dataFutura.getDayOfWeek();
		
		System.out.println("Daqui a " + dia + " dia(s), será dia: " + dataFutura.getDayOfMonth() + "/" + dataFutura.getMonthValue() + "/" + dataFutura.getYear() + " " + diaDaSemana.getDisplayName(TextStyle.FULL, new Locale("pt", "BR")));
		
		input.close();
	}

}
