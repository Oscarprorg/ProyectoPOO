
public class Clientes {
    String Nombre;
    String Apellido;
    double Nit;
    double Telefono;
    double Direccion;
    public Clientes(String nombre, String apellido, double nit, double telefono, double direccion) {
        Nombre = nombre;
        Apellido = apellido;
        Nit = nit;
        Telefono = telefono;
        Direccion = direccion;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String getApellido() {
        return Apellido;
    }
    public void setApellido(String apellido) {
        Apellido = apellido;
    }
    public double getNit() {
        return Nit;
    }
    public void setNit(double nit) {
        Nit = nit;
    }
    public double getTelefono() {
        return Telefono;
    }
    public void setTelefono(double telefono) {
        Telefono = telefono;
    }
    public double getDireccion() {
        return Direccion;
    }
    public void setDireccion(double direccion) {
        Direccion = direccion;
    }
    public void imprimir(){
        System.out.println("Nombre del CLiente es:"+Nombre);
        System.out.println("Apellido del Cliente es:"+Apellido);
        System.out.println("Numero de Identificacion es:"+Nit);
        System.out.println("Numero de Telefono"+Telefono);
        System.out.println("Direccion del Cliente es:"+Direccion);
        
    }
}
