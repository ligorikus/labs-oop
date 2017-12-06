package lab3;

import java.util.ArrayList;

public abstract class User {
	
	protected static ArrayList<Book> books = new ArrayList<Book>();
	
	public abstract void getBook(int id);
	public abstract void returnBook();
}
