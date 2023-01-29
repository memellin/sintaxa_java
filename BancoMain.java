package curso_prog;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class BancoMain {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		System.out.println("Insira os dados da sua conta: ");
		System.out.print("Número da conta: ");
		int num = sc.nextInt();
		System.out.print("Name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Depósito, sim ou nao?: ");
		char resp = sc.next().charAt(0);
		if( resp == 'y') {
			System.out.print("Valor de deposito: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(num, name, initialDeposit);

		} else {
			account = new Account(num, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Update account data: ");
		System.out.println(account);
		
		

		sc.close();
	}
}