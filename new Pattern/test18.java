/*

*****
 ****
  ***
   **
    *	
   **
  ***
 ****
*****

*/		class test18{
	public static void main(String[] args) {

	int n=5;

		for (int i=1;i<=5;i++) {

			for(int sp=1;sp<=i;sp++) {
                    System.out.print(" ");
               }

				for(int j=5;j>=i;j--){
					System.out.print("*");
			}
		System.out.println();
	}
		
		for (int i=5;i>=1;i--) {

			for (int sp=i;sp>=1;sp--) {
				System.out.print(" ");
			}
			
			for(int j=i;j<=5;j++){
					System.out.print("*");
		}
		System.out.println();
	}

			
		


	
}}