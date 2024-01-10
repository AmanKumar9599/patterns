package pattern.number_pattern;

public class square2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=n;
		int j=1;
		while(row<=n) {
			
			int i=1;
			while(i<=star) {
				System.out.print(j+" ");
				i++;
				
			}
		
		row++;
		j++;
		System.out.println();
	}

}
}
