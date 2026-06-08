// Write a Java program to print all odd numbers between 1 to 100.



	class Example4{

		public static void printodd(){
			int i=1;
			while(i<=100){
				if (i%2 != 0)
					System.out.println(i);
				i++;
			}
		} 
	public static void main(String[] args) {
		printodd();

	}}