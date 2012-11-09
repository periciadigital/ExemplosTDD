package ordenacao;

public class Sorter {
	public int[] sort(int[] arrayToBeOrdered) {
		if(arrayToBeOrdered.length == 1){
		}else{
			int aux = arrayToBeOrdered[0];
			arrayToBeOrdered[0] = arrayToBeOrdered[1];
			arrayToBeOrdered[1] = aux;
		}
		
		return arrayToBeOrdered;
	}
}