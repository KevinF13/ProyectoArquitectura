package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Gruposancion;

@Local
public interface GruposancionService {

    public List<Gruposancion> listarGruposancions();

    public Gruposancion encontrarGruposancionPorId(Gruposancion gruposancion);

    public Gruposancion encontrarGruposancionPorNombre(Gruposancion gruposancion);

    public void registrarGruposancion(Gruposancion gruposancion);

    public void modificarGruposancion(Gruposancion gruposancion);

    public void eliminarGruposancion(Gruposancion gruposancion);
}