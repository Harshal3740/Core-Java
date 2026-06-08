import java.util.*;

class Program2{
	
	public static void inputArray(int arr[],Scanner scanner){
		for (int i=0;i<arr.length;i++){
		System.out.println("Enter Array Element");
			arr[i] =scanner.nextInt();

		}
	}

	public static void displayArray(int arr[]){
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void Sumofele(int arr[]){
		int sum =0;
		for(int i=0;i<arr.length;i++){
			sum = arr[i]+ sum;
				
		}
		System.out.println(sum);
	} 



	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the array of size");
		int size = scanner.nextInt();

		int arr[] = new int[size];

		inputArray(arr,scanner);
		System.out.println("Array Display : ");
		displayArray(arr);
		System.out.println("Sum of Array ");
		Sumofele(arr);


}}