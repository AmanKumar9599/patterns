package pattern.star_pattern;

public class diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=1;
		int space=n-1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
				
			}
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			if(row<n) {
				star+=2;
				space--;
			}
			else {
				star-=2;
				space++;
			}
			row++;
			System.out.println();
		}
	}

}
