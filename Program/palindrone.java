//   Write a Java program to enter any number and print its reverse.
import java.util.*;

class Palindrone{
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the Number");
	int num = scanner.nextInt();
	int temp=num;
	int sum =0;


	while (num != 0)
	{
		  int rem = num%10;
		 sum = sum*10 +rem ;
		 num = num/10;
	}

	System.out.println(sum);
	if (temp == sum ) 
		System.out.println("It is a palindrone Number ");
	else
		System.out.println("It is not a palindrone Number");
	



}}