import java.util.*;

class Program16{
	
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

	public static void PairSum(int arr[]){
			int sum=0,target=20;
		
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length ;j++ ) {
				sum = arr[i]+arr[j];
		
				if (sum == target) {
					System.out.println("Pair : "+arr[i]+" "+arr[j]);
				}	
			}			
		}
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
		PairSum(arr);

	}
}