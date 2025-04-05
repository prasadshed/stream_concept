package Stream_pra;

public class PatternPrinting {

	public static void main(String[] args) {
//rectangle pattern printing
		int n = 4;
		int m = 5;
		for (int j = 0; j < n; j++) {
			for (int i = 1; i <= m; i++) {
				System.out.print("*");

			}
			System.out.println();

		}
		///hollow rectangle
		for (int j = 1; j <= n; j++) {
			for (int i = 1; i <= m; i++) {
				if (i == 1 || j == 1 || i == m || j == n) {
					System.out.print("*");
				} else {

					System.out.print(" ");
				}
			}
			System.out.println();
		}
		///half pyramid
		for (int j = 1; j <= n; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		///inverted pyramid
				for (int j = n; j >= 1; j--) {
					for (int i = 1; i <= j; i++) {
						System.out.print("*");
					}
					System.out.println();
				}
				for (int i = 1; i <= n; i++) {
					for (int j = 1; j <= n-i; j++) {
						System.out.print(" ");
					}
					for (int j = 1; j <=i ; j++) {
						System.out.print("*");
					}
					System.out.println();
					
				}
		
		

	}
}
