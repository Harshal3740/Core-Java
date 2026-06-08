import java.util.*;


//  wrong code and final output is not Right 
class Program25{
	
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
			int reverse=1;
			while(num>9){
			int lastdight = num%10;	
				num = num/10;
				count++;
			final1 = lastdight + final1;	

			reverse = lastdight * 10;
			reverse = reverse + lastdight;

		}
			count++;
			final1 = num + final1;
			Double avg = final1/count;	
			System.out.println("Array : "+arr[i]);
	        System.out.println("Addition of the Numbers : "+ final1);
			System.out.println("Average of the Number : "+avg);
			System.out.println("Reverse of the Array : "+reverse);

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