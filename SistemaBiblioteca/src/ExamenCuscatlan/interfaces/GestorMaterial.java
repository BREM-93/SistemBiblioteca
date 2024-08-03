package ExamenCuscatlan.interfaces;

import ExamenCuscatlan.biblioteca.Material;

public interface GestorMaterial {
    void reservar(Material material, String fecha);
    void entregar(Material material, String fecha);
}
