package savelizem.interfaces.impl;

import savelizem.interfaces.InputProvider;

import java.util.Scanner;

public class ConsoleInput implements InputProvider {
    private Scanner scanner = new Scanner(System.in);
    @Override
    public String getInput(){
        return scanner.nextLine();
    }
}
