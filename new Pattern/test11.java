/*
A
bb
CCC
dddd
EEEEE
dddd
CCC
bb
A
*/

		class test11{
	public static void main(String[] args) {
		
			int n =5;
		for (int i=1;i<=n;i++) {
			for (int j=1;j<=i;j++) {
	
				if (i%2 != 0){
					System.out.print((char)(64+i));			
				}
				else{
					System.out.print((char)(96+i));
				}
			}
			System.out.println();	
		}
				for (int i=4;i>=1;i--) {
					for (int j=i;j>=1;j-- ) {
					
				if (i%2 != 0){
					System.out.print((char)(64+i));			
				}
				else{
					System.out.print((char)(96+i));
				}
			}
			System.out.println();	
		}
	}
}