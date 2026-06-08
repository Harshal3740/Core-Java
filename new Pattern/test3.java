/*
5
44
333
2222
11111
2222
333
44
5


*/

	class test3{
	public static void main(String[] args) {
	
		int n=5;
			for (int i=n;i>=1;i--) {
			for(int j =n;j>=i;j--){
			System.out.print(i);
			}	
			System.out.println();
		}
		for (int i=2;i<=5;i++) {
			for(int j=5;j>=i;j--){
			System.out.print(i);
			}	
			System.out.println();
		}
}}