public class app {
    public static void main(String[] args) {

        Library lib = new Library();
        lib.add(new Book("Abdulla Qodiriy", "Mehrobdan chayon"), 1, "C1", 3);
        lib.add(new Book("Abdulla Qahhor", "O'g'ri"), 1, "C1", 3);
        lib.add(new Book("Robindrnand Tagor", "Jimjitlik"), 1, "C1", 4);
        lib.add(new Book("Eshmat Toshmatov", "Ummon"), 1, "C2", 4);
        System.out.println(lib.getBooks(1, "C1"));

        Book book = lib.find("Robindrnand Tagor", "Jimjitlik");
        if (book == null) {
            System.out.println("Book not found");
        } else {
            System.out.println("Floor " + book.getFloor() + " Closet " + book.getCloset() + " Shelf " + book.getShelf());
        }
    }
}
