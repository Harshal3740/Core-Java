// write a program to print factorial number using function
import java.util.*;

	class factnum{
		public static void printfact(int num){
		
			int fact=1;
		for(int i=1;i<=num;i++){
			fact = fact * i;
			}		
			System.out.println("Factorial of the Number is "+fact);
		}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = scanner.nextInt();

		 printfact(num);


}} 