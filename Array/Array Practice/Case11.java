/*
Array Case 11: Shift First to Last (Without Third Variable)
 
Write a program to move the first element of the array to the last position (shift left by one) without using a third variable.
 
Example Input:
Array = [1, 2, 3, 4, 5]
 
Expected Output:
Before Shift: [1, 2, 3, 4, 5]
After Shift:  [2, 3, 4, 5, 1]
*/
import java.util.*;

	class Case11{
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
			for(int i=0;i<arr.length-1;i++){
	
			arr[i] = arr[i] + arr[i+1];
            arr[i+1] = arr[i] - arr[i+1];
            arr[i] = arr[i] - arr[i+1];
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