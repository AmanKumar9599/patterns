package pattern.star_pattern;

public class starBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int i=1;
		while(i<=2*n-1) {
			System.out.print("* ");
			i++;
		}
		System.out.println();
		int row=1;
		int star=n-1;
		int space=1;
		while(row<=n) {
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			int k=1;
			while(k<=space) {
				System.out.print("  ");
				k++;
			}int l=1;
			while(l<=star) {
				System.out.print("* ");
				l++;
			}
			star--;
			space+=2;
			row++;
			System.out.println();
		}
	}

}
