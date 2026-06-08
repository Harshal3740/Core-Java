// write a program to print additon of two number using function 

import java.util.*;

	class sumofnum{
	
		static int printnum(int a ,int b){
			int sum = a+b;
			return sum;
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the Numbers ");
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			int res= printnum(a,b);
			System.out.println(res);
		}

	}