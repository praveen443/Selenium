package SamplePrograms;

import java.util.*;

public class ArraysToStrings {

	public static void main(String[] args) {
		//Sort of array
		//Converting array to string.
		int[]  arrayVar = new int[10];
		for(int i=0; i < arrayVar.length; i++){
			arrayVar[i] = 10 - i;
		}
		System.out.println(Arrays.toString(arrayVar));
		
		/*int[] arrayVar1 = new int[10];
		for(int i=0;i<arrayVar1.length; i++){
			arrayVar1[i] = 10-i;
		}
		System.out.println(Arrays.toString(arrayVar1));*/
	}

}
