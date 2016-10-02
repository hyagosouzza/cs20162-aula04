package com.github.Jprnp.elementarySum;

public class Fatorial {
	/**
	 * 
	 * @param n Número para calculo de seu fatorial
	 * @return resultado de n!
	 */
	public static int doFat(int n) {
		int fat = 1;
		int i = 2;
		
		if (n < 1) {
			throw new IllegalArgumentException("Valor deve ser >= 1");
		}
		
		while (i <= n) {
			fat *= i;
			i++;
		}
		return fat;
	}
}
