package SamplePrograms;

import edu.emory.mathcs.backport.java.util.Arrays;

public class SearchArrayswith_ArraysbinarySearch {

	public static void main(String[] args) {
		
		//Searching Arrays with Arrays.binarySearch()
		int array1[] = {0,1,2,3,4,5,6};
		int getIndexValue = Arrays.binarySearch(array1, 1);
		System.out.println(getIndexValue);
	}

}
