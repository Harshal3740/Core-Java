import java.util.*;

class Program14{
	
	public static void InputData(int arr[],Scanner scanner){
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter array Element");
			 arr[i] = scanner.nextInt();			
		}
	}	

	public static void DisplayData(int arr[]){
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void MaxElement(int arr[]){
		int temp=0;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]>temp){
				temp=arr[i];
			}
		}
			System.out.println("Maximum Element of an array is : "+temp);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Size of an Array");
		int size = scanner.nextInt();

		int arr[] = new int[size];

		System.out.println("Array Input Method : ");
		InputData(arr,scanner);
		System.out.println("Array Display Data Method : ");
		DisplayData(arr);
		System.out.println("Maximum Element : ");
		MaxElement(arr);


}}