package lista_Herança2;

import java.text.DecimalFormat;

public class Oficina {

	public static void main(String[] args) {
		
		
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		Furadeira furadeira = new Furadeira("furadeira", "deira", 8.5, 0.5, 700, 4.5, 220);
		Lixadeira lixadeira = new Lixadeira("lixadeira", "eira", 5.5, 0.8, 400, 5.5, 220);
		Serra serra = new Serra ("serra", "erra", 3.3, 0.2, 550, 6.6, 220);
		Alicate alicate1 = new Alicate("alicate", "cate", 3.5, 0.1, "bico", 2);
		Alicate alicate2 = new Alicate("alicati", "cati", 3.8, 0.2, "corte", 2.3);
		Martelo martelo1 = new Martelo("martelo", "elo", 4.5, 0.3, "bola", 1000);
		Martelo martelo2 = new Martelo("martelu", "elu", 4.8, 0.4, "pena", 980);
		Serrote serrote = new Serrote("serrote", "ote", 6, 0.8, "universal", 9, 45);
		
		double consumoMes = (furadeira.getPotenciaWatts() * 3) + (lixadeira.getPotenciaWatts() * 2) + (serra.getPotenciaWatts() * 4) * 30;
		System.out.println(formatador.format(consumoMes));
		
		double consumoSemana = (furadeira.getPotenciaWatts() * 3) + (lixadeira.getPotenciaWatts() * 2) + (serra.getPotenciaWatts() * 4) * 7;
		System.out.println(formatador.format(consumoSemana));
		
		Ferramentas[] ferramentasManuais = new Ferramentas[5];
		
		ferramentasManuais[0] = alicate1;
		ferramentasManuais[1] = alicate2;
		ferramentasManuais[2] = martelo1;
		ferramentasManuais[3] = martelo2;
		ferramentasManuais[4] = serrote;
		
		Ferramentas maiorVidaUtil = ferramentasManuais[0];
		
		for (int i = 0; i < ferramentasManuais.length; i++) {
			
			if (ferramentasManuais[i].getPercentualDesgaste() < maiorVidaUtil.getPercentualDesgaste()) {
				
				maiorVidaUtil = ferramentasManuais[i];
			}
		}
		
		System.out.println(maiorVidaUtil.getFabricante()+ " " + maiorVidaUtil.getModelo());
		
	}

}
