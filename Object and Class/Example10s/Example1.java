// Student Example1

		class Student{	
			String name;
			int RollNo;
			char cls;  //A B C D 

			public char student(){
				return cls;

			}
}
		class Example1{
		public static void main(String[] args) {
	
		Student student = new Student();

		student.name = "Harshal";
		student.RollNo = 1;
		student.cls = 'A';

		System.out.println("Name = "+student.name);
		System.out.println("RollNo = "+student.RollNo);
		System.out.println("Class = "+student.cls);
		

		System.out.println("Student in Class "+student.student());




}}