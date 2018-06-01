package lab10;

public class Library {
		private String isbn;
		private String nameOfBook;
		private String author;
		private String publishingHouse;
		private String genre;
		private String dateOfPublication;
		
	public Library() {
		this.isbn = "none";
		this.nameOfBook = "none";		
		this.author = "none" ;
		this.publishingHouse = "none";
		this.genre = "none";
		this.dateOfPublication = "none";	
	}
		
	public Library(String isbn, String nameOfBook, String author, String publishingHouse, String genre, String dateOfPublication) {
		this.isbn = isbn;
		this.nameOfBook = nameOfBook;
		this.author = author;
		this.publishingHouse = publishingHouse;
		this.genre = genre;
		this.dateOfPublication = dateOfPublication;		
	}
	
	public String getISBN() {
		System.out.println("ISBN: ");
		return isbn;
	}
	
	public void setISBN(final String isbn) {
		this.isbn = isbn;
	}
	
	public String getName() {
		System.out.println("Назва книги: ");
		return nameOfBook;
	}
	
	public void setName(final String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}
	
	public String getAuthor() {
		System.out.println("Автор: ");
		return author;
	}

	
	public void setAuthor(final String author) {
		this.author = author;
	}
	
	public String getPublishingHouse() {
		System.out.println("Видавництво: ");
		return publishingHouse;
	}
	
	public void setPublishingHouse(final String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}
	
	public String getGenre() {
		System.out.println("Жанр: ");
		return genre;
	}
	
	public void setGenre(final String genre) {
		this.genre = genre;
	}
	
	public String getDateOfPublication() {
		System.out.println("Дата видання: ");
		return dateOfPublication;
	}
	
	public void setDateOfPublication(final String dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}
}
