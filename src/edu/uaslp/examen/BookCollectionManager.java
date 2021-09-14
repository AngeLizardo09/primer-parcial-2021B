package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionManager {

    private List<BookCollection> collections;

    public BookCollectionManager() {
        collections = new ArrayList<>();
    }

    public BookCollection createCollection(String name) {
        BookCollection bookCollection = new BookCollection(name);

        collections.add(bookCollection);

        return bookCollection;
    }

    public BookCollection getCollectionByName(String name) {
        for (BookCollection bookCollection : collections) {
            if (bookCollection.getName().equals(name)) {
                return bookCollection;
            }
        }

        return null;
    }


    public void deleteCollectionByName(String name) {
        for (BookCollection bookCollection : collections) {
            if (bookCollection.getName().equals(name)) {
                collections.remove(bookCollection);
                return;
            }
        }
    }

    public void addBookToCollection(String collectionName, Book book){
        BookCollection bookCollection = getCollectionByName(collectionName);

        if(bookCollection == null){
            bookCollection = createCollection(collectionName);
        }

        bookCollection.addBook(book);
    }

    public List<String> getCollectionNames(){
        List<String> collectionNames = new ArrayList<>();

        for(BookCollection bookCollection: collections){
            collectionNames.add(bookCollection.getName());
        }

        return collectionNames;
    }

}
