// // write a program to print of Multipication of two number using function 

import java.util.*;

	class Multiofnum{
		static int Multitwono(int a,int b){
			return a*b;
		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Numbers ");
			int x  = scanner.nextInt();
			int y  = scanner.nextInt(); 
		int multi = Multitwono(x,y);

		System.out.println("Multiplication of two Number is "+multi);
}
}