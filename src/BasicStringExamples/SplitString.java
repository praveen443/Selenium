package BasicStringExamples;

import org.testng.annotations.Test;

public class SplitString {
  String strText = "012-3456789";
  
  @Test
  public void splitStringExample() {
	 
	 /**
	  * @summary: This split (regex) takes a regex as an argument, remember to escape the regex special characters, like period/dot.
	  *//*
	 String[] outputText = strText.split("-");
	 System.out.println("Value in array index - 0 is: " + outputText[0]);
	 System.out.println("Value in array index - 1 is: " + outputText[1]);
	 
	 *//**
	  * @summary: Split a Period / dot
	  * The period / dot is a special character in regex, you have to escape it either with a double backlash 
	  * '\\.' or uses the 'Pattern.quote' method.
	  *//*
	 // METHOD-1: 
	 String strTest = "abc.def.123";
	 String[] strOutput = strTest.split("\\.");
	 System.out.println(strOutput[0]);
	 System.out.println(strOutput[1]);
	 System.out.println(strOutput[2]);
	 
	 // METHOD-2:
	 String[] strOutput1 = strTest.split(Pattern.quote("."));
	 System.out.println(strOutput1[0]);
	 System.out.println(strOutput1[1]);
	 System.out.println(strOutput1[2]);*/
			 
	 String strOutput2 = "abc.def.123";
	 
	 if(strOutput2.contains(".")){
		String[] output1 = strOutput2.split("\\.");
		if(output1.length!= 3){
			throw new IllegalArgumentException(strOutput2 + " - invalid format!");
		}else{
			System.out.println(output1[0]);
			System.out.println(output1[1]);
			System.out.println(output1[2]);
		}
	 }
			 
  }

}
