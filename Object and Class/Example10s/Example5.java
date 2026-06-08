
	class TV{
		String CompanyName;
		String ShopName;
		int Inches;
		int price; 


	 	int TVDATA(){
	 	return price;
	}

		 void DisplayData(){
			System.out.println("CompanyName = "+CompanyName);
			System.out.println("ShopName = "+ShopName);
			System.out.println("Inches = "+Inches);
			System.out.println("Price = "+price);
		}

	}


		class Example5{
	public static void main(String[] args) {
	
		TV course = new TV();
		course.CompanyName = "XYZ";
		course.ShopName = "Gada Electronic";
		course.Inches = 40;
		course.price = 2000;

		course.DisplayData();
		





}}