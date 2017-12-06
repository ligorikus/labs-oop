package lab3;

public class Lecturer extends User 
{
	@Override
	public void getBook(int id) {
		Book book = Library.remove(id);
		this.books.add(book);
	}

	@Override
	public void returnBook() {
		
	}
	
	/*ѕрепод принес в библиотеку новую книгу*/
	public void createBook(Book book)
	{
		Library.add(book);
	}

}
