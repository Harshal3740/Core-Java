//  Write a Java program to print all alphabets from a to z. - using while loop

	class Example2{
		public static void printword(){
			int i=1;
			while(i<=26){
			System.out.print((char)(96+i)+" ");
			i++;
			}
		}

		public static void main(String[] args) {
				printword();

		}}