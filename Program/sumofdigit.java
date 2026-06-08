//   Write a Java program to calculate the sum of digits of any number.

 import java.util.*;


	class sumofdigit{
	public static void main(String[] args) {
	int sum=0;
	int n; 
	int start=0;

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Number");
	n = scanner.nextInt();

	while(n != 0)
	{
		int temp = n%10;
		System.out.println(temp);
		sum =sum+temp;
		n= n/10;

	}
	System.out.println(sum);

}}