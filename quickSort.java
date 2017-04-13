public class quickSort{
	public static void main(String[] args)
	{
		int[] a={12,20,5,16,15,1,30,45,23,9};
		fastSort one= new fastSort();
		one.qsort(a,0,9);
		for(int i:a)
			System.out.println(i);
	}
}
class fastSort
{
	public void qsort(int [] array,int left, int right)
	{
		int i,j,temp,t;
		if (left>=right)
			return;
		temp=array[left];
		i=left;
		j=right;
		while(i!=j)
		{
			while(array[j]>=temp&&j>i)
				j--;
			while(array[i]<=temp && i<j)
				i++;
			if(i<j)
				{
					t=array[i];
					array[i]=array[j];
					array[j]=t;
				}
		}
		array[left]=array[i];
		array[i]=temp;
		qsort(array,left,i-1);
		qsort(array,i+1,right);
	}
}
