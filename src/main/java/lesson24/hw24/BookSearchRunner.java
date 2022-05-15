    package lesson24.hw24;

    import lesson24.hw24.dto.AuthorAndBook;
    import lesson24.hw24.jdbc.BookDb;

    import java.util.List;
    import java.util.Scanner;



    public class BookSearchRunner {
        private static final String EXIT_PHRASE = "выход";
    public static void main(String[] args) {
        System.out.println("Введите наименование книги/имя автора для поиска ");
        System.out.printf("или введите %s для завершения работы программы:\n", EXIT_PHRASE);
        final Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            final String text = scanner.nextLine();
            if (EXIT_PHRASE.equalsIgnoreCase(text)){
                return;
            }
           final List<AuthorAndBook> authorAndBook = BookDb.searchByTitleOrAuthorName(text);
            System.out.println("Книги с информацией об авторе:");
            System.out.println(authorAndBook);
        }
    }
}
