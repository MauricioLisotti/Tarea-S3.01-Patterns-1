package Nivel1;

import java.util.ArrayList;

public class Undo {

    private static Undo instance;
    private static ArrayList<String> commands = new ArrayList<String>();

    private Undo(){
    }

    public static Undo getInstance() {
        if(instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void setComand(String command) {

        commands.add(command);
    }

    public void getCommandList() {

        System.out.println(commands);
    }

}