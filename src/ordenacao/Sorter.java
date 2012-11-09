package ordenacao;

public class Sorter {
	public int[] sort(int[] arrayToBeOrdered) {
		int i = 0;

		if (arrayToBeOrdered.length > 2) {
			for (; i < arrayToBeOrdered.length - 1; i += 2) {
				int aux = arrayToBeOrdered[i];
				arrayToBeOrdered[i] = arrayToBeOrdered[i + 1];
				arrayToBeOrdered[i + 1] = aux;
			}
		} else if (arrayToBeOrdered.length > 1) {
			int aux = arrayToBeOrdered[i];
			arrayToBeOrdered[i] = arrayToBeOrdered[i + 1];
			arrayToBeOrdered[i + 1] = aux;
		}

		return arrayToBeOrdered;
	}
}