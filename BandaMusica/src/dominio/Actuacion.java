package dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Actuacion{

    private LocalDate fecha;
    private List<Participante> participantes;

    // Constructor
    public Actuacion(LocalDate fecha) {
        this.fecha = fecha;
        this.participantes = new ArrayList<>();
    }

    // Getters y setters
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Participante> getParticipantes() {
        return participantes;
    }

    // Método para añadir un participante
    public void annadirParticipante(Participante participante) {
        if (participante != null) {
            participantes.add(participante);
        }
    }

    // Representación de la actuación
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Actuación del ").append(fecha).append(":\n");
        for (Participante p : participantes) {
            sb.append("  - ").append(p.obtenerDetalles()).append("\n");
        }
        return sb.toString();
    }
}
