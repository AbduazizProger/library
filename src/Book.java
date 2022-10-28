public class Book {
    private String author, title, closet;
    private int floor, shelf;
    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return "Author is: " + this.author + " and title is: " + this.title;
    }

    public void setPlace(String closet, int floor, int shelf) {
        this.closet = closet;
        this.shelf = shelf;
        this.floor = floor;
    }

    public int getShelf() {
        return this.shelf;
    }

    public String getCloset() {
        return this.closet;
    }

    public int getFloor() {
        return this.floor;
    }
}
