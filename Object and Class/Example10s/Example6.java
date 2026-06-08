// Employee Data 

	class Example6{

		String EmpName;
		int EmpNO;
		Double Salary;

		public void displayData(){
			System.out.println("Employee Name = "+EmpName);
			System.out.println("Employee Number = "+EmpNO);
			System.out.println("Employee Salary = "+Salary);
		}

		public static void main(String[] args) {
	
		Example6 emp = new Example6();
			emp.EmpName = "Harshal Patil";
			emp.EmpNO = 1234;
			emp.Salary = 2000.00 ;

			emp.displayData();

	}}