package pattern.char_pattern;

public class spacetriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int l=n;
		int row=1;
		int star=2*n-1;
		int space=0;
		while(row<=n) {
			int j=1;
			while(j<=space) {
				
				System.out.print("  ");
				j++;
			}
			int i=1;
			while(i<=star) {
				if(i==1 || i==2*l-1)
				System.out.print("* ");
				else
					System.out.print("  ");
				i++;
				
			}
			l--;
			row++;
			space++;
			star-=2;
			System.out.println();
		}
	}

}
