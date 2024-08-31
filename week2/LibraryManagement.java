package Assignments.week2;

public class LibraryManagement {
	public static void main(String[] args) {

		Library Books = new Library();
		String BookName = Books.addBook("Great Wall");
		
		System.out.println("The Name of Book added is - " +BookName);
		
		Books.issueBook();
	}

}
