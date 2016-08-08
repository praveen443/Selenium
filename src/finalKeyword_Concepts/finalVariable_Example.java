package finalKeyword_Concepts;

public class finalVariable_Example {
	final int MAX_VALUE= 99;
	
	public void myMethod(){
		 int MAX_VALUE=101;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		finalVariable_Example finalExm = new finalVariable_Example(55);
		finalExm.myMethod();
	}

	/**
	 * @summary: Parameterized constructor
	 * @param number
	 */
	public finalVariable_Example(int number) {
		// TODO Auto-generated constructor stub
		System.out.println(MAX_VALUE);
	}
	
	/**
	 * @summary: Default constructor
	 */
	public finalVariable_Example(){
		
	}
	
	/**
	 * @summary: No-arg Constructor.
	 */
	/*public finalVariable_Example(){
		System.out.println(MAX_VALUE);
	}*/
}
