/*
Array Case 7: Shift First Element to Last
 
WAP to shift first element to last from array
 
Example Input:
input: {10,20,30,40,50}
output:{20,30,40,50,10}
 
*/
import java.util.Scanner;
class Case7{
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
			int temp=arr[0];
			for(int i=1;i<arr.length;i++){
				arr[i-1]=arr[i];
			}
			arr[arr.length-1] = temp;
			
		}
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = scanner.nextInt();

		int arr[] = new int[size];

		inputArray(arr,scanner);

		printArray(arr);
		shifttolast(arr);
		System.out.println("First to Last Array");
		printArray(arr);

}}