/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto*/


package LacosRepeticao;

import java.util.Scanner;
public class Idade {

		public static void main (String args[]) {
			
			Scanner ler = new Scanner(System.in);
			int idade;
			
			System.out.println("Olá, informe sua idade: ");
			idade = ler.nextInt();
			
			if(idade>=10 && idade<=14) {
				System.out.println("Você se enquadra na categoria infantil --> 10-14 anos!");
	
			}
			
			else if (idade>=15 && idade<=17){
				System.out.println("Você se enquadra na categoria juvenil --> 15-17 anos!");				 
			}
			
			else if (idade>=18 && idade<=25) {
				System.out.println("Você se enquadra na categoria adulto --> 18-25 anos!");
			}
			
			else {
				
				System.out.println("Você não se enquadra em nenhuma das categorias mapeadas.");
			}
		}
}
