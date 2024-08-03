package ExamenCuscatlan.repositorio;

import ExamenCuscatlan.biblioteca.Material;
import ExamenCuscatlan.interfaces.Crud;

import java.util.ArrayList;
import java.util.List;

public class MaterialRepositorio implements Crud<Material> {
    private List<Material> materiales = new ArrayList<>();


    @Override
    public void agregar(Material material ) {
       materiales.add(material);
    }
    @Override
    public List<Material> obtenerTodos( ) {
        return materiales;
    }
    @Override
    public Material obtenerPorId(int id) {
        return null;
    }
    @Override
    public void actualizar(Material item) {

    }
    @Override
    public void eliminar(int id) {

    }
}
