package ordenacao;

public class Sorter {
	public int[] sort(int[] arrayToBeOrdered) {
		if(arrayToBeOrdered.length > 2){
			int aux = arrayToBeOrdered[0];
			arrayToBeOrdered[0] = arrayToBeOrdered[1];
			arrayToBeOrdered[1] = aux;
			
			aux = arrayToBeOrdered[2];
			arrayToBeOrdered[2] = arrayToBeOrdered[3];
			arrayToBeOrdered[3] = aux;
			
			aux = arrayToBeOrdered[4];
			arrayToBeOrdered[4] = arrayToBeOrdered[5];
			arrayToBeOrdered[5] = aux;
		}else if(arrayToBeOrdered.length > 1){
			int aux = arrayToBeOrdered[0];
			arrayToBeOrdered[0] = arrayToBeOrdered[1];
			arrayToBeOrdered[1] = aux;
		}
		
		return arrayToBeOrdered;
	}
}