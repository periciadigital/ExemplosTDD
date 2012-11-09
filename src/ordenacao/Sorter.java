package ordenacao;

public class Sorter {
	public int[] sort(int[] arrayToBeOrdered) {
		int trocas = Integer.MAX_VALUE;

		while (trocas > 0) {
			trocas = 0;

			for (int i = 0; i < arrayToBeOrdered.length - 1; i++) {
				int aux = arrayToBeOrdered[i];

				if (aux > arrayToBeOrdered[i + 1]) {
					arrayToBeOrdered[i] = arrayToBeOrdered[i + 1];
					arrayToBeOrdered[i + 1] = aux;
					trocas++;
				}
			}
		}

		return arrayToBeOrdered;
	}
}