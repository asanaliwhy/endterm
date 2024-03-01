
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}


class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class LibrarySystem {
    private List<Book> books;
    private List<User> users;

    public LibrarySystem() {
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }


    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }


    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }

    public void displayUsers() {
        System.out.println("Library Users:");
        for (User user : users) {
            System.out.println("User: " + user.getName());
        }
    }
}


public class Main {
    public static void main(String[] args) {
        // Create instances of books and users
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        User user1 = new User("Alice");
        User user2 = new User("Bob");


        LibrarySystem librarySystem = new LibrarySystem();

        librarySystem.addBook(book1);
        librarySystem.addBook(book2);

        librarySystem.addUser(user1);
        librarySystem.addUser(user2);

        librarySystem.displayBooks();
        librarySystem.displayUsers();
    }
}
