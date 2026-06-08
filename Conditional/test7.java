/*
5
45
345
2345
12345
2345
345
45
5

*/

	// logic 1
/*
		class test7{
	public static void main(String[] args) {
	
		int n=5;
		for (int i=1;i<=n*2;i++){

			if (i<=5){
				for (int j=1;j<=i;j++){
					System.out.print(n-i+j);
				}
				System.out.println();
			}
			else{

				for (int j=i;j<n*2;j++){
					System.out.print(j-n+1);
				}
				System.out.println();
			}
		}		
	}
}

*/

	logic 2 


class test7{
	public static void main(String[] args) {
	
		int n=5;
		for (int i=1;i<=n*2;i++){

			if (i<=5){
				for (int j=i;j>=1;j--){
					System.out.print(n-j+1);
				}
				System.out.println();
			}
			else{

				for (int j=i;j<n*2;j++){
					System.out.print(j-n+1);
				}
				System.out.println();
			}
		}		
	}
}

