package com.github.Jprnp.elementarySum;

import java.util.Scanner;

public class ProgramaNaturalLog {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        System.out.println("Entre com o número:");
        float a = ler.nextFloat();
        while(a < 1) {
            System.out.println("Digite um número maior ou igual a 0.");
            a = ler.nextFloat();
        }
        System.out.println("Entre com outro número:");
        float b = ler.nextFloat();
        while(b < 2) {
            System.out.println("Digite um número maior ou igual a 1.");
            b = ler.nextFloat();
        }
        System.out.println("O logaritmo natural é: " + NaturalLog.doNatLog(a, b) + ".");
		System.exit(0);
	}
}
