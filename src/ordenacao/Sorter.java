package ordenacao;

public class Sorter {
	public int[] sort(int[] arrayToBeOrdered) {
		while (!isOrdered(arrayToBeOrdered)) {
			for (int i = 0; i < arrayToBeOrdered.length - 1; i++) {
				int aux = arrayToBeOrdered[i];

				if (aux > arrayToBeOrdered[i + 1]) {
					arrayToBeOrdered[i] = arrayToBeOrdered[i + 1];
					arrayToBeOrdered[i + 1] = aux;
				}
			}
		}

		return arrayToBeOrdered;
	}

	private boolean isOrdered(int[] arrayToBeOrdered) {
		for (int i = 0; i < arrayToBeOrdered.length - 1; i++) {
			int aux = arrayToBeOrdered[i];

			if (aux > arrayToBeOrdered[i + 1]) {
				return false;
			}
		}

		return true;
	}
}