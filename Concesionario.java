import java.util.ArrayList;
import java.util.List;



public class Concesionario {
        private String Nombre;
        private String Direccion;
        private Number Telefono;
        private String Barrio;
        private double Nit;
        List<Vehiculo> VehiculosVendidos;
        List<Vehiculo> RespuestosVendidos;
        List<Vehiculo> Citas;
        float SaldoRecaudado;
        

        public Concesionario(String nombre, String direccion, Number telefono, String barrio, double nit) {
            Nombre = nombre;
            Direccion = direccion;
            Telefono = telefono;
            Barrio = barrio;
            Nit = nit;

            VehiculosVendidos = new ArrayList<>();
            RespuestosVendidos = new ArrayList<>();
            Citas = new ArrayList<>();
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
        public void CalcularDineroRecaudado(int Valor){
            if(Valor > 0){
                SaldoRecaudado = SaldoRecaudado + Valor;
                System.out.println("Dinero recaudado es" +Valor+"Total dinero recaudado"+SaldoRecaudado);
                
            }
        }

         }

