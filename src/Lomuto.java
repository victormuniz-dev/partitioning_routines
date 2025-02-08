/*The Lomuto rotine of partition is used to ordenate data so that we can have
 * smaller elements in the left side of pivot and greater on right site.
 *This routine is commonly used in Quick Sort algorithm*/

public class Lomuto{
	public int lomuto(int[] v, int left, int right){
		int pivot = v[left];
		int i = left;

		for(int j = left + 1; j <= right; j++){
			if(v[j] <= pivot){
				i++;
				swap(v, i, j);
			}
		}

		swap(v, left, i);
		return i;
	}

	private void swap(int[] v,int i, int j){
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	} 
}
