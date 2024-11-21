package dominio;

public class MusicoSocio extends Participante {
    private String instrumento;
    private int numeroSocio;

    // Constructor
    public MusicoSocio(String nombreCompleto, String instrumento, int numeroSocio) {
        super(nombreCompleto);
        this.instrumento = instrumento;
        this.numeroSocio = numeroSocio;
    }

    // Getters y setters
    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    public void setNumeroSocio(int numeroSocio) {
        this.numeroSocio = numeroSocio;
    }

    // Implementación del método abstracto obtenerDetalles
    public String obtenerDetalles() {
        return "Músico Socio: " + getNombreCompleto() + ", Instrumento: " + instrumento +
               ", Número de Socio: " + numeroSocio;
    }
}
