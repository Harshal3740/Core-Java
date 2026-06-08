import java.util.*;

class Program1 {

    static void inputarray(int arr[], Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the Element");
            arr[i] = scanner.nextInt();
        }
    }

    static void displayarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void backwordArray(int arr[]){
    	for (int i=arr.length-1;i>=0 ;i--) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Array Size");
        int size = scanner.nextInt();

        if (size < 0 && size == 0) {
            System.out.println("Enter Vaild and Positive Number");
        }

        int arr[] = new int[size];

        inputarray(arr, scanner);
        displayarray(arr);
        backwordArray(arr);
    }
}


	/*

	import java.util.*;

	class Program1{
			 static void inputarray(int arr[],Scanner scanner){
				for(int i=0;i<arr.length;i++){
					System.out.println("Enter the Elements");
					arr[i] = scanner.nextInt();
				}
			}
				static void forworddisplay(int arr[]){
					for(int i=0;i<arr.length;i++){
						System.out.print(arr[i]+ " ");
					}
					System.out.println();
				}
			
				static void backworddisplay(int arr[]){
					for(int i=arr.length-1;i>=0;i--){
						System.out.print(arr[i]+" ");
					}
					System.out.println();		
				}		
	
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the size of an Array");
				int size = scanner.nextInt();

				int arr[] = new int[size];

				inputarray(arr,scanner);

				System.out.println("Forword Aarry : ");
				forworddisplay(arr);
				System.out.println("Backword Array : ");
				backworddisplay(arr);

		}
	}

	*/