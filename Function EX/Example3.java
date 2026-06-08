// Write a Java program to print all even numbers between 1 to 100. - using while loop

	class Example3{
		public static void printEven(){
			int i=1;
			while(i<=100){
				if(i%2 == 0)
					System.out.println(i);
			i++;
			}
		}
		public static void main(String[] args) {
			printEven();			
		}}