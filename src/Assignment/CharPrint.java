package Assignment;

public class CharPrint {

	public static void main(String[] args) {
		char ch1='A';
		char ch2='a';
		
		System.out.print("Line 1 - ");
		
		for (char i=ch1;i<='Z';i++) {
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		System.out.print("Line 2 - ");
		
		for (char i=ch2;i<='z';i++) {
			System.out.print(i+" ");
		}
	}
}
