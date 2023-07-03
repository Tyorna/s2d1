package es2;

import java.util.Scanner;

public class Auto {

	public static void main(String[] args) {
	Scanner auto = new Scanner(System.in);
	System.out.println("Inserire i km percorsi ");
	int km = auto.nextInt();
	System.out.println("Inserire i litri consumati");
	int carb = auto.nextInt();
	try {
		if (carb != 0) {
			double totale = (double) km / carb;
		System.out.println(totale);
	}
		throw new NumberException(carb);
	} catch (Exception e) {
		System.out.println("Problema di tipo aritmetico");
		throw new NumberException(carb);
	}
	}

}
