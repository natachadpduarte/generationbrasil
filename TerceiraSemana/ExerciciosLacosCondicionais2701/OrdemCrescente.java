/*2- Faça um programa que entre com três números e coloque em ordem crescente.*/

package LacosRepeticao;
import java.util.Scanner;

public class OrdemCrescente {

	public static void main (String args[]) {
		
		Scanner ler = new Scanner(System.in);
		
		int n1,n2,n3;
		
		System.out.println("Olá, informe três números ");
		System.out.println("Informe o primeiro: ");
		n1 = ler.nextInt();
		
		System.out.println("Informe o segundo: ");
		n2 = ler.nextInt();
		
		System.out.println("Informe o terceiro: ");
		n3 = ler.nextInt();
		
		if(n1<n2 && n1<n3 && n2<n3) {
			System.out.println(n1+"-"+n2+"-"+n3);
		}
		
		else if (n1<n2 && n1<n3 && n2>n3) {
			System.out.println(n1+"-"+n3+"-"+n2);
		}
		
		else if (n1>n2 && n2<n3 && n1<n3) {
			System.out.println(n2+"-"+n1+"-"+n3);
		}
		
		else if (n1<n2 && n1>n3 && n2>n3) {
			System.out.println(n3+"-"+n1+"-"+n2);
		}

		else if (n3<n1 && n3<n2 && n1>n2) {
			System.out.println(n3+"-"+n2+"-"+n1);
		}

		else {
			System.out.println(n2+"-"+n3+"-"+n1);
		}
		 

	}
}
