
	class Test{
	public static void main(String[]args){
	int a=5,b=2,c=2;
	int answer = ++a + b++ - c-- + a*b - --a - c + ++b;
	System.out.print(answer);
	}
}