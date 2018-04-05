package regularexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Emailmatch {

	public static void main(String[] args) {

		String pattern ="\\w{5,}@[a-zA-Z]{2,}.[a-zA-Z]{3,}";
		String input = "mukesh@gmail.com";
		Pattern mail = Pattern.compile(pattern);
		Matcher match = mail.matcher(input);
		
		while(match.find()) {
			System.out.println(match.group());
		}
	}

}
