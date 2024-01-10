package pattern.number_pattern;

public class binaryTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=1;
		int j=1;
		int k=0;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				if(row%2==0 && i%2==0 || row%2!=0 && i%2!=0) {
				System.out.print(j);}
				else System.out.print(k);
				i++;
			}
			star++;
			row++;
			System.out.println();
		}
	}

}
