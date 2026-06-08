// Write a Java program to calculate the product of digits of any number.


import java.util.*;

class pdtofvalue{
public static void main(String[] args) {
	int product=1,n;

	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Number");
	n = scanner.nextInt();

	while(n != 0){
		int rem =n%10;
		product = product * rem;
		n = n/10;

	}
	System.out.println("Product = "+product);

}}