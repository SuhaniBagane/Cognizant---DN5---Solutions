import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Book[] books = {

                new Book(101, "Java", "James Gosling"),
                new Book(102, "Python", "Guido"),
                new Book(103, "C Programming", "Dennis")

        };

        Book result = SearchLibrary.linearSearch(books, "Python");

        if (result != null)
            System.out.println("Linear Search Found : " + result.title);

        Arrays.sort(books, Comparator.comparing(book -> book.title));

        result = SearchLibrary.binarySearch(books, "Python");

        if (result != null)
            System.out.println("Binary Search Found : " + result.title);

    }

}