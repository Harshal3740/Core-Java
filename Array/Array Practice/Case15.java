/*
Array Case 15: Second Maximum Element
 
Write a program to find the second largest element in an array.
 
Example Input:
Array = [15, 72, 48, 96, 33, 81]
*/
import java.util.*;
class Case15{
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

		public static void MaxArrayEle(int arr[]) {

 			   int max = arr[0];
    			int secmax = Integer.MIN_VALUE;

		    for(int i=0;i<arr.length;i++) {

        	if(arr[i] > max) {

            secmax = max;
            max = arr[i];

        }
        else if(arr[i] > secmax && arr[i] != max) {

            secmax = arr[i];

        }
    }

    System.out.println("MAX : " + max);
    System.out.println("Second MAX : " + secmax);
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