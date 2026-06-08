		

		class Example10{

			String CarName;
			String BrandName;
			int MaxSpeed;
			int avg;

			public int getavg(){
				return avg;
			}
			public void displayData(){

				System.out.println("Car Name = "+CarName);
				System.out.println("Brand Name = "+BrandName);
				System.out.println("Max Speed = "+MaxSpeed);
				System.out.println("Bike Average = "+avg);

			}

			public static void main(String[] args) {
	
			Example10 car = new Example10();

			car.CarName = "Tata Punch";
			car.BrandName= "TATA";
			car.MaxSpeed = 150;
			car.avg = 40;


			car.displayData();
			System.out.println();
			car.getavg();

}}