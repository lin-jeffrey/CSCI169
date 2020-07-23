

public class Quicksort {
	// A simple print function
	static void print(int input[]) 
	{ 
		for (int i=0; i<input.length; i++) 
			System.out.print(input[i]+" "); 
		System.out.println(); 
	} 
	
	
	//The partition function
	int partition(int input[], int p, int r) 
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
	void quicksort(int arr[], int p, int r) 
	{ 
		if (p < r) 
		{ 
			int j = partition(arr, p, r); 
			quicksort(arr, p, j-1); 
			quicksort(arr, j+1, r); 
		} 
	} 

	//main function
	public static void main(String args[]) 
	{ 
		int input[] = {500, 700, 800, 100, 300, 200, 900, 400, 1000, 600};
		System.out.println("Input: "); 
		print(input);
		
		Quicksort quicksort = new Quicksort(); 
		quicksort.quicksort(input, 0, 9); 

		System.out.println("Output: "); 
		print(input); 
	} 
} 
