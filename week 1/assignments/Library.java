package week1.assignments;

public class Library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library l1 = new Library();
		l1.addBook("JAva");
		l1.issueBook();
	}

	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}

	public void issueBook() {
		System.out.println("Book issued successfully");
	}
}