package ExamenCuscatlan.biblioteca;

public class Estudiante extends Lector{
    private String codigoEstudiante;

    public Estudiante(String nombre, String direccion, String telefono, String codigoEstudiante) {
        super(nombre, direccion, telefono);
        this.codigoEstudiante = codigoEstudiante;
    }
    @Override
    public void reservar(Material material) {

    }
    @Override
    public void entregar(Material material) {

    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }
}
