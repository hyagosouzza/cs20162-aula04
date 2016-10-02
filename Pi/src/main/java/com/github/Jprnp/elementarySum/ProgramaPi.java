package com.github.Jprnp.elementarySum;

import java.util.Scanner;

public class ProgramaPi {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		long n;
		
		System.out.println("Numero de Iteracoes: ");
		while (true) {
			try {
				n = Long.parseLong(read.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Digitar valor válido!");
			}
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("Pi: " + Pi.getPi(n));
		System.exit(0);
	}
}
