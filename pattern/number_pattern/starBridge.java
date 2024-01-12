package pattern.number_pattern;

public class starBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int i=1;
		int a=1;
		while(i<=2*n-1) {
			System.out.print(a+" ");
			i++;
			if(i<=n)
			a++;
			else a--;
		}
		System.out.println();
		int row=1;
		int star=n-1;
		int space=1;
		while(row<=n) {
			int j=1;
			int b=1;
			while(j<=star) {
				System.out.print(b+" ");
				b++;
				j++;
			}
			int k=1;
			while(k<=space) {
				System.out.print("  ");
				k++;
			}int l=1;
			b--;
			while(l<=star) {
				System.out.print(b+" ");
				
				b--;
				l++;
			}
			star--;
			space+=2;
			row++;
			System.out.println();
		}
	}

}
