package dominio;
import java.util.ArrayList;
import java.util.List;

public class BandaMusica {
    private String nombre;
    private List<Actuacion> actuaciones;

    public BandaMusica(String nombre){
        this.nombre = nombre;
        this.actuaciones = new ArrayList<>();
    }

    public void annadirActuacion(Actuacion actuacion) {
        if (actuacion != null) {
            actuaciones.add(actuacion);
        }
    }

public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(nombre.toUpperCase()).append("\n");
    for (Actuacion actuacion : actuaciones) {
        sb.append("Fecha de actuación: ")
          .append(actuacion.getFecha().format(java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy")))
          .append("\n");

        for (Participante participante : actuacion.getParticipantes()) {
            if (participante instanceof Director) {
                sb.append(participante.getNombreCompleto()).append(", director\n");
            } else if (participante instanceof MusicoSocio) {
                MusicoSocio musico = (MusicoSocio) participante;
                sb.append(musico.getNombreCompleto())
                  .append(", ")
                  .append(musico.getInstrumento())
                  .append(", número de socio: ")
                  .append(musico.getNumeroSocio())
                  .append("\n");
            } else if (participante instanceof MusicoRefuerzo) {
                MusicoRefuerzo musico = (MusicoRefuerzo) participante;
                sb.append(musico.getNombreCompleto())
                  .append(", ")
                  .append(musico.getInstrumento())
                  .append(", ")
                  .append(musico.getPagoPorActuacion().setScale(2, java.math.RoundingMode.HALF_UP))
                  .append(" $\n");
            }
        }
    }

    return sb.toString();
}
}