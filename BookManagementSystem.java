import java.util.Scanner;

class Publisher {
    String publisherName;
    String publisherAddress;

    public Publisher(String publisherName, String publisherAddress) {
        this.publisherName = publisherName;
        this.publisherAddress = publisherAddress;
    }

    public void displayPublisherDetails() {
        System.out.println("Publisher Name: " + publisherName);
        System.out.println("Publisher Address: " + publisherAddress);
    }
}

class Book extends Publisher {
    String bookTitle;
    String authorName;
    double price;

    public Book(String publisherName, String publisherAddress, String bookTitle, String authorName, double price) {
        super(publisherName, publisherAddress); 
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.price = price;
    }

    public void displayBookDetails() {
        displayPublisherDetails(); 
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author Name: " + authorName);
        System.out.println("Price: " + price);
    }
}

class Literature extends Book {
    String genre;

    public Literature(String publisherName, String publisherAddress, String bookTitle, String authorName, double price, String genre) {
        super(publisherName, publisherAddress, bookTitle, authorName, price); 
        this.genre = genre;
    }

    public void displayLiteratureDetails() {
        displayBookDetails();
        System.out.println("Genre: " + genre);
    }
}

class Fiction extends Book {
    String plotSummary;

    public Fiction(String publisherName, String publisherAddress, String bookTitle, String authorName, double price, String plotSummary) {
        super(publisherName, publisherAddress, bookTitle, authorName, price);  
        this.plotSummary = plotSummary;
    }

    public void displayFictionDetails() {
        displayBookDetails(); 
        System.out.println("Plot Summary: " + plotSummary);
    }
}

public class BookManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Publisher Name: ");
        String publisherName = scanner.nextLine();
        System.out.print("Enter Publisher Address: ");
        String publisherAddress = scanner.nextLine();

        System.out.print("Enter Book Title: ");
        String bookTitle = scanner.nextLine();
        System.out.print("Enter Author Name: ");
        String authorName = scanner.nextLine();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Choose Book Type: 1. Literature 2. Fiction");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        if (choice == 1) {
            System.out.print("Enter Genre for Literature: ");
            String genre = scanner.nextLine();

            Literature literatureBook = new Literature(publisherName, publisherAddress, bookTitle, authorName, price, genre);
            System.out.println("\nLiterature Book Details:");
            literatureBook.displayLiteratureDetails();

        } else if (choice == 2) {
            System.out.print("Enter Plot Summary for Fiction: ");
            String plotSummary = scanner.nextLine();

            Fiction fictionBook = new Fiction(publisherName, publisherAddress, bookTitle, authorName, price, plotSummary);
            System.out.println("\nFiction Book Details:");
            fictionBook.displayFictionDetails();
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
