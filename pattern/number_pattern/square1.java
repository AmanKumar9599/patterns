package pattern.number_pattern;

public class square1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=n;
		
		while(row<=n) {
			int j=1;
			int i=1;
			while(i<=star) {
				System.out.print(j+" ");
				i++;
				j++;
			}
		
		row++;
//		j++;
		System.out.println();
	}

}
}
