public class Vehiculo {
    String Marca;
    String Modelo;
    String Color;
    double Km;
    double Precio;

    public Vehiculo(String marca, String modelo, String color, double km, double precio) {
        Marca = marca;
        Modelo = modelo;
        Color = color;
        Km = km;
        Precio = precio;
    }

    public String getMarca() {
        return Marca;
    }
    public void setMarca(String marca) {
        Marca = marca;
    }
    public String getModelo() {
        return Modelo;
    }
    public void setModelo(String modelo) {
        Modelo = modelo;
    }
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public double getKm() {
        return Km;
    }
    public void setKm(double km) {
        Km = km;
    }
    public double getPrecio() {
        return Precio;
    }
    public void setPrecio(double precio) {
        Precio = precio;
    }

    public void imprimir() {
        System.out.println("dfsfasff"+Marca);
        System.out.println("");
        System.out.println("");
        System.out.println("");

    }


}
