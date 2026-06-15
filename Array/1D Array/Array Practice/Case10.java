/*
 Array Case 10: Swap First and Last Element (Without Third Variable)
 Write a program to swap the first element and the last element of an array without using a third (temporary) variable.
 Example Input:
Array = [7, 14, 21, 28, 35]
 Expected Output:
Before Swap: [7, 14, 21, 28, 35]
After Swap:  [35, 14, 21, 28, 7]

*/
import java.util.*;

	class Case10{
		public static void inputArray(int arr[],Scanner scanner){
			for(int i=0;i<arr.length;i++){
			System.out.println("Enter Element : ");
				arr[i] = scanner.nextInt();		
			}
		}

		public static void printArray(int arr[]){
			System.out.println("Display Array");
			for (int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+"  ");
			}
			System.out.println();
		}

		public static void shifttolast(int arr[]){
			
			arr[0]= arr[0] ^ arr[arr.length-1];  // 1 + 5 = 6
			arr[arr.length-1]= arr[0] ^ arr[arr.length-1]; // 6 - 5 = 1 
			arr[0]= arr[0] ^ arr[arr.length-1];	// 6 - 1 = 5 
			
			}

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Array Size");
	int size = scanner.nextInt();

	int arr[] = new int[size];

	inputArray(arr,scanner);

	printArray(arr);

	shifttolast(arr);

	printArray(arr);
}}