
	class PrintofDigit{
	public static void main(String[] args) {
	
		int num=1234;
		int unitplace=num%10;
		num = num/10;
		int tenplace=num%10;
		num = num/10;
		int hundredplace=num%10;
		num = num/10;
		int thplace=num%10;

		System.out.println(unitplace);
		System.out.println(tenplace);
		System.out.println(hundredplace);
		System.out.println(thplace);



}}