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
		class test8{
	public static void main(String[] args) {
			
				int n=5;
			for(int i=1;i<n*2;i++){
				if (i<=5){
			
				for (int j=1;j<=i;j++){
					if (i%2 == 0) {
						System.out.print((char)(96+i));
					}
					else{
						System.out.print((char)(64+i));
					}
				}
				System.out.println();
			}
				else{
					for(int j=n*2;j>i;j--){
						if (i%2 == 0){
						System.out.print((char)(96+2*n-i));		
					}
					else{
						System.out.print((char)(64+n*2-i));
					}
				}
				System.out.println("");		
			}
		}							
	}

}
