// Write a Java program to print a multiplication table of any number.
import java.util.*;

	class Example8{
		public static void printtable(int n){

			int i=1;
			while(i<=10){
				System.out.println(n+" x "+i+" = "+n*i);
				i++;
				}
		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = scanner.nextInt();

		printtable(n);
	}}