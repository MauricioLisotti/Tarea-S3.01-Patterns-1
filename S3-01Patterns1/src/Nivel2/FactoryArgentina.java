package Nivel2;

public class FactoryArgentina extends AbstractFactory {

    public FactoryArgentina(String nombre, String telefono, String direccion) {
        super(nombre, telefono, direccion);
    }

    @Override
    public String getTelefono(){
        return "Telefono: +54 " + telefono;
    }

    @Override
    public String getDireccion(){
        return "Direccion: " + direccion + ", Argentina.";
    }
}