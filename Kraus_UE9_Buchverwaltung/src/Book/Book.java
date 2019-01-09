package Book;

public class Book implements Comparable<Book> {

    //Attribute

    private String author;
    private String title;
    private int issue;

    //Konstruktor

    public Book(String author, String title, int issue) {
        this.author = author;
        this.title = title;
        this.issue = issue;
    }

    public Book(String fileline) {

    }

    public static Book stringToBook(String longstring) {

        String longstringhalf;                                       //longstring ohne 1. Teil
        String subString1;
        String subString2;
        String subString3;

        subString1 = longstring.substring(0, longstring.indexOf(";"));
        longstringhalf = longstring.substring(longstring.indexOf(";") + 1);
        subString2 = longstringhalf.substring(0, longstringhalf.indexOf(";"));
        subString3 = longstringhalf.substring(longstringhalf.indexOf(";") + 1);

        Book newBook = new Book(subString1, subString2, Integer.parseInt(subString3));

        return newBook;
    }

    public static String bookToString(Book oBook) {

        return oBook.getAuthor() + ";" + oBook.getTitle() + ";" + oBook.getIssue();
    }

    //Getter&Setter
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

    public int getIssue() {
        return issue;
    }

    public void setIssue(int issue) {
        this.issue = issue;
    }

    @Override
    public String toString() {
        return this.author + ": \"" + this.title + "\" \t Auflage: " + this.issue + " Stueck \n";
    }

    @Override
    public int compareTo(Book o) {
        return this.author.compareTo(o.getAuthor());
    }
}
