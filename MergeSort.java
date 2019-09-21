public class MergeSort implements SortingAlgorithm{

	public void sort(int [] a){
		ms(a, 0, a.length-1);
	}

	public void ms(int [] a, int left, int right ){
		if (left<right){
			int midpoint=(left +right)/2;

			ms(a, left, midpoint);
			ms(a, midpoint+1, right);

			merge(a, left, midpoint, right);
		}
	}


	public void merge(int [] a, int left, int midpoint, int right){
		int nleft=midpoint-left+1;
		int nright=right-midpoint;

		int Left[]= new int [nleft];
		int Right[]= new int [nright];

		for (int i=0; i<nleft; i++)
			Left[i]=a[left+i];
		for (int j=0; j<nright; j++)
			Right[j]=a[midpoint+1+j];

		int i=0, j=0;

		int k=left;
		while(i<nleft && j<nright)
		{
			if (Left[i]<=Right[j])
			{
				a[k]=Left[i];
				i++;
			}
			else
			{
				a[k]=Right[j];
				j++;
			}
			k++;
		}

		while(i<nleft)
		{
			a[k]=Left[i];
			i++;
			k++;
		}

		while(j<nright)
		{
			a[k]=Right[j];
			j++;
			k++;
		}
	}

}