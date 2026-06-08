import java.util.*;

class Program4{
	
	public static void InputData(int arr[],Scanner scanner){
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the Element ");
			arr[i] = scanner.nextInt();
		}
	}
	
	public static void DisplayData(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void OddElement(int arr[]){
		int sumodd = 0;
		int sumeven= 0;
		for(int i=0;i<arr.length;i++){

			if(arr[i]%2 != 0)
			sumodd = sumodd + arr[i];
			else
			sumeven = sumeven +arr[i];

		}
		System.out.println("Sum of Odd Element : "+sumodd);
		System.out.println("Sum of Even Element : "+sumeven);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int size = scanner.nextInt();

		int arr[] = new int[size];

		System.out.println("INPUT VALUES");
		InputData(arr,scanner);
		System.out.println("DISPLAY DATA");
		DisplayData(arr);

		System.out.println("Display Sum of Odd and Even Element");
		OddElement(arr);
	}
}