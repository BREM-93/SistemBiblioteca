package ExamenCuscatlan.repositorio;

import ExamenCuscatlan.biblioteca.Pedido;
import ExamenCuscatlan.interfaces.Crud;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepositorio implements Crud<Pedido> {
    private List<Pedido> pedidos = new ArrayList<>();
    @Override
    public void agregar(Pedido pedidos) {
        pedidos.add(pedidos);
    }
    @Override
    public List<Pedido> obtenerTodos() {
        return pedidos;
    }
    @Override
    public Pedido obtenerPorId(int id) {
        return null;
    }
    @Override
    public void actualizar(Pedido item) {

    }
    @Override
    public void eliminar(int id) {

    }
}
