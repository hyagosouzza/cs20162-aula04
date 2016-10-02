package com.github.Jprnp.elementarySum;

public class NaturalLog {
	/**
	 * @author Jprnp
	 * @param a float
	 * @param b float
	 * @return resultado do Logaritmo Natural
	 */
	public static float doNatLog(float a, float b) {
		int i = 2;
        float e = a + 1;
        float f;
        float p;
        
        if (a < 1 || b < 2) {
        	throw new IllegalArgumentException("Valor 1 deve ser >= 1 e "
        			+ "valor 2 deve ser >= 2");
        }
        
        while(i <= b) {
            p = (float) Math.pow(a, b);
            f = Fatorial.doFat(i);
            e = e + p / f;
            i = i + 1;
        }
        return e;
	}
}
