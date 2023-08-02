package exemplos;

public class Cao {

	String nome;
	double peso;
	String raca;
	
	void falar () {
		
		if (peso > 60) {
			
			System.out.println("Woof, woof, woof");
			
		} else if (peso < 15) {
			
			System.out.println("Yip, Yip, Yip");
			
		} else {
			
			System.out.println("Ruff, Ruff, Ruff");
			
		}
		
	}
}
