package mywebapp.app.controller;

import java.util.ArrayList;
import java.util.List;
 
public class BookData {
     
   private final List<Book> allBooks = new ArrayList<Book>();
 
  public BookData(){
     /* allBooks.add(new Book("Philip Hensher", "The Fit",false ));
     allBooks.add(new Book("Philip Hensher", "Kitchen Venom",false));
        allBooks.add(new Book("Michael Greenberg", "Hurry Down Sunshine",false));
       allBooks.add(new Book("Michael Greenberg", "Painless Vocabulary",false));
       allBooks.add(new Book("Rick Perlstein", "Nixonland: The Rise of a President and the Fracturing",false));
        allBooks.add(new Book("Rick Perlstein", "Nixonland",false));
    */}
    
    public List<Book> getAllBooks() {
     return allBooks;
    }
 
}