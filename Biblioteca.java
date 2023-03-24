import java.util.ArrayList;
import java.util.List;
public class Biblioteca {
private String nombre;
private List<Libro> listado;
 
    public Biblioteca(String nombre){
        this.nombre=nombre;
        listado=new ArrayList<>();
    }
    public String getNombre(){
        return nombre;
    }
 
    public void add(Libro libro){
        listado.add(libro);
    }
 
    public void listar(){
        System.out.println("LISTADO DE LIBROS");
        for(Libro libro:listado){
            libro.imprimir();
            System.out.println();
        }
    }
     }