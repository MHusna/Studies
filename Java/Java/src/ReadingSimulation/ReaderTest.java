package ReadingSimulation;

public class ReaderTest {

	public static void main(String[] args) {
		
		//Authors created.
		Author jkRowling = new Author();
		jkRowling.setName("J.K Rowling");
		
		Author orhanPamuk = new Author();
		orhanPamuk.setName("Orhan Pamuk");
		
		//Books created.
		Book harryPotter5 = new Book();
		harryPotter5.setAuthor(jkRowling);
		harryPotter5.setCurrentPage(0);
		harryPotter5.setHardCover(true);
		harryPotter5.setPage(975);
		harryPotter5.setTitle("Harry Potter And The Order Of The Phoenix");
		harryPotter5.setType("Fantastic");
		
		Book darkBook = new Book();
		darkBook.setAuthor(orhanPamuk);
		darkBook.setCurrentPage(200);
		darkBook.setHardCover(false);
		darkBook.setPage(500);
		darkBook.setTitle("Dark Book");
		darkBook.setType("Novel");
		
		//Reader created.
		Reader jason = new Reader();
		jason.setAge(22);
		jason.setGender('m');
		jason.setName("Jason Burdet");
		jason.read(harryPotter5);
		
		
	}

}
