package pattern;

public class numCharTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int row=1;
		int star=1;
		
		while(row<=n) {
			int i=1;
			int j=1;
			char ch=65;
			while(i<=star) {
				if(row%2==0)
					System.out.print(ch+" ");
				else System.out.print(j+" ");
				i++;
				j++;
				ch++;
			}
			
			row++;
			star++;
			System.out.println();
		}
	}

}
