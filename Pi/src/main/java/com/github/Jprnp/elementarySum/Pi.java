package com.github.Jprnp.elementarySum;

public class Pi {
	/**
	 * @author Jprnp
	 * @param n Número de Iterações para Cálculo de PI (4 casas decimais a partir de 500000)
	 * @return valor calculado de pi
	 */
	public static double getPi(long n) {
		double pi = 0;
		double i = 0, s = -1, d = -1;
		if (n < 1) {
			throw new IllegalArgumentException("numero deve ser >= 1.");
		}
		
		while ( i <= n) {
			d  += 2;
			s  *= -1;
			pi += 4 * s / d;
			i++; 
			
		}
		
		return pi;
	}
}
