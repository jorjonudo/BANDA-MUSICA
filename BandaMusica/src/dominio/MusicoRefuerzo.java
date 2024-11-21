package dominio;

import java.math.BigDecimal;

public class MusicoRefuerzo extends Participante {
    private String instrumento;
    private BigDecimal pagoPorActuacion;

    // Constructor
    public MusicoRefuerzo(String nombreCompleto, String instrumento, BigDecimal pagoPorActuacion) {
        super(nombreCompleto);
        this.instrumento = instrumento;
        this.pagoPorActuacion = pagoPorActuacion;
    }

    // Getters y setters
    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public BigDecimal getPagoPorActuacion() {
        return pagoPorActuacion;
    }

    public void setPagoPorActuacion(BigDecimal pagoPorActuacion) {
        this.pagoPorActuacion = pagoPorActuacion;
    }

    // Implementación del método abstracto obtenerDetalles
    public String obtenerDetalles() {
        return "Músico Refuerzo: " + getNombreCompleto() + ", Instrumento: " + instrumento +
               ", Pago por Actuación: " + pagoPorActuacion + "€";
    }
}