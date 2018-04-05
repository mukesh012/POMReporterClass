package string;

public class Char {

	public static void main(String[] args) {

		String MNC = "FISBSP";
		char a[] = MNC.toCharArray();
		int occ = MNC.length();
		for (int i = 0; i <occ; i++) {

			char val = a[i];
			int Ascii = (int)val;
			Ascii++;
			val = (char)Ascii;
			if (val == 'S') {
			System.out.print(val);
		
			
		}

	}
}
}
