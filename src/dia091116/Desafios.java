package dia091116;

public class Desafios {

	public Desafios() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * Este exerc�cio visa obter o capacidade do formando dw
	 *  1) declarar e inicializar um array
	 *  2) utilizar um ciclo devidamente
	 *  3) obter o valor da soma dos conte�dos do array 
	 *  recorrendo a um ciclo
	 */
	public void exercicio1() {
		// declare um array paraSomar, com os valores 2,5,4
		int[] paraSomar = {2, 5, 4};
		
		// recorrendo a um ciclo for, some os valores do array paraSomar
		int soma = 0;
		
		for (int i=0; i < paraSomar.length; i++)
			soma = soma + paraSomar[i];
		// || soma += paraSomar[i]
		
		// mostre no ecr� a soma obtida
		System.out.println(soma);
	}
	
	/*
	 * 
	 */
	public void exercicio2() {
		// desafio
	}
}
