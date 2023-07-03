package es1;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[] = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (int) Math.floor(Math.random() * 10 + 1);
			System.out.println((i + 1) + " Random Number: " + numbers[i]);
		}
		int newNumb = 0;
		do {
				Scanner input = new Scanner(System.in);
				System.out.println("Scegli la posizione in cui vuoi cambiare numero, da 0 a 5");
				int position = input.nextInt();
				
				if (position <= 5 && position >= 0) {
				System.out.println("Inserisci un numero per quella posizione");
				int newNumber = input.nextInt();
				newNumb = newNumber;
				numbers[position] = newNumb;
				if (newNumb != 0) {
				for (int i = 0; i < numbers.length; i++) {
					System.out.print(numbers[i] + " ");
				}
				System.out.print("\n");
			} else {
				System.out.println("Hai finito");
				break;
			}
			} else {
			System.out.println("Hai inserito un numero sbagliato");
			input.close();
		}
				} while (newNumb != 0);


		}
}
