public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Александр", "Пушкин");
        Author sholokhov = new Author("Михаил", "Шолохов");

        Book dubrovsky = new Book("Дубровский", pushkin,1841);
        Book quietDon = new Book("Тихий Дон", sholokhov,1928);

        printBook(dubrovsky);
        printBook(quietDon);

        quietDon.setPublishingYear(1932);
        printBook(quietDon);

        System.out.println(dubrovsky.equals(quietDon));

        Book dubrovskyNew = new Book("Дубровский", pushkin, 1841);
        System.out.println(dubrovsky.equals(dubrovskyNew));

        System.out.println(dubrovsky.getClass());
        System.out.println(quietDon.getClass());

    }
    public static void printBook(Book book) {
        System.out.println(book.toString());
    }
}