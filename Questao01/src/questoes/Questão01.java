package questoes;

import java.util.Scanner;

public class Quest�o01 {

	public class Teste {
		public static void main(String[] args) {
		/*# Quest�o 01
			Escreva um algoritmo que 
			mostre na tela uma escada de tamanho n utilizando o caractere * e espa�os. 
			A base e altura da escada devem ser iguais ao valor de n. A �ltima linha n�o deve conter nenhum espa�o.*/
			
			Scanner entrada = new Scanner(System.in);
			
			int d;
			
			System.out.print("Digite a Quantidade de degrais: ");
			d = entrada.nextInt();
			
			for(int i = 1; i<= d; i++) {
			    for (int j=d; j>=1; j--){
				     if(j > i) {
				    	 System.out.print(" ");
				     }else {
				    	 System.out.print("*");
				     }
			    }
			    System.out.println();
			}
			entrada.close();
		}
	}
}
