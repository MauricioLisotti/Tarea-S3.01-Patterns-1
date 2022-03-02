package Nivel3;

//Command
//Dissenya un pàrquing de 4 vehicles: un cotxe, una bicicleta, un avió i un vaixell.
// Mostri com funciona el patró Command que implementi els
// ètodes arrencar, accelerar i frenar per a cada tipus de vehicle.

public class App {
    public static void main (String [] args) {

        SuperAction sa = new SuperAction();
        sa.addAction(new Start());
        sa.addAction(new Accelerate());
        sa.addAction(new Stop());

        ActionsManager am = new ActionsManager();

        Vehicle v1 = new Vehicle("car");
        Vehicle v2 = new Vehicle("motocycle");
        Vehicle v3 = new Vehicle("truck");


        am.actionExecution(sa,v1);

        am.actionExecution(sa,v2);

        am.actionExecution(sa,v3);
    }
}
