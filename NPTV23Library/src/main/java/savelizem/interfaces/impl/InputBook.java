package savelizem.interfaces.impl;

import savelizem.interfaces.BookProvider;
import savelizem.interfaces.InputProvider;
import savelizem.model.Author;
import savelizem.model.Book;

public class InputBook implements BookProvider {
    @Override
    public Book createBook(InputProvider inputProvider) {
        Book book = new Book();
        System.out.print("Название книги: ");
        book.setTitle(inputProvider.getInput() );
        System.out.print("Количество авторов: ");
        int countAuthors = Integer.parseInt(inputProvider.getInput());
        for (int i = 0; i < countAuthors; i++) {
            System.out.printf("%d. автор: %n", i+1);
            Author author = new Author();
            System.out.println("Имя автора: ");
            author.setAuthorName(inputProvider.getInput());
            System.out.println("Фамилия автора: ");
            author.setAuthorSurname(inputProvider.getInput());
            book.getAuthors()[i]=author;
            System.out.println();
        }
        System.out.println("Год издания: ");
        book.setPublishedYear(Integer.parseInt(inputProvider.getInput()));
        return book;
    }
}
