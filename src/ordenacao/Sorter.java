package ordenacao;

public class Sorter {
	public int[] sort(int[] arrayToBeOrdered) {
		int i = 0;
		
		if(arrayToBeOrdered.length > 2){
			int aux = arrayToBeOrdered[i];
			arrayToBeOrdered[i] = arrayToBeOrdered[i + 1];
			arrayToBeOrdered[i + 1] = aux;
			
			aux = arrayToBeOrdered[2];
			arrayToBeOrdered[2] = arrayToBeOrdered[3];
			arrayToBeOrdered[3] = aux;
			
			aux = arrayToBeOrdered[4];
			arrayToBeOrdered[4] = arrayToBeOrdered[5];
			arrayToBeOrdered[5] = aux;
		}else if(arrayToBeOrdered.length > 1){
			int aux = arrayToBeOrdered[i];
			arrayToBeOrdered[i] = arrayToBeOrdered[i + 1];
			arrayToBeOrdered[i + 1] = aux;
		}
		
		return arrayToBeOrdered;
	}
}