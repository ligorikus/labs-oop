package lab3;

import java.util.ArrayList;
import java.util.Collection;

public class Library {
	
	private static ArrayList<Book> books = new ArrayList<Book>();
	
	public static void add(Book book)
	{
		books.add(book);
	}
	
	public static void add(Collection<Book> list)
	{
		books.addAll(list);
	}
	
	public static Book remove(int id)
	{
		return books.remove(id);
	}
	
	public static void print()
	{
		for(Book book : books)
		{
			book.print();
		}
	}
}
