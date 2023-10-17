package lista_Datas;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class EX5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		System.out.print("Informe sua data de nascimento no padrão 'dd/MM/yyyy' e sua hora de nascimento no padrão 'HH:mm:ss': ");
		String data = input.nextLine();
		
		LocalDateTime dataEHoraNascimento = LocalDateTime.parse(data, formatador);
		
		LocalDate dataAgora = LocalDate.now();
		
		Duration tempoDeVida = Duration.between(dataEHoraNascimento, dataAgora);
		
		System.out.println("O tempo de vida do usuário é: " +tempoDeVida.toHoursPart());
		
		input.close();
	}

}
