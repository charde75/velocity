package study_Github;

public class ReverseString1 {

	public static void main(String[] args) {
		String s= "Roshan";
		
		String r= "";
		
		
		
		for(int i=s.length()-1; i>=0; i--) {
			
			r = r+s.charAt(i);
			
		}
		
		System.out.println("Given String is "+s);
		
		System.out.println("Reverse String is "+r);

	}

	}


