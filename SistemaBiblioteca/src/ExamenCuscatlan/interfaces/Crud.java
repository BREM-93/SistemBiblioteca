package ExamenCuscatlan.interfaces;

import java.util.List;

public interface Crud<T>{
    void agregar(T item);
    List<T> obtenerTodos();
    T obtenerPorId(int id);
    void actualizar(T item);
    void eliminar(int id);
}
