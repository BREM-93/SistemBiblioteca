package ExamenCuscatlan.biblioteca;

public class Libro extends Material{
    private String autor;
    private String editorial;
    public Libro(String titulo, String tipomaterial, String autor, String editorial) {
        super(titulo, tipomaterial);
        this.autor = autor;
        this.editorial = editorial;
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
    public String getEditorial( ) {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
}
