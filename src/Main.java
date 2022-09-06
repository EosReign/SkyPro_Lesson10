public class Main {
    public static void main(String[] args) {
        Author man1 = new Author("Sheesh", "Block");
        Author man2 = new Author("George", "Orwell");
        Book book1 = new Book("Berserk", man1, 1234);
        Book book2 = new Book("1984", man2, 1903);
        book1.setPublicationYear(1924);
        System.out.println(book1.getPublicationYear());
        //практика методов. Пофиг мне на ваши классы автор и бук, я незнаю накой ляд там это с отсутствием методов в которые можно запихнуть hashcode() and equals().
        System.out.println(book2.getAuthor());
        String man2Str = man2.toString();
        boolean compare = man2.hashCode() == book2.hashCode();
        System.out.println(man2);
        System.out.println("Output (String): " + man2Str.equals(book2.getAuthor()));
        System.out.println("Output (HashCode): " + compare);

    }
}
