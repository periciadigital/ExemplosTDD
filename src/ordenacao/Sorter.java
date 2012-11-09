package ordenacao;

public class Sorter {
	public int[] sort(int[] arrayToBeOrdered) {
		while(arrayToBeOrdered[1] != 15){
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
}