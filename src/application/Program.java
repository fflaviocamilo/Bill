package application;

import java.util.Scanner;

import javax.swing.text.html.parser.Parser;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bill bill = new Bill();
		Scanner sc = new Scanner(System.in);

		Scanner scsexo = new Scanner(System.in);
		char sexo = 'R';
		while (!(sexo == 'M' || (sexo == 'F'))) {
			System.out.print("Digite sexo F ou M: ");
			sexo = sc.next().charAt(0);
			bill.gender = sexo;
		}
		 
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		
		System.out.print("Quantidade de refrigerante: ");
		bill.softDrink = sc.nextInt();
		
		System.out.print("Quantidade de espetinos: ");
		bill.barbecue = sc.nextInt();
		
		System.out.println("Relatorio");
		
		System.out.printf("Consumo : %.2f%n", bill.feeding());
		System.out.printf("Covert : %.2f%n", bill.cover());
		System.out.printf("Ingresso : %.2f%n", bill.ticket());
		System.out.printf("Total : %.2f%n", bill.total());
		 

	}

}
