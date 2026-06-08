import java.util.*;

class Program5{
	
	public static void InputData(int arr[],Scanner scanner){
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the Element : ");
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
		int num1=0,num2=0;
		for(int i=0;i<arr.length;i++){

		if(arr[i]%2 != 0){
			sumodd = sumodd + arr[i];
			num1++;
		}
		else{
			sumeven = sumeven +arr[i];
			num2++;
		}
	}
		System.out.println("Sum of Odd Element : "+sumodd);
		System.out.println("Sum of Even Element : "+sumeven);
		double avgodd = sumodd/num1;
		double avgeven = sumeven/num2;
		System.out.println("Average of Odd Number : "+avgodd);
		System.out.println("Average of Even Number : "+avgeven);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int size = scanner.nextInt();

		int arr[] = new int[size];

		System.out.println("INPUT VALUES : ");
		InputData(arr,scanner);
		System.out.println("DISPLAY DATA");
		DisplayData(arr);

		System.out.println("Display Sum of Odd and Even Element");
		OddElement(arr);
	}
}