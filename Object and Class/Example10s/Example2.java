// Example2 Pen

	class pen{

		String Color;
		String CompanyName;
		String PenType;
		int price;

		public int penExample(){
			return price;
		}

	}	
		class Example2{
	public static void main(String[] args) {
	
		pen penExample = new pen();

		penExample.Color ="Blue";
		penExample.CompanyName = "XYZ";
		penExample.price =50;

		System.out.println("Pen Color = "+penExample.Color);
		System.out.println("Pen Company Name = "+penExample.CompanyName);
		System.out.println("pen Price = "+penExample.price);

		System.out.println("Pen Price is "+penExample.penExample());


	}}