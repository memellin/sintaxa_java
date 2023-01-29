package curso_prog;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Testes2_arrays {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rent[] vet = new Rent[10];
		
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int room = sc.nextInt();
			
			vet[room] = new Rent(name, email);
		}
		
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i = 0; i < 10; i++) {
			if (vet[i] != null) {
			System.out.println(i + ": " + vet[i]);
			}
		}
		
		
		sc.close();
	}
}
