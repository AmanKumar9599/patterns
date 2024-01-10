package pattern.number_pattern;

public class triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=1;
		
		while(row<=n) {
			int j=1;
			int i=1;
			while(i<=star) {
				System.out.print(j);
				i++;
				j++;
			}
			
			row++;
			star++;
			System.out.println();
		}
	}

}
