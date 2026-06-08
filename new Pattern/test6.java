/*

5
54
543
5432
54321
5432
543
54
5

*/


		class test6{
	public static void main(String[] args) {
	int n=5;


	for (int i=n;i>=1;i-- ) {
		for (int j=n;j>=i;j--) {
		System.out.print(j);
		}
	System.out.println();	
	}
	for (int i=2;i<=5;i++ ) {
		for (int j=5;j>=i;j--) {
			System.out.print(j);
		}
	System.out.println();	
	}
}}