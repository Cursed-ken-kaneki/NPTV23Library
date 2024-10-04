package savelizem.interfaces;

import savelizem.model.Book;

public interface BookProvider {
    Book createBook (InputProvider inputProvider);

    Object newBook(InputProvider mockInputProvider);
}
