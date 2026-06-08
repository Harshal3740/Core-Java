import java.util.*;

class Program20{
	
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
			int digits = 1;
			while(num>9){
				num = num/10;
				digits++;
			}
		int power = (int)Math.pow(10,digits-1);
        int remaining = arr[i] % power;
        arr[i] = remaining * 10 + num;

				System.out.print(num+" ");
				System.out.println(arr[i]);

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
		System.out.println("Pair Print : ");
		FirstDigit(arr);

	}
}