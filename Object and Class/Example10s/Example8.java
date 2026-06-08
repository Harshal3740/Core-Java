// Hour Minute second


	class Time{
		int day;
		int month;
		int year;

		public int displayday(){
			return day;
			}

			public void displayData(){
				System.out.println("Day is "+day);
				System.out.println("Month is "+month);
				System.out.println("Year is "+year);
			}
	}

	class Example8{
		public static void main(String[] args) {

			Time time = new Time();

			time.day = 13;
			time.month=8;
			time.year=2004; 

			time.displayData();

			time.displayday();
			
		}}