package refactored.main;

import refactored.control.Controller;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Controller controller = new Controller();
        controller.run();
    }

}
