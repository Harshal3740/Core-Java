/*
A
bA
CbA
dCbA
EdCbA
dCbA
CbA
bA
A
*/
			class test13{
		public static void main(String[] args) {
			int n =5;


		for (int i=1;i<=n;i++) {
			for (int j=i;j>=1 ;j--) {

				if (j%2 != 0) {
					System.out.print((char)(64+j));
				}
				else{
					System.out.print((char)(96+j));
				}
				
			}	
			System.out.println();
		}

		for (int i =4;i>=1 ;i-- ) {
			for (int j =i;j>=1 ;j--) {
		
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
