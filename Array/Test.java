import java.util.*;

	class Test{
		public static void display(int A[]){
			for(int i=0;i<A.length;i++){
				System.out.printf("i : %d A:[%d] =%d \n",i,i,A[i]);

				A[i] = A[i]*10;
			}
		}
			public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				int size;

				System.out.println("Enter Size of an Array");
				size = scanner.nextInt();

				// Validation Check 
			if(size <= 0){
				System.out.println("Always Enter Positive");
				System.exit(-1);
			}
				int arr[]=new int[size];

			for(int i=0;i<arr.length;i++){

				System.out.println("Enter Element");	
				arr[i] = scanner.nextInt();
			}

			// Priting Array
			for(int i=0;i<arr.length;i++){
				System.out.println(" "+i+" "+arr[i]);

				System.out.println("---------------------");
			}

			// Array is a type int 
				display(arr);

			for(int i=0;i<arr.length;i++){
			System.out.println(" "+i+" "+arr[i]);					
			}

		}}


