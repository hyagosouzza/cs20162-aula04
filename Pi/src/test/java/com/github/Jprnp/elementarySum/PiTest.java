package com.github.Jprnp.elementarySum;

import static org.junit.Assert.*;

import org.junit.Test;

public class PiTest {

	@Test(expected = IllegalArgumentException.class)
	public void valorInvalido() {
		Pi.getPi(-2);
	}
	
	@Test
	public void pi3Casas() {
		assertEquals(314, (int) (100 * Pi.getPi(500000)));
	}
	
	@Test
	public void cemPorCentoDeCoberturaJacoco() {
		new Pi();
	}

}
