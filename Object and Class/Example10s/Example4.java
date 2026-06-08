
	class Course{
		String CourseName;
		String InstitudeName;
		String Location;
		int price; 


	 	int Coursepc(){
	 	return price;
	}

		 void DisplayData(){
			System.out.println("CourseName = "+CourseName);
			System.out.println("InstitudeName = "+InstitudeName);
			System.out.println("Location = "+Location);
			System.out.println("Price = "+price);
		}

	}


		class Example4{
	public static void main(String[] args) {
	
		Course course = new Course();


		course.CourseName = "Java";
		course.InstitudeName = "Vibrant Minds";
		course.Location = "Pune";
		course.price = 50000;

		course.DisplayData();
		





}}