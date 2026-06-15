/*
Array Case 9: Swap First and Last Element
Write a program to swap the first element and the last element of an array.
 Example Input:
Array = [10, 20, 30, 40, 50]
Expected Output:
Before Swap: [10, 20, 30, 40, 50]
After Swap:  [50, 20, 30, 40, 10]
*/
import java.util.*;

	class Case9{
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
			int temp1=arr[0];
			int temp2=arr[arr.length-1];
			arr[arr.length-1]=temp1;
			arr[0]=temp2;
			}
			
			/*
			int temp1=arr[0];
			int temp2=arr[arr.length-1];
			arr[arr.length-1]=temp1;
			arr[0]=temp2;
			}
			
			}
			*/
	


	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Array Size");
	int size = scanner.nextInt();

	int arr[] = new int[size];

	inputArray(arr,scanner);

	System.out.println("Before Swap Array : ");
	printArray(arr);
	shifttolast(arr);
	System.out.println("After Swap Array : ");
	printArray(arr);



}}