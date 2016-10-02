package com.github.Jprnp.elementarySum;

import static org.junit.Assert.*;

import org.junit.Test;

public class NaturalLogTest {

	@Test(expected = IllegalArgumentException.class)
	public void valorInvalido() {
		float a = 0, b = 0;
		NaturalLog.doNatLog(a, b);
	}
	
	@Test
	public void LogaritmoNaturalDe1E2() {
        assertEquals(2.5, NaturalLog.doNatLog(1, 2), 0.0);
	}
	
	@Test
	public void cemPorCentoDeCoberturaJacoco() {
		new NaturalLog();
	}

}
