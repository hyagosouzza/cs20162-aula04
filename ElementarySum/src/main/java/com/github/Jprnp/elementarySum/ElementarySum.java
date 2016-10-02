package com.github.Jprnp.elementarySum;

public class ElementarySum {
	/**
	 * @author Jprnp
	 * @param n Quantos números calcular
	 * @return Soma dos n primeiros números naturais
	 */
	public static double doSum(int n) {
		float i = 1;
        double s = 0;
        float d;
        while(i <= n) {
            d = 1 + i * i;
            s = s + 1/d;
            i = i + i;
        }
        return s;
	}
}
