		

		class Example9{

			String BikeName;
			String BrandName;
			int MaxSpeed;
			int avg;

			public int getavg(){
				return avg;
			}
			public void displayData(){

				System.out.println("Bike Name = "+BikeName);
				System.out.println("Brand Name ="+BrandName);
				System.out.println("Max Speed ="+MaxSpeed);
				System.out.println(" Bike Average ="+avg);

			}

			public static void main(String[] args) {
	
			Example9 bike = new Example9();

			bike.BikeName = "Hunter";
			bike.BrandName= "Royal Enfield";
			bike.MaxSpeed = 120;
			bike.avg = 50;


			bike.displayData();
			System.out.println();
			bike.getavg();

}}