package pattern.star_pattern;

public class starPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int row=1;
		int star=n;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				if(row==n/2+1 || i==n/2+1) {
				System.out.print("* ");}
				else {
					System.out.print("  ");
				}
				i++;
			}
			row++;
			System.out.println();
		}

	}

}
