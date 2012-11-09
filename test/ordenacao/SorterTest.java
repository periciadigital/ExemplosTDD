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
		
		int[] arrayToBeOrdered = {10};
		int[] arrayOrdenado = sorter.sort(arrayToBeOrdered);
		
		Assert.assertArrayEquals(arrayToBeOrdered, arrayOrdenado);
	}
	
	@Test
	public void arrayComDoisElementosTrocados(){
		Sorter sorter = new Sorter();
		
		int[] arrayToBeOrdered = {20,10};
		int[] arrayOrdenado = sorter.sort(arrayToBeOrdered);
		
		Assert.assertArrayEquals(new int[]{10, 20}, arrayOrdenado);
	}
}