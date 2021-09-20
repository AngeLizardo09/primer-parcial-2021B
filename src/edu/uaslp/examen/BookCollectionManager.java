package edu.uaslp.examen;

import javax.crypto.IllegalBlockSizeException;
import java.util.ArrayList;
import java.util.List;

public class BookCollectionManager {
    private List<BookCollection> collections;

    public BookCollection createCollection(String name){
        BookCollection bookCollection = new BookCollection();
        collections.add(bookCollection);
        return bookCollection;
    }
    public BookCollection getCollectionByName(String name){
        for (BookCollection bookCollection : collections){
            if(bookCollection.getName() == name){
                return bookCollection;
            }
        }
        return null;
    }
    public void deleteCollection(String name){
        for (BookCollection bookCollection : collections){
            if(bookCollection.getName() == name){
                collections.remove(name);
            }
        }
    }
    public void addBookToCollection(String collectionName,book Book){
        for (BookCollection bookCollection : collections){
            if(bookCollection.getName() == collectionName){
                bookCollection.addBook(Book);
                return;
            }
        }
        createCollection(collectionName);
        addBookToCollection(collectionName,Book);
    }
    public List<String> getCollectionNames(){
        List<String> CollectionNames = new ArrayList<>();
        for (BookCollection bookCollection : collections){
            CollectionNames.add(bookCollection.getName());
        }
        return CollectionNames;
    }
}
