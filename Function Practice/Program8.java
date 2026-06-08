import java.util.*;

class Program8{
	
	public static void InputData(int arr[],Scanner scanner){
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the Element : ");
			arr[i] = scanner.nextInt();

		}
	}

	public static void DisplayData(int arr[]){
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void 	ShiftElement(int arr[]){
			int temp=arr[arr.length-1];
		for (int i=arr.length-1;i>0;i--) {
			arr[i]=arr[i-1];
		}
			arr[0]=temp;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Array of the length");
		int size = scanner.nextInt();

		int arr[] = new int[size];

		InputData(arr,scanner);
		System.out.println("Display Data");
		DisplayData(arr);

		System.out.println("Shifting Element");
		System.out.println();
		ShiftElement(arr);
		System.out.println("Shifting Element Display");
		DisplayData(arr);


	}
}