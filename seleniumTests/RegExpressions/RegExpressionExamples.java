package RegExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpressionExamples {
	public static void main(String[] args){
		RegExpressionExamples regexExmples = new RegExpressionExamples();
		regexExmples.regexMatchesMethod();
		regexExmples.regexPatternCompile();
		
	}
	
	public void regexMatchesMethod(){
		String content = "This is a tutorial Website!";
		String patternMatch = ".*tutorial.*";
		
		boolean isMatch = Pattern.matches(patternMatch, content);
		System.out.println("The text contains 'tutorial'? " + isMatch);
	}
	
	public void regexPatternCompile(){
		String pattern1 = "This is a tutorial Website!";
		String patternMatch1 = ".*tuToRiAl.*";
		
		Pattern pattern = Pattern.compile(patternMatch1, Pattern.CASE_INSENSITIVE);
		
	}
	
	public void  PatternmatcherMethod(){
		String content = "This is a tutorial Website!";
		String patternString = ".*tuToRiAl.*";
		Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(content);
		boolean isMatched = matcher.matches();
		System.out.println("Is it a Match?" + isMatched);
	}
}

