package pattern.char_pattern;

public class starBridge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=5;
		int i=1;
		char ch=65;
		while(i<=2*n-1) {
			System.out.print(ch+" ");
			i++;
			ch++;
		}
		System.out.println();
		int row=1;
		int star=n-1;
		int space=1;
		while(row<=n) {
			int j=1;
			char c=65;
			while(j<=star) {
				System.out.print(c+" ");
				j++;
				c++;
			}
			int k=1;
			while(k<=space) {
				System.out.print("  ");
				k++;
				c++;
			}int l=1;
			while(l<=star) {
				System.out.print(c+" ");
				l++;
				c++;
			}
			star--;
			space+=2;
			row++;
			System.out.println();
		}
	}

}
