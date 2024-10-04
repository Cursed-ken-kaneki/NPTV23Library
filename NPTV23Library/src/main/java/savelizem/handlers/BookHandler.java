package savelizem.handlers;

import savelizem.App;
import savelizem.interfaces.BookProvider;
import savelizem.interfaces.InputProvider;
import savelizem.model.Book;

public class BookHandler {
    private final InputProvider inputProvider;
    private final BookProvider bookProvider;

    public BookHandler (InputProvider inputProvider, BookProvider bookProvider){
        this.inputProvider = inputProvider;
        this.bookProvider = bookProvider;
    }
    public void addBook(){
        Book book = bookProvider.createBook(inputProvider);
        for (int i = 0; i < App.books.length; i++){
            if (i==0 && App.books[i] == null){
                App.books[i] = book;
                System.out.println("Книга Добавлена!");
                break;
            } else if (i>0 && App.books[i] == null) {
                App.books[i] = book;
                System.out.println("Книга Добавлена!");
                break;
            }
        }
    }
}
