package com.github.Jprnp.elementarySum;

import java.util.Scanner;

public class ProgramaFatorial {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int n;
		
		System.out.println("Número a ser calculado: ");
		while (true) {
			try {
				n = Integer.parseInt(read.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Digitar valor válido!");
			}
			catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("Fatorial: " + Fatorial.doFat(n));
		System.exit(0);
	}
}
