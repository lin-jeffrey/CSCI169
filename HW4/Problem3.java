package problem3;

import java.util.Scanner;

public class SortedList {
	private int n;
	private int array[];

	//constructors
	public SortedList() {
	}
	public SortedList(int a[], int size) {
		array = a;
		n = size;
	}

	//functions
	public int getSize() {
		return this.n;
	}
	public int[] getArray() {
		return this.array;
	}
	
	public int[] insert(int a[], int newValue) {
		int newarr[] = new int[n + 1]; 
		for (int i = 0; i < n; i++) 
			newarr[i] = a[i]; 
		newarr[n] = newValue; 
		quicksort(newarr, 0, n); 
		return newarr; 
	}

	//The partition function
	public static int partition(int input[], int p, int r) 
	{ 
		int pivot = input[r]; 

		while ( p < r )
		{
			while ( input[p] < pivot )
				p++;

			while ( input[r] > pivot )
				r--;

			if ( input[p] == input[r] )
				p++;
			else if ( p < r )
			{
				int tmp = input[p];
				input[p] = input[r];
				input[r] = tmp;
			}
		}
		return r;
	} 


	//The quicksort recursive function
	public static void quicksort(int arr[], int p, int r) 
	{ 
		if (p < r) 
		{ 
			int j = partition(arr, p, r); 
			quicksort(arr, p, j-1); 
			quicksort(arr, j+1, r); 
		} 
	} 

	public static void binarysearch(int search, int array[]) {
		int first  = 0;
		int last   = array.length - 1;
		int middle = (first + last)/2;

		while( first <= last )
		{
			if ( array[middle] < search )
				first = middle + 1;    
			else if ( array[middle] == search ) 
			{
				System.out.println(search + " found at location " + middle + ".");
				break;
			}
			else
				last = middle - 1;

			middle = (first + last)/2;
		}
		if ( first > last )
			System.out.println(search + " is not present in the list.\n");
	}
	
	public static void main(String args[])//Move this into its own MainClass
	  {
	    int  n, search, array[];
	 
	    Scanner in = new Scanner(System.in);
	    System.out.println("Enter number of elements");
	    n = in.nextInt(); 
	    array = new int[n];
	 
	    System.out.println("Enter " + n + " integers");
	 
	    for (int c = 0; c < n; c++)
	      array[c] = in.nextInt();
	    
	    quicksort(array,0,n-1);
	    
	    System.out.println("Enter value to find");
	    search = in.nextInt();
	    binarysearch(search, array);
	    in.close();
	  }
}
