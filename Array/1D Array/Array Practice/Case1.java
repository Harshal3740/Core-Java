import java.util.*;

/*
Array Case 1: Forward and Backward Display
Create an array of integers, store elements in it, and display the elements:
 -In forward order (from first to last)
 -In backward order (from last to first)
Example Input:
Array = [10, 20, 30, 40, 50]
Expected Output:
Forward: 10 20 30 40 50
Backward: 50 40 30 20 10
*/		
		class Case1{
			 static void inputarray(int arr[],Scanner scanner){
				for(int i=0;i<arr.length;i++){
					System.out.println("Enter the Elements");
					arr[i] = scanner.nextInt();
				}
			}
				static void forworddisplay(int arr[]){
					for(int i=0;i<arr.length;i++){
						System.out.print(arr[i]+ " ");
					}
					System.out.println();
				}
			
				static void backworddisplay(int arr[]){
					for(int i=arr.length-1;i>=0;i--){
						System.out.print(arr[i]+" ");
					}
					System.out.println();		
				}		
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the size of an Array");
				int size = scanner.nextInt();

				int arr[] = new int[size];

				inputarray(arr,scanner);

				System.out.println("Forword Aarry : ");
				forworddisplay(arr);
				System.out.println("Backword Array : ");
				backworddisplay(arr);

		}
	}