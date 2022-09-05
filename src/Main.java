public class Main {
    public static void main(String[] args) {
        Author man1 = new Author("Sheesh", "Block");
        Author man2 = new Author("George", "Orwell");
        Book book1 = new Book("Berserk", man1, 1234);
        Book book2 = new Book("1984", man2, 1903);
        book1.setPublicationYear(1924);
        System.out.println(book1.getPublicationYear());
        //Чисто проверить, что записано в объекте... эм... фигня какая-то по факту "Author@7c75222b"
        System.out.println(book2.getAuthor());

    }
}
