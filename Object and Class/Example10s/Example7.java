// Hour Minute second


	class Time{
		int hour;
		int minute;
		int second;

		public int displayhour(){
			return hour;
			}

			public void displayData(){
				System.out.println("Hour is "+hour);
				System.out.println("Minute is "+minute);
				System.out.println("Second is "+second);
			}
	}

	class Example7{
		public static void main(String[] args) {

			Time time = new Time();

			time.hour = 2;
			time.minute=30;
			time.second=25; 

			time.displayData();

			time.displayhour();
			
		}}