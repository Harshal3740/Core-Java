/*
A
Ab
AbC
AbCd
AbCdE
AbCd
AbC
Ab
A
*/


		class test12{
	public static void main(String[] args) {
		

		int n =5;
	for (int i=1;i<=n;i++) {
		for (int j=1;j<=i;j++) {

				if (j%2 != 0){
					System.out.print((char)(64+j));			
				}
				else{
					System.out.print((char)(96+j));
				}
			}
			System.out.println();	
		}
				for (int i=4;i>=1;i--) {
					for (int j=1;j<=i;j++) {
					
				if (j%2 != 0){
					System.out.print((char)(64+j));			
				}
				else{
					System.out.print((char)(96+j));
				}
			}
			System.out.println();	
		}
		}}