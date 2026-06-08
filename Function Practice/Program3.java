import java.util.*;

class Program3{
	
	public static void inputArray(int arr[],Scanner scanner){
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter Array Element");
			 arr[i] = scanner.nextInt();
		}
		System.out.println();
	}

	public static void displayArray(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void AverageofNum(int arr[]){
			double avg;
			double sum = 0;
		for(int i=0;i<arr.length;i++){
			 sum = sum + arr[i];
		}
		    avg =sum/arr.length;
		System.out.println("Sum of the array "+sum);
		System.out.println("Average of the array all element "+avg);
		}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of the Array");
		int size = scanner.nextInt();

		int arr[] = new int[size];

		inputArray(arr,scanner);
		System.out.println("Display Aarry");
		displayArray(arr);
		System.out.println("Average of the Array");
		AverageofNum(arr);

	}
}
