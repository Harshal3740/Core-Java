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

			for(int i=1;i<=n*2;i++){

				if (i<=5){

					for (int j=1;j<=i;j++){
						System.out.print(n-j+1);
					}
					System.out.println();					
				}
				else{

					for (int j=i;j<n*2;j++){
						System.out.print(i-j+n);
					}
					System.out.println();
				}
			}

		}}