/*
Array Case 13: Reverse Array (Without Third Variable)
Write a program to reverse all elements of an array without using a third variable.
Example Input:
Array = [5, 10, 15, 20, 25]
 
Expected Output:
Before Reverse: [5, 10, 15, 20, 25]
After Reverse:  [25, 20, 15, 10, 5]
*/
import java.util.*;
class Case13{
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
			int i=0,j=arr.length-1;
			while(i<j){
			
			arr[i]= arr[i] ^
			 arr[j];  // 1 + 5 = 6
			arr[j]= arr[i] ^ arr[j]; // 6 - 5 = 1 
			arr[i]= arr[i] ^ arr[j];	// 6 - 1 = 5 
            i++;
            j--;
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