package all;

public class bookdb {

	private String name,isbn,publisher;
	
	public bookdb() {
	}
	public bookdb(String name1, String isbn1, String publisher1) {
		name = name1;
		isbn = isbn1;
		publisher = publisher1;
	}
	
	public void setName(String name2) {
		//name = name2;
	}
	public void setISBN(String isbn2) {
		//isbn = isbn2;
	}
	public void setPublisher(String publisher2) {
		//publisher = publisher2;
	}
	public String getName() {return name;}
	public String getIsbn() {return isbn;}
	public String getpublisher() {return publisher;}
	public void showAll(){
		System.out.println("- - - - - - - - - - - - - - - -");
		System.out.println("Book's Name:"+name+","+"Publisher:"+publisher+","+"("+"ISBN:"+isbn);
		System.out.println("- - - - - - - - - - - - - - - -");
	}
}
