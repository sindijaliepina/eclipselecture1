public class Book {
	private String author;
	private int pages;
	private String title;
	private Book book;

	public Book(String author, int pages, String title) {
		this.author = author;
		this.pages = pages;
		this.title = title;
		System.out.println(toString());
	}

	public String toString() {
		return "author:" + getAuthor() + " pages:" + getPages() + " title:" + getTitle();
	}

	public Book() {
		this("Dale Carnegie", 237, "How to influcene people?");
	}



	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	public static void main(String[] args) {
		new Book();
		new Book("Smith", 23, "Hello");
	}
}
