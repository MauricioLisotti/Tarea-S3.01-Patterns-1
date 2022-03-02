package Nivel1;

public class Main {
    public static void main(String[] args) {

        Undo x = Undo.getInstance();

        x.setComand("Ctrl + Z");
        x.setComand("Ctrl + C");
        x.setComand("Ctrl + V");

        Undo y = Undo.getInstance();

        y.getCommandList();

    }
}
