//  9) Write a Java program to count the number of digits in any number.

import java.util.*;

class test9{
public static void main(String[] args) {
	int num;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Number");
	num = scanner.nextInt();

	int temp= num;
	int cnt = 0;

	while(num > 0){
		num = num/10;
		cnt++;
	}
	System.out.println("Num = "+temp+" CountDigit = "+cnt);



}}