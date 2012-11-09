package ordenacao;

public class Sorter {
	public int[] sort(int[] arrayToBeOrdered) {
		while(arrayToBeOrdered[0] != 10){
			for (int i = 0; i < arrayToBeOrdered.length - 1; i += 2) {
				int aux = arrayToBeOrdered[i];
				
				if (aux > arrayToBeOrdered[i + 1]) {
					arrayToBeOrdered[i] = arrayToBeOrdered[i + 1];
					arrayToBeOrdered[i + 1] = aux;
				}
			}
		}

		return arrayToBeOrdered;
	}
}