package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		Pessoas[] vetorPessoas = new Pessoas[10];
		
		System.out.printf("How many rooms will be rented? ");
		int numberRents = sc.nextInt();
		sc.nextLine();
		
		
		String auxName, auxEmail;
		int auxRoom;
		
		
		for (int i = 0; i<numberRents; i++) {
			System.out.printf("\nRent #%d: \n", i+1);
			System.out.print("Name: ");
			auxName = sc.nextLine();
			System.out.print("Email: ");
			auxEmail = sc.nextLine();
			System.out.print("Room: ");
			auxRoom = sc.nextInt();
			sc.nextLine();
			
			vetorPessoas[auxRoom] = new Pessoas(auxName, auxEmail, auxRoom);			
		}
		
		System.out.println("\nBusy rooms: ");
		
		for (int i = 0; i<vetorPessoas.length; i++) {
			if (vetorPessoas[i] != null){
				System.out.println(i +": " + vetorPessoas[i]);
			}
		}
		
		System.out.printf("\nFIM");
		
		sc.close();
	}

}
