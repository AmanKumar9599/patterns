package pattern.number_pattern;
// Not Generalized
public class numberSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int row=1;
		int star=2*n-1;
		while(row<=2*n-1) {
			int i=1;
			while(i<=star) {
				if(i==1 || row==1 ||i==2*n-1 || row==2*n-1)
					System.out.print(n+" ");
				else if(i==2 || row==2 ||i==2*n-2 || row==2*n-2)
					System.out.print(n-1+" ");
				else if(i==3 || row==3 ||i==2*n-3 || row==2*n-3)
					System.out.print(n-2+" ");
				else System.out.print(n-3+" ");
				i++;
			}
			row++;
			System.out.println();
		}
	}

}
