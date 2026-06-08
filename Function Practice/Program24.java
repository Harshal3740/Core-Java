import java.util.*;

class Program24{
	
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
			Double count =0.0;
			Double final1 = 0.0;
			while(num>9){
			int sum = num%10;	
				num = num/10;
				count++;
			final1 = sum + final1;	
		}
			count++;
			final1 = num + final1;
			Double avg = final1/count;	
			System.out.println("Array : "+arr[i]);
	        System.out.println("Addition of the Numbers : "+ final1);
			System.out.println("Average of the Number : "+avg);

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