/*
Array Case 4: Sum of Odd Elements
 
From a given array, calculate the sum of all odd elements only.
 
Example Input:
Array = [11, 22, 33, 44, 55]
 
Expected Output:
Odd elements = 11, 33, 55
Sum = 99

*/
import java.util.*;
	class Case4{
		static void inputarray(int arr[],Scanner scanner){
				for(int i=0;i<arr.length;i++){
					System.out.println("Enter the Elements");
					arr[i] = scanner.nextInt();
				}
			}
				static void sumavgdisplay(int arr[]){
					int sum=0;
					for(int i=0;i<arr.length;i++){
						if (arr[i]%2 != 0) {
						 sum = sum + arr[i];
						}
					// double average = sum/arr.length;
					}
					System.out.print(sum);
					System.out.println();
				}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Array SiZe");
			int size = scanner.nextInt();

			int arr[] = new int[size];

				inputarray(arr,scanner);
				System.out.println("Average an Array");
				sumavgdisplay(arr);
		}
	}