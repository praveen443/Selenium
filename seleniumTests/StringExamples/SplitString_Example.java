package StringExamples;

public class SplitString_Example {

	public static void main(String[] args) {
		String str = "one.two.three";
		String delimiter = "\\.";
		String[] temp = str.split(delimiter);
		
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
	}

}
