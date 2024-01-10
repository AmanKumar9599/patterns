package pattern.char_pattern;

public class square2 {

	public static void main(String[] args) {
		int n=5;
		int row=1;
		int star=n;
		
		while(row<=n) {
			char ch=65;
			int i=1;
			while(i<=star) {
				System.out.print(ch+" ");
				i++;
				ch++;
			}
		
		row++;
		
		System.out.println();
	}
	}

}
