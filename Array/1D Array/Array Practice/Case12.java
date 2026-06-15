/*
Array Case 12: Shift Last to First (Without Third Variable)
 
Write a program to move the last element of the array to the first position (shift right by one) without using a third variable.
 
Example Input:
Array = [10, 20, 30, 40, 50]
 
Expected Output:
Before Shift: [10, 20, 30, 40, 50]
After Shift:  [50, 10, 20, 30, 40]
 

*/
import java.util.*;

	class Case12{
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
			for(int i=arr.length-1;i>0;i--){
	
			arr[i] = arr[i] + arr[i-1];
            arr[i-1] = arr[i] - arr[i-1];
            arr[i] = arr[i] - arr[i-1];
			}
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