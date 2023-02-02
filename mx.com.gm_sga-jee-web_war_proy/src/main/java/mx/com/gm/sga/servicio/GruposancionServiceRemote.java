package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.Gruposancion;

@Remote
public interface GruposancionServiceRemote {

    public List<Gruposancion> listarGruposancions();

    public Gruposancion encontrarGruposancionPorId(Gruposancion gruposancion);

    public Gruposancion encontrarGruposancionPorNombre(Gruposancion gruposancion);

    public void registrarGruposancion(Gruposancion gruposancion);

    public void modificarGruposancion(Gruposancion gruposancion);

    public void eliminarGruposancion(Gruposancion gruposancion);
}