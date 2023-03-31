import java.sql.Date;

public class Citas {
    String Usuario;
    double Nit;
    int ID;
    Date FechaCita;
    Date FechaEntrega;

    
    public Citas(String usuario, double nit, int iD, Date fechaCita, Date fechaEntrega) {
        Usuario = usuario;
        Nit = nit;
        ID = iD;
        FechaCita = fechaCita;
        FechaEntrega = fechaEntrega;
    }
    public String getUsuario() {
        return Usuario;
    }
    public void setUsuario(String usuario) {
        Usuario = usuario;
    }
    public double getNit() {
        return Nit;
    }
    public void setNit(double nit) {
        Nit = nit;
    }
    public int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public Date getFechaCita() {
        return FechaCita;
    }
    public void setFechaCita(Date fechaCita) {
        FechaCita = fechaCita;
    }
    public Date getFechaEntrega() {
        return FechaEntrega;
    }
    public void setFechaEntrega(Date fechaEntrega) {
        FechaEntrega = fechaEntrega;
    }
    public void imprimir(){
        System.out.println("Nombre del CLiente:"+Usuario);
        System.out.println("Numero de Identificacion es"+Nit);
        System.out.println("Codigo del cliente es::"+ID);
        System.out.println("Fecha de Revision"+FechaCita);
        System.out.println("Fecha de Entrega:"+FechaEntrega);
        
    }
}
