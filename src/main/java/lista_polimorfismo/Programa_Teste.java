package lista_polimorfismo;

import java.util.Random;

public class Programa_Teste {

	public static void main(String[] args) {
		
		Random gerarNumeros = new Random();
		int dimensaoFigurasGeometricas = gerarNumeros.nextInt(10) + 1;
		
		Quadrado quadrado = new Quadrado("Quadrado", dimensaoFigurasGeometricas);
		Círculo circulo = new Círculo("Círculo", dimensaoFigurasGeometricas);
		Retângulo retangulo = new Retângulo("Rêtangulo", dimensaoFigurasGeometricas, dimensaoFigurasGeometricas);
		Losango losango = new Losango("Losango", dimensaoFigurasGeometricas, dimensaoFigurasGeometricas, dimensaoFigurasGeometricas, dimensaoFigurasGeometricas);
		Triângulo_Retângulo triangulo_retangulo = new Triângulo_Retângulo("Triângulo Retângulo", dimensaoFigurasGeometricas, dimensaoFigurasGeometricas);
		Triângulo_Equilátero triangulo_equilatero = new Triângulo_Equilátero("Triângulo Equilátero", dimensaoFigurasGeometricas);
		Triângulo_Isósceles triangulo_isosceles = new Triângulo_Isósceles("Triângulo Isósceles", dimensaoFigurasGeometricas, dimensaoFigurasGeometricas);
		
		Forma_Geométrica[] arrayFormas = new Forma_Geométrica[7];
		
		for (Forma_Geométrica forma_Geométrica : arrayFormas) {
			
			System.out.println(forma_Geométrica.getNome());
			System.out.println("Área: " + forma_Geométrica.calcularArea());
			System.out.println("Perímetro: " + forma_Geométrica.calcularPerimetro());
			System.out.println();
		}
	}
	
	
}
