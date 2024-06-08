import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Title: ");
        String title = scanner.nextLine();

        while (!(title.equals(""))) {
            System.out.print("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int pubYear = Integer.valueOf(scanner.nextLine());

            bookList.add(new Book(title, pages, pubYear));

            System.out.print("Title: ");
            title = scanner.nextLine();
        }

        System.out.print("What information will be printed? ");
        String printedInfo = scanner.nextLine();

        for (Book book : bookList) {
            if (printedInfo.equals("everything")) {
                System.out.println(book);
            }

            if (printedInfo.equals("name")) {
                System.out.println(book.getTitle());
            }
        }

    }
}
