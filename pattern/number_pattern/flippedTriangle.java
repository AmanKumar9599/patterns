package pattern.number_pattern;

public class flippedTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=1;
		int space=n-1;
		
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int k=1;
			while(j<=star) {
				System.out.print(k+" ");
				j++;
				k++;
			}
			row++;
			star++;
			space--;
			System.out.println();
		}
	}

}
