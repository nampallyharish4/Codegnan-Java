
public class DaimondPattern {

	public static void main(String[] args) {
		int rows=5;
		//Part 1(Upper part)
		for (int i=1;i<=rows;i++) {
			//Inner Loop 
			for (int j=1;j<=rows-i;j++) {
				System.out.print("  ");
			}
			for (int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//lower part
		for (int i=rows-1;i>=1;i--) {
			for (int j=1;j<=rows-i;j++) {
				System.out.print("  ");
			}
			for (int k=1;k<=2*i-1;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
