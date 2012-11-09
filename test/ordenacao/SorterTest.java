package ordenacao;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Rodolfo Mendes
 *
 */
public class SorterTest {
	@Test
	public void arrayComUmElementoJaEstaOrdenado(){
		Sorter sorter = new Sorter();
		
		int[] arrayOrdenado = sorter.sort(new int[]{10});
		
		Assert.assertArrayEquals(new int[]{10}, arrayOrdenado);
	}
}