package com.bl.oppsassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Book> book = new ArrayList<>();
		book.add(new Book("Leo","dinesh",12));
		book.add(new Book("Leo","dinesh",123));
		book.add(new Book("Leo","dinesh",123));
		for(Book books:book)
		{
			System.out.println(books.getTitle()+" "+books.getAuthor()+" "+books.getIsbn());
		}
		System.out.println("Enter isbn number to update their book details");
		int isbnumber=sc.nextInt();
		for(Book books:book)
		{
			if(books.getIsbn()==isbnumber)
			{
				System.out.println("Enter Title to update");
				String title1=sc.next();
				books.setTitle(title1);
				System.out.println("Enter Author to update");
				String author1=sc.next();
				books.setAuthor(author1);
			}
		}
		System.out.println("Updated book details");
		for(Book books:book)
		{
		
			System.out.println(books.getTitle()+" "+books.getAuthor()+" "+books.getIsbn());
		}
		sc.close();
		
	}

}
