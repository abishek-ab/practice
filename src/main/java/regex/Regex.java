package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String regex = "^(?=.*[\\d])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=.*[^\\s]).{8,20}$";
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher("Geeks @portal20");
		
		
		
		System.out.println(matcher.matches());

	}

}
