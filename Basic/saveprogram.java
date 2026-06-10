class sample1{
public static void main(String[] args)
{
	int n=5;
	for(int i=1;i<=n;i++){

	for (int j=n;j>=1;j--) {
		System.out.print((char)(102-j));
		}
	System.out.println();

	}	
	
	}
}


class sample1{
public static void main(String[] args)
{
	int n=5;
	for(int i=n;i>=1;i--){

	for (int j=1;j<=i;j++) {
		System.out.print(j);
		}
	System.out.println();

	}	
	
	}



	class sample1{
public static void main(String[] args)
{
	int n=5;
	for(int i=1;i<=n;i++){
		
		for(int space=1;space<=i; space++) {
			System.out.print(" ");

	}
		for (int j=n;j>=i;j--){
			System.out.print("*");
		}
		System.out.println();
	}	
}
}



}

/*
ABCDE
FGHI
JKL
MN
O

*/

class sample1{
public static void main(String[] args)
{
	int n=5;
	int cnt =65;
	for(int i=1;i<=n;i++){
		int c=cnt;
		for (int j=i;j<=5;j++){
			System.out.print((char)cnt+"\t");
			cnt =cnt+1;
		}
		// cnt = cnt-i-1;
		System.out.println();
	}	
}
}

/*
O       N       M       L       K
J       I       H       G
F       E       D
C       B
A


*/

class sample1{
public static void main(String[] args)
{
	int n=5;
	int cnt =79;
	for(int i=1;i<=n;i++){
		int c=cnt;
		for (int j=i;j<=5;j++){
			System.out.print((char)cnt+"\t");
			cnt--;
		}
		// cnt = cnt-i-1;
		System.out.println();
	}	
}
}

/*
AO      FM      JJ      MF      OA
BN      GK      KG      NB
CL      HH      LC
DI      ID
EE

*/

	class sample1{
public static void main(String[] args)
{
	int n = 5;
	int cnt1 = 1;
	int cnt2 = n*(n+1)/2;
	for(int i=1;i<=n;i++){
		for(int space=i;space<i; space++) 
				System.out.print("\t");
				
			int c1 =cnt1;
			int c2 =cnt2;
	
		for (int j1=n,j2=i;j2<=n;j1--,j2++){
			System.out.print((char)(c1+64));
			System.out.print((char)(c2+64)+"\t");
			c1 = c1+j1;
			c2 = c2-j2-1;
		}
		cnt1++;
		cnt2 = cnt2-i;
		System.out.println();
	}	
}
}

/*
AO      FM      JJ      MF      OA
        BN      GK      KG      NB
                CL      HH      LC
                        DI      ID
                                EE


*/

	class sample1{
public static void main(String[] args)
{
	int n = 5;
	int cnt1 = 1;
	int cnt2 = n*(n+1)/2;
	for(int i=1;i<=n;i++){
		for(int space=1;space<i; space++) 
				System.out.print("\t");
				
			int c1 =cnt1;
			int c2 =cnt2;
	
		for (int j1=n,j2=i;j2<=n;j1--,j2++){
			System.out.print((char)(c1+64));
			System.out.print((char)(c2+64)+"\t");
			c1 = c1+j1;
			c2 = c2-j2-1;
		}
		cnt1++;
		cnt2 = cnt2-i;
		System.out.println();
	}	
}
}

/*
OO      NJ      LF      IC      EA
MN      KI      HE      DB
KM      HH      DD
IL      EG
GK

*/

	class sample1{
public static void main(String[] args)
{
	int n = 5;
	int cnt1 = n*(n+1)/2;
	int cnt2 = cnt1;
	for(int i=1;i<=n;i++){
			int c1 =cnt1;
			int c2 =cnt2;
	
			for (int j1=i,j2=n;j1<=n;j1++,j2--){
			System.out.print((char)(c1+64));
			System.out.print((char)(c2+64)+"\t");
			c1 = c1-j1;
			c2 = c2-j2;
		}
		cnt1= cnt2-(i+1);
		cnt2--;
		System.out.println();
	}	
}
}


/*

								EO
                        IJ      DN
                LF      HI      CM
        NC      KE      GH      BL
OA      MB      JD      FG      AK

*/

	class sample1{
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
