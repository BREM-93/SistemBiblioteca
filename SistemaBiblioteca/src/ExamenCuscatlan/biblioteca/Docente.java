package ExamenCuscatlan.biblioteca;

public class Docente extends Lector{
    private String codigoDocente;
    public Docente(String nombre, String direccion, String telefono, String codigoDocente) {
        super(nombre, direccion, telefono);
        this.codigoDocente = codigoDocente;
    }
    @Override
    public void reservar(Material material) {

    }
    @Override
    public void entregar(Material material) {

    }
    public String getCodigoDocente( ) {
        return codigoDocente;
    }
    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }
}
