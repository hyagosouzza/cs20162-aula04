package com.github.Jprnp.elementarySum;

import static org.junit.Assert.*;

import org.junit.Test;

public class FatorialTest {

	@Test(expected = IllegalArgumentException.class)
	public void valorInvalido() {
		Fatorial.doFat(-1);
	}
	
	@Test
	public void fatorialDe6E720() {
		assertEquals(720, Fatorial.doFat(6));
	}
	
	@Test
	public void cemPorCentoDeCoberturaJacoco() {
		new Fatorial();
	}

}
