package apple;


	public class BookDemo {

		public static void main(String[] args) {
			book a = new book();
			
			System.out.println(a.TITLE);
			System.out.println(a.AUTHOR);
			System.out.println(a.total_pages);
			System.out.println("Current page is: "+ a.open());
			System.out.println("Current page is: "+ a.open(31));
			a.close();
			a.turnleft();
			a.turnright();
			System.out.println(a.checkclosed());
			//kkkkk
			
			
		}
	}

