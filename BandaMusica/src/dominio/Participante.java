package dominio;

public abstract class Participante {
    private String nombreCompleto;

    // Constructor
    public Participante(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    // Getter y setter para nombreCompleto
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    // Método abstracto para obtener información específica del participante
    public abstract String obtenerDetalles();
    
    // toString para representación general
    public String toString() {
        return "Participante: " + nombreCompleto;
    }
}
