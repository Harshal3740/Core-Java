/*
Find the average value of all elements in an array.
Example Input:
 Array = [2, 4, 6, 8, 10]

Expected Output:
Average = 6.0
*/
import java.util.*;

	class Case3{

		 static void inputarray(int arr[],Scanner scanner){
				for(int i=0;i<arr.length;i++){
					System.out.println("Enter the Elements");
					arr[i] = scanner.nextInt();
				}
			}
				 void avgdisplay(int arr[]){
					int sum=0;
					for(int i=0;i<arr.length;i++){
						 sum = sum + arr[i];
					}
					double average = sum/arr.length;
						System.out.print(average);
					System.out.println();
				}

		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Array SiZe");
		int size = scanner.nextInt();

			int arr[] = new int[size];

			inputarray(arr,scanner);
			System.out.println("Average an Array");
			avgdisplay(arr);
}}



