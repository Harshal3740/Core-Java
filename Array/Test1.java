import java.util.*;

	class Test1{
		public static void Display(int A[]){
			for(int i=0;i<A.length;i++){
				int sum =0;
				sum = A[i]+sum;
				System.out.println(sum);
				System.out.printf(" i : %d  A : [%d] = %d \n",i,i,sum);
				
			}

		}
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Size of an Array");
			int size =scanner.nextInt();

			if(size<0){
				System.out.println("Please Enter Positive Number");
				System.exit(-1);
			}
				int arr[] = new int[size];

				for (int i=0;i<arr.length;i++ ) {
					System.out.println("Enter Array Element");
					arr[i]=scanner.nextInt();
				}

				for (int i=0;i<arr.length;i++){
					System.out.println(i+ "\t\t"+arr[i]);
					
					System.out.println("------------------------");
				}
				Display(arr);
		}}