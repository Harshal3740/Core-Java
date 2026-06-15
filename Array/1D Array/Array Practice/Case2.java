/*
Array Case 2: Sum of Array Elements
Find the sum of all elements in an array.
Example Input:
Array = [5, 8, 12, 6]
Expected Output:
Sum = 31
 
*/
import java.util.*;

	class Case2{

		 static void inputarray(int arr[],Scanner scanner){
				for(int i=0;i<arr.length;i++){
					System.out.println("Enter the Elements");
					arr[i] = scanner.nextInt();
				}
			}
				static void sumdisplay(int arr[]){
					int sum=0;
					for(int i=0;i<arr.length;i++){
						 sum = sum + arr[i];
					}
						System.out.print(sum);
					System.out.println();
				}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Element Length");
			int size = scanner.nextInt();
			int arr[] = new int[size];


			inputarray(arr,scanner);
			System.out.println("Sum of Array");
			sumdisplay(arr);
}}