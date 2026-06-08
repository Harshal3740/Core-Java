/*

E
Ed
EdC
EdCb
EdCbA
EdCb
EdC
Ed
E

*/


		class test14{
	public static void main(String[] args) {
		int n =5;


		for (int i=5;i>=1;i--) {
			for (int j=5;j>=i;j--) {
			
				if (j%2 != 0) {
					System.out.print((char)(64+j));
				}
				else{
					System.out.print((char)(96+j));
				}				
			}
			System.out.println();
		}

		for (int i=1;i<=5 ;i++) {
			for (int j=5;j>=i;j--) {
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