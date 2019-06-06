import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Test pour TabAlgos.
 */
public final class TabAlgosTest {
	/** tab est un tableau static private.*/
	private final  int[] tab = {1, 13, 20, 9, 30, 18, 7};
	/** tab est un tableau static private .*/
	private final  int[] tab1 = {1, 13, 20, 9, 30, 18, 7};
	/** a est une constante .*/
	private final int a = 30;
	/** b est une constante .*/
	private final double b = 14;
	/** Teste la methode plusGrand() . */
	@Test
	public void plusGrandTest() {
      int pgrd = TabAlgos.plusGrand(tab);
	  assertEquals(a, pgrd);
	}
	/** Teste la methode moyenne() . */
	@Test
	public void moyenneTest() {
      double avg = TabAlgos.moyenne(tab);
	  assertEquals(b, avg, b);
	}
	/** Teste la methode egaux() . */
	@Test
	public void egauxTest() {
		assertTrue(TabAlgos.egaux(tab, tab1));
	}
}
