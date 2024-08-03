package ExamenCuscatlan.biblioteca;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idUsuario;
    private String tituloMaterial;
    private String codigoMaterial;
    private DateFormat fechaReserva;
    private DateFormat fechaEntrega;
    private List<Bibliotecario> bibliotecarios;


    public Pedido(int idUsuario, String tituloMaterial, String codigoMaterial) {
        this.idUsuario = idUsuario;
        this.tituloMaterial = tituloMaterial;
        this.codigoMaterial = codigoMaterial;
        this.bibliotecarios = new ArrayList<>();
    }

    public void reservar(DateFormat fecha){
        this.fechaReserva = fecha;
    }
    public void entregar(DateFormat fecha){
        this.fechaEntrega = fecha;
    }
    public void agregarBibliotecario(Bibliotecario bibliotecario){
        bibliotecario.add(bibliotecario);
    }

    //Faltan Getters y Setters


    public int getIdUsuario( ) {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTituloMaterial( ) {
        return tituloMaterial;
    }

    public void setTituloMaterial(String tituloMaterial) {
        this.tituloMaterial = tituloMaterial;
    }

    public String getCodigoMaterial( ) {
        return codigoMaterial;
    }

    public void setCodigoMaterial(String codigoMaterial) {
        this.codigoMaterial = codigoMaterial;
    }

    public DateFormat getFechaReserva( ) {
        return fechaReserva;
    }

    public void setFechaReserva(DateFormat fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public DateFormat getFechaEntrega( ) {
        return fechaEntrega;
    }

    public void setFechaEntrega(DateFormat fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public List<Bibliotecario> getBibliotecarios( ) {
        return bibliotecarios;
    }

    public void setBibliotecarios(List<Bibliotecario> bibliotecarios) {
        this.bibliotecarios = bibliotecarios;
    }

    public void add(Pedido pedidos) {
        
    }
}
