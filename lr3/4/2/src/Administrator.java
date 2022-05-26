public class Administrator extends Person {

    Administrator(String name, String surname) {
        super(name, surname);
    }

    void banReader(Reader reader, Library library) {
        library.blacklist.add(reader);
    }
}
