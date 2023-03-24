import java.util.ArrayList;
import java.util.List;

public class Concesionario{
    String Nombre;
    String Direccion;
    Number Telefono;
    String Barrio;
    double Nit;
    List<Vehiculo> VehiculosVendidos;


    public Concesionario(String nombre, String direccion, Number telefono, String barrio, double nit) {
        Nombre = nombre;
        Direccion = direccion;
        Telefono = telefono;
        Barrio = barrio;
        Nit = nit;
        VehiculosVendidos = new ArrayList<>();
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
    public Number getTelefono() {
        return Telefono;
    }
    public void setTelefono(Number telefono) {
        Telefono = telefono;
    }
    public String getBarrio() {
        return Barrio;
    }
    public void setBarrio(String barrio) {
        Barrio = barrio;
    }
    public double getNit() {
        return Nit;
    }
    public void setNit(double nit) {
        Nit = nit;
    }
    public void add(Vehiculo vehiculo){
        VehiculosVendidos.add(vehiculo);
    }
 
    public void Vendidos(){
        System.out.println("");
        for(Vehiculo vehiculo:VehiculosVendidos){
            vehiculo.imprimir();
            System.out.println();
        }
    }


}