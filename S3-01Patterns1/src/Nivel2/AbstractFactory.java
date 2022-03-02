package Nivel2;

public class AbstractFactory {

    String nombre;
    String telefono;
    String direccion;

    public AbstractFactory(String nombre, String telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion= direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono(){
        return telefono;
    }
    public String getDireccion(){
        return direccion;
    }
}