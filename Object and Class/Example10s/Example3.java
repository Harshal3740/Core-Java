

	class Book{
		String name;
		String writer;
		int price;

		public int BookEx(){
			return price;
		}

	}
			class Example3{
		public static void main(String[] args) {
		
		Book book = new Book();


		book.name = "COMMIC_BOOK";
		book.writer = "Harshal Patil";
		book.price = 200;

		System.out.println(" Book Name is "+book.name);
		System.out.println(" Book Price is "+book.price);
		System.out.println(" Book Writer is "+book.writer);

		System.out.println(" BOOK PRICE IS " +book.BookEx());
}}