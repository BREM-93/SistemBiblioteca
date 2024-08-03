package ExamenCuscatlan.biblioteca;

public class Revista extends Material {
    private String autor;
    private String edicion;

    public Revista(String titulo, String tipomaterial) {
        super(titulo, tipomaterial);
    }

    @Override
    public void reservar(String fecha) {

    }
    @Override
    public void entregar(String fecha) {

    }
    public String getAutor( ) {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEdicion( ) {
        return edicion;
    }
    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }
}
