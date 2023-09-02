package string;

import java.util.LinkedList;
import java.util.List;

public class Lists {
	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		List<String> listofcomp = new LinkedList<String>();
		
		listofcomp.add("HCL");
		listofcomp.add("TCS");
		listofcomp.add("PAYPAL");
		listofcomp.add("HCL");
		listofcomp.add("INFOSYS");
		listofcomp.add("WIPRO");
		
		for (String test2 : listofcomp) {
			System.out.println(test2);
			
		}
		
			
		}
		
}

