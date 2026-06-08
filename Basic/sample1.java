	class Sample1{
public static void main(String[] args)
{
	int n = 5;
	int cnt1 = 5;
	int cnt2 = n*(n+1)/2;
	for(int i=n;i>=1;i--){

			for(int sp =1; sp<i;sp++){
				System.out.print("\t");
			}
			int c1 =cnt1;
			int c2 =cnt2;
	
			for (int j1 =i,j2=i; j1<=n ;j1++,j2++){
			System.out.print((char)(c1+64));
			System.out.print((char)(c2+64)+"\t");
			c1 = c1-j1-1;
			c2 = c2+j2;
		}
		cnt1= cnt1+i-1;
		cnt2= cnt2-i;
		System.out.println();
	}	
}
}