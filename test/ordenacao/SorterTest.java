package ordenacao;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Rodolfo Mendes
 *
 */
public class SorterTest {
	private final Sorter sorter = new Sorter();

	@Test
	public void arrayComUmElementoJaEstaOrdenado(){
		int[] arrayToBeOrdered = {10};
		int[] arrayOrdenado = sorter.sort(arrayToBeOrdered);
		
		Assert.assertArrayEquals(arrayToBeOrdered, arrayOrdenado);
	}
	
	@Test
	public void arrayComDoisElementosTrocados(){
		int[] arrayToBeOrdered = {20,10};
		int[] arrayOrdenado = sorter.sort(arrayToBeOrdered);
		
		Assert.assertArrayEquals(new int[]{10, 20}, arrayOrdenado);
	}
}