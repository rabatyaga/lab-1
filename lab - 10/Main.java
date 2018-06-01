package lab10;

public class Main {
	public static void main(String[] args) {
		Library list = new Library();
		
		list.setISBN("978-617-12-0454-6");
		list.setName("Ігри, у які грають люди");
		list.setAuthor("Ерік Берн");
		list.setPublishingHouse("Глобус");
		list.setGenre("Есе");
		list.setDateOfPublication("2016");
		
		System.out.println(list.getISBN());
		System.out.println(list.getName());
		System.out.println(list.getAuthor());
		System.out.println(list.getPublishingHouse());
		System.out.println(list.getGenre());
		System.out.println(list.getDateOfPublication());
	}
}
