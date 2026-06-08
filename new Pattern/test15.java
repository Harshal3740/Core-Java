/*

E
dE
CdE
bCdE
AbCdE
bCdE
CdE
dE
E

*/


	class test15 {
	public static void main(String[] args) {
	int n=5;

		for (int i=5;i>=1;i--) {
			for (int j=i;j<=n;j++) {
				if (j%2 != 0) {
					System.out.print((char)(64+j));
				}
				else{
					System.out.print((char)(96+j));
				}			
		}	
		System.out.println();
	}

		for (int i=2;i<=5;i++) {	
			for (int j=i;j<=n;j++) {
				
				if (j%2 != 0) {
					System.out.print((char)(64+j));
				}
				else{
					System.out.print((char)(96+j));
				}
		}
		System.out.println();
	}

}}