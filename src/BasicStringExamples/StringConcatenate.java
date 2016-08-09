package BasicStringExamples;

public class StringConcatenate {

	public static void main(String[] args) {

		
		//--------------------------------------------------
		//We can concatenate a string using two approaches:
		//--------------------------------------------------
		//1. Using '+' operator.
		//2. Using 'Concat' method.
		
		String x ="Hello EveryOne! ";
		String y = "Good Morning.";
		String z = x+y;
		System.out.println("Concatenating the String using '+' operator." + z);
		
		//--------------------------------------------------
		
		String a = "Hello EveryOne! ";
		String b = "Good Morning.";
		String c = a.concat(b);
		System.out.println("Concatenating the String using 'Concat' method :" + c);
		
		//--------------------------------------------------
		
	}

}
