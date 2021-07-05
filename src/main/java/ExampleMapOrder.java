import java.util.*;

public class ExampleMapOrder {

    public static void main (String [] args ) {

        //Criar uma lista de livros usando a estrutura de dados mais adequada para depois imprimir na ordem desejada

        System.out.println("\n--\tOrdem aleatória\t--"); // HashMap não mantéma ardem
        Map<String, Book> myBooks = new HashMap<>() {{
            put("Styron, William", new Book("Sophie´s Choice", 562));
            put("Hemingway, Ernest", new Book("For Whom the Bell Tolls", 677));
            put("Dostoievsky, Fiodor", new Book("The Brothers Karamazov", 840));
            put("Eco, Humberto", new Book("The name of the Rose", 657));
        }};

        for(Map.Entry<String, Book> livro : myBooks.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getName());
        }

        System.out.println("\nImprimindo com o ToString()");
        System.out.println(myBooks.toString());


        System.out.println("\n--\tOrdem Inserção\t--"); // LinkedHashMap
        Map<String, Book> myBook1 = new LinkedHashMap<>() {{
            put("Styron, William", new Book("Sophie´s Choice", 562));
            put("Hemingway, Ernest", new Book("For Whom the Bell Tolls", 677));
            put("Dostoievsky, Fiodor", new Book("The Brothers Karamazov", 840));
            put("Eco, Humberto", new Book("The name of the Rose", 657));
        }};

        for(Map.Entry<String, Book> livro1 : myBook1.entrySet()) {
            System.out.println(livro1.getKey() + " - " + livro1.getValue().getName());
        }



        System.out.println("\n--\tOrdem alfabética autores\t--"); // TreeMap - ordem pela Key
        Map<String, Book> myBooks2 = new TreeMap<>(myBook1);
        for(Map.Entry<String, Book> livro : myBooks2.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getName());
        }


        System.out.println("\n--\tOrdem alfabética nomes dos livros\t--"); // TreeSet - ordem dos values, usando comparator pelo name
        Set<Map.Entry<String, Book>> mybooks3 = new TreeSet<>(new ComparatorName());
        mybooks3.addAll(myBooks.entrySet());
        for(Map.Entry<String, Book> livro : mybooks3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getName());
        }


        System.out.println("\n--\tOrdem pelo número de páginas dos livros\t--"); // TreeSet - ordem dos values, usando comparator pelo pages
        Set<Map.Entry<String, Book>> mybooks4 = new TreeSet<>(new ComparatorPages());
        mybooks4.addAll(myBooks.entrySet());
        for (Map.Entry<String, Book> livro : mybooks4) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getName() + ", pages: " + livro.getValue().getPages());
        }
    }

}


class Book {
    private String name;
    private Integer pages;

    public Book() {

    }

    public Book(String name, Integer pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return getName().equals(book.getName()) && getPages().equals(book.getPages());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPages());
    }

    @Override
    public String toString() {
        return " Book [" +
                "name='" + name + '\'' +
                ", pages=" + pages +
                ']' + "\n";
    }
}

class ComparatorName implements Comparator<Map.Entry<String, Book>> {

    @Override
    public int compare(Map.Entry<String, Book> l1, Map.Entry<String, Book> l2) {
        return l1.getValue().getName().compareToIgnoreCase(l2.getValue().getName());
    }
}

class ComparatorPages implements Comparator<Map.Entry<String,Book>> {

    @Override
    public int compare(Map.Entry<String, Book> l1, Map.Entry<String, Book> l2) {
        return l1.getValue().getPages().compareTo(l2.getValue().getPages());
    }
}
