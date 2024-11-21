package dominio;

public class Director extends Participante {

    // Constructor
    public Director(String nombreCompleto) {
        super(nombreCompleto);
    }

    // Implementación del método abstracto obtenerDetalles
    @Override
    public String obtenerDetalles() {
        return "Director: " + getNombreCompleto();
    }
}
