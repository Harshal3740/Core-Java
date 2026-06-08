import java.util.*;

class Program23{
	
	public static void InputData(int arr[],Scanner scanner){
		for (int i=0;i<arr.length;i++) {
			System.out.println("Enter Array Element : ");
			arr[i] = scanner.nextInt();
		}
	}

	public static void DisplayData(int arr[]){
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void FirstDigit(int arr[]){
		
		for (int i=0;i<arr.length;i++) {
			int num = arr[i];
			int final1 = 0;
			while(num>9){
			int sum = num%10;	
				num = num/10;
			final1 = sum + final1;	
		}
		
			final1 = num + final1;
			System.out.println("Array : "+arr[i]);
	        System.out.println("Addition of the Numbers : "+ final1);
			

		}	
		System.out.println();
		
	}	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Array of the Size");
		int size = scanner.nextInt();

		int arr[] = new int[size];

		System.out.println("Input Array : ");
		InputData(arr,scanner);
		System.out.println("Display Data : ");
		DisplayData(arr);
		
		FirstDigit(arr);

	}
}