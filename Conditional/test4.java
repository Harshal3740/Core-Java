/*

1
21
321
4321
54321
4321
321
21
1

*/
		class test4{
	public static void main(String[] args) {

			int n=5;
		for (int i=1;i<n*2;i++){

			if (i<=5) {
				for(int j=i;j>=1;j--) {
					System.out.print(j);
				}
			System.out.println();		
			}
			else{
				for (int j=i;j<n*2;j++) {
					System.out.print(2*n-j);
				}
				System.out.println();
			}
		}
			
	}	
}