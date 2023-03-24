import java.sql.Date;



public class Repuestos {
    String NombreCliente;
    String Vehiculo;
    String NombreMecanico;
    String Detalle;
    Date Fechainicio;
    Date FechaEntrega;

    
    public Repuestos(String nombreCliente, String vehiculo, String nombreMecanico, String detalle, Date fechainicio,
            Date fechaEntrega) {
        NombreCliente = nombreCliente;
        Vehiculo = vehiculo;
        NombreMecanico = nombreMecanico;
        Detalle = detalle;
        Fechainicio = fechainicio;
        FechaEntrega = fechaEntrega;
    }
    public String getNombreCliente() {
        return NombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        NombreCliente = nombreCliente;
    }
    public String getVehiculo() {
        return Vehiculo;
    }
    public void setVehiculo(String vehiculo) {
        Vehiculo = vehiculo;
    }
    public String getNombreMecanico() {
        return NombreMecanico;
    }
    public void setNombreMecanico(String nombreMecanico) {
        NombreMecanico = nombreMecanico;
    }
    public String getDetalle() {
        return Detalle;
    }
    public void setDetalle(String detalle) {
        Detalle = detalle;
    }
    public Date getFechainicio() {
        return Fechainicio;
    }
    public void setFechainicio(Date fechainicio) {
        Fechainicio = fechainicio;
    }
    public Date getFechaEntrega() {
        return FechaEntrega;
    }
    public void setFechaEntrega(Date fechaEntrega) {
        FechaEntrega = fechaEntrega;
    }


}
