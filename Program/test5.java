//  5) Write a Java program to print all odd numbers between 1 to 100.
	

	class test5{
public static void main(String[] args) {
	int start = 1;
	int end = 100;

	while(start <= end ){

		if (start%2 != 0) {
			System.out.println(start);
		}
			start++;			
	}
		
}
}