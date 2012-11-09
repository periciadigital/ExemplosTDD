package ordenacao;

public class Sorter {
	public int[] sort(int[] arrayToBeOrdered) {
		for (int i = 0; i < arrayToBeOrdered.length - 1; i += 2) {
			int aux = arrayToBeOrdered[i];
			arrayToBeOrdered[i] = arrayToBeOrdered[i + 1];
			arrayToBeOrdered[i + 1] = aux;
		}

		return arrayToBeOrdered;
	}
}