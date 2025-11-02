public class Aggregation {
    public static void main(String[] args) {
        //Aggregation = represents a "has-a" relationship between objects.
        //              one object contains another object as part of its structure,
        //              but the contained objects can exist independently. 
        Book book1 = new Book("The Great Gatsby", 180);
        Book book2 = new Book("1984", 328);
        Book[] books = {book1, book2};
        for(Book book : books){
            System.out.println(book.displayInfo());

        }
        Library library = new Library("City Library", 1995, books);
        library.displayInfo();

    }
    
}
