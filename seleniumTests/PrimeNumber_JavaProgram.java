
public class PrimeNumber_JavaProgram {

	public static void main(String[] args){
		
		int limit = 100;
		System.out.println("Prime numbers between 1 & "+ limit);
		
		for(int i=1; i<limit; i++){
			boolean isPrime =  true;
			for(int j=2;j<i;j++){
				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			System.out.println(i + " ");
		}
     }
	/*int limit = 100;
	
	System.out.println("Prime numbers between 1 & " + limit);
	
	for(int i=1;i<limit;i++){
		
		boolean isPrime = true;
		
		for(int j=2; j<i;j++){
			if(i % j == 0){
				isPrime = false;
				break;
			}
		}
		if(isPrime){
			System.out.println( i + " ");
		}
	}*/
	
}