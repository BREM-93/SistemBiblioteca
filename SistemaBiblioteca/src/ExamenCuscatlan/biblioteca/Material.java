package ExamenCuscatlan.biblioteca;

import ExamenCuscatlan.repositorio.TipoMaterial;

public abstract class Material {
    private String titulo;
    private String  tipomaterial;

    public Material(String titulo, String tipomaterial) {
        this.titulo = titulo;
        this.tipomaterial = tipomaterial;
    }

    public abstract void reservar(String fecha);
    public abstract void entregar(String fecha);


}
