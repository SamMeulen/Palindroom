package be.vdab.valueobjects;

import org.junit.Assert;
import org.junit.Test;

import applicatieMetTesten.Jaar;

public class JaarTest {
	@Test
	public void eenJaarDeelbaarDoor400IsEenSchrikkeljaar() {
		Jaar jaar = new Jaar(2000);
		Assert.assertEquals(true, jaar.isSchrikkeljaar());
	}

	@Test
	public void eenJaarDeelbaarDoor100IsGeenSchrikkeljaar() {
		Assert.assertEquals(false, new Jaar(1900).isSchrikkeljaar());
	}

	@Test
	public void eenJaarDeelbaarDoor4IsEenSchrikkeljaar() {
		Assert.assertEquals(true, new Jaar(2012).isSchrikkeljaar());
	}

	@Test
	public void eenJaarNietDeelbaarDoor4IsGeenSchrikkeljaar() {
		Assert.assertEquals(false, new Jaar(2015).isSchrikkeljaar());
	}
}
