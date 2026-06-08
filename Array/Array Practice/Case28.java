/*
Array Case 28: Case Study (Divisible by 4 and/or 5)

WAP to solve following case study
consider black number, which is divisible by 4.
consider white number, which is divisible by 5.
consider grey number, which is both black & white
replace black number with -1.
replace white number with -2.
replace grey number with -3. 
Example Input:
input: {10,14,24,12,18,26,20,23,22,15,26}

Expected Output:
output:{-2,14,-1,-1,18,26,-3,23,22,-2,26}
*/
import java.util.*;
class Case28{
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

		public static void Caseelement(int arr[]) {
			for (int i=0;i<arr.length;i++){
				if(arr[i]%5 == 0 &&  arr[i]%4 == 0)
					arr[i] = -3;
					// break;
					// continue;

				if(arr[i]%5 == 0)
					arr[i] = -2;

				if(arr[i]%4 == 0)
					arr[i] = -1;

			
				}
 			}
 	/*		if(arr[i]%5 == 0 &&  arr[i]%4 == 0)
					arr[i] = -3;

				else if(arr[i]%4 == 0)
					arr[i] = -1;

				else if(arr[i]%5 == 0)
					arr[i] = -2;
			
				}
	*/


	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter Array Size");
	int size = scanner.nextInt();

	int arr[] = new int[size];

	inputArray(arr,scanner);

	printArray(arr);

	Caseelement(arr);

	printArray(arr);
	}
} 
