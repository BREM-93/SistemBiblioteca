package ExamenCuscatlan.repositorio;

import ExamenCuscatlan.biblioteca.Lector;
import ExamenCuscatlan.interfaces.Crud;

import java.util.ArrayList;
import java.util.List;

public class LecturaRepositorio implements Crud<Lector> {
    private List<Lector> lector = new ArrayList<>();


    @Override
    public void agregar(Lector lector) {
        lector.add(lector);
    }

    @Override
    public List<Lector> obtenerTodos( ) {
        return lector;
    }

    @Override
    public Lector obtenerPorId(int id) {
        return null;
    }

    @Override
    public void actualizar(Lector item) {

    }

    @Override
    public void eliminar(int id) {

    }
}
