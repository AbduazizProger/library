import java.util.ArrayList;

public class Library {
    ArrayList<Book> library = new ArrayList<Book>();
    public Library() {
    }

    public boolean add(Book book, int floor, String closet, int shelf) {
        if ((1 <= floor && 3 >= floor) && (1 <= shelf && 6 >= shelf)) {
            book.setPlace(closet, floor, shelf);
            library.add(book);
            return true;
        }
        return false;
    }

    public boolean contains(int floor, String closet, int shelf, Book book) {
        if (book.getFloor() == floor && book.getCloset().equals(closet) && book.getShelf() == floor) {
            return true;
        }
        return false;
    }

    public String getBooks(int floor, String closet) {
        String books = "";
        for (int i = 0; i < 6; i++) {
            books += "Shelf" + (i + 1) + ":\n";
            for (Book x:library) {
                if (x.getFloor() == floor && closet.equals(x.getCloset()) && i + 1 == x.getShelf()) {
                    books += x.toString() + "\n";
                }
            }
        }
        return books;
    }

    public Book find(String author, String title) {
        for (int i = 0; i < library.size(); i++) {
            if (library.get(i).getAuthor().equals(author) && library.get(i).getTitle().equals(title)) {
                return library.get(i);
            }
        }
        return null;
    }
}
