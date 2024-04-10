package refactored.view;

import java.util.Scanner;

public class ConsoleReader {
    public static String readAndReturnString () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int readAndReturnInt () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
