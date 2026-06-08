/*

1
12
123
1234
12345
1223
123
12
1

*/

		class test5{
	public static void main(String[] args) {

			int n=5;
		for (int i=1;i<=n*2;i++){

			if (i<=5){
				for(int j=1;j<=i;j++){
					System.out.print(j);
				}
				System.out.println();
			}
			else{

				for (int j=i;j<n*2;j++){
					System.out.print(j-i+1);
				}
				System.out.println();
			}
		
		}
	}
}


	
