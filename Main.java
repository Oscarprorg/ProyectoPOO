public class Main {
public static void main(String[] args) {
    Concesionario concesionario = new Concesionario("Oscar", null, null, null, 0);
    Vehiculo vehiculo = new Vehiculo(null, null, null, 0, 0);
    Clientes clientes= new Clientes("oSCAR", null, 0, 0, 0);
    Citas citas = new Citas(null, 0, 0, null, null);
    
    clientes.imprimir();
    concesionario.CalcularDineroRecaudado(5000);
    concesionario.CalcularDineroRecaudado(10000);
}


}
