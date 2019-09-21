public class QuickSort implements SortingAlgorithm{

	public void sort(int [] a ){
		qs(a, 0, a.length-1);
	}

	private void swap(int [] a, int i,int j){
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}


	private void qs(int [] a, int left, int right){
		if (left<right){
			int p=partition(a, left, right);
			qs(a, left, p-1);
			qs(a, p+1, right);
		}
	}

	private int partition(int [] a, int left, int right){
		int pivot=a[right];
		int flip=(left-1);

		for (int i=left; i<right; i++){
			if (a[i]<pivot){
				flip++;
				swap(a, flip, i);
			}

		}

		swap(a, flip+1, right);
		return flip+1;
	}
}