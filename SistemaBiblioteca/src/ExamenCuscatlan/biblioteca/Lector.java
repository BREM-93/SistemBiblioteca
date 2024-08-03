package ExamenCuscatlan.biblioteca;

import java.util.ArrayList;
import java.util.List;

public abstract class Lector {
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Pedido> pedidos;
    public Lector(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pedidos = new ArrayList<>();
    }
    public abstract void reservar(Material material);
    public abstract void entregar(Material material);

    public void agregarPedido(Pedido pedido){
        pedido.add(pedido);
    }
    public List<Pedido> getPedidos(){
        return pedidos;
    }
    public void add(Lector lector) {
    }

    public String getNombre( ) {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion( ) {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono( ) {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

}
