package collection;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {

		ArrayList<Book> list = new ArrayList<Book>();
		
		Book book1 = new Book(11, "개미");
		Book book2 = new Book(12, "거미");
		
		list.add(book1);
		list.add(book2);
		list.add(new Book(3, "엘라스틱서치"));

		for(Book book : list) {
			System.out.println(book);
		}
		
		System.out.println(list.toString());
		// 안에 있는 요소 모두 삭제
		// removeAll은 조건이 있음
		list.clear();
		System.out.println(list);
		
	}

}

class Book {
	int bookNo;
	String title;
	
	public Book(int bookNo, String title) {
		super();
		this.bookNo = bookNo;
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [bookNo=" + bookNo + ", title=" + title + "]";
		
	}

}
