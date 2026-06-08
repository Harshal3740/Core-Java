/*
Array Case 14: Maximum Element
 
Write a program to find the maximum element in an array.
 
Example Input:
Array = [12, 45, 67, 23, 89, 34]
 
Expected Output:
Maximum Element = 89
*/
import java.util.*;

class Case14{
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

		public static void MaxArrayEle(int arr[]){
			int max=arr[0];
			for(int i=0;i<arr.length;i++){
				if (arr[i]>max){
					max = arr[i];
				}
			}	
				System.out.println("MAX : "+max);
		}
		

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Array Size");
	int size = scanner.nextInt();

	int arr[] = new int[size];

	inputArray(arr,scanner);

	printArray(arr);

	MaxArrayEle(arr);

	printArray(arr);
	}
}