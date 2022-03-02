package Nivel2;

public class FactoryEspaña extends AbstractFactory{

    public FactoryEspaña(String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion);
    }

    @Override
    public String getTelefono(){
        return "Telefono: +34 " + telefono;
    }

    @Override
    public String getDireccion(){
        return "Direccion: " + direccion + ", España.";
    }
}