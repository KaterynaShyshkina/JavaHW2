package org.game;


public class App {
    public static void main(String[] args) {
        Controller controller = new Controller(new View(), new Model());
        controller.playGame();
    }
}
