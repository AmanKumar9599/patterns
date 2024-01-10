package pattern.char_pattern;

public class square1 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int star=n;
		char ch=65;
		while(row<=n) {
			
			int i=1;
			while(i<=star) {
				System.out.print(ch+" ");
				i++;
				
			}
		
		row++;
		ch++;
		System.out.println();
	}
	}

}
