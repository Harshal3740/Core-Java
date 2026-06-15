/*
Array Case 8: Shift Last Element to First
WAP to shift last element to first from array.
 Example Input:
input: {10,20,30,40,50}
Output:{50,10,20,30,40}
*/
import java.util.*;

	class Case8{
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
			int temp=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--){
				arr[i]=arr[i-1];
			}
			arr[0] = temp;
		}
/*		
			public static int[] shifttolast1(int arr[]){
			int temp=arr[arr.length-1];
			for(int i=arr.length-1;i>0;i--){
				arr[i]=arr[i-1];
			}
			arr[0] = temp;
			return arr;
		}	
*/
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = scanner.nextInt();

		int arr[] = new int[size];

		System.out.println("Input Array using function : ");
		inputArray(arr,scanner);	

		System.out.println("Print Array using Function : ");
		printArray(arr);

		System.out.println("shifting Array using function : ");
		shifttolast(arr);

		printArray(arr);

		// System.out.println("shifting array using function");
		// shifttolast1(arr);
		// printArray(arr);

}}