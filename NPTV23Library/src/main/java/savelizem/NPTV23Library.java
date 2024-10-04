package savelizem;

import savelizem.handlers.BookHandler;
import savelizem.interfaces.BookProvider;
import savelizem.interfaces.InputProvider;
import savelizem.interfaces.impl.ConsoleInput;
import savelizem.interfaces.impl.InputBook;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NPTV23Library {

    public static void main(String[] args) {
        InputProvider inputProvider = new ConsoleInput();
        BookProvider bookProvider = new InputBook() ;
        BookHandler bookHandler = new BookHandler(inputProvider, bookProvider);


        System.out.println("-------- NPTV23Library --------");
        App app = new App(bookHandler, inputProvider);
        app.run();
    }
}