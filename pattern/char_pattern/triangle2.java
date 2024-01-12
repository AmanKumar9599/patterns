package pattern.char_pattern;

public class triangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=1;
		int space=n-1;
		char ch=65;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			
			while(j<=star) {
				System.out.print(ch+" ");
				j++;
				if(j<row) {
					ch--;
				}
				else
				ch++;
				if(row==j) {
				ch=65;
				}
			
			}
		
		row++;
		star+=2;
		space--;
		System.out.println();
		}
	}

}
