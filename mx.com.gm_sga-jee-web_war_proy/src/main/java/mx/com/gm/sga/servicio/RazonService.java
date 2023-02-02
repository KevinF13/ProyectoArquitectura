package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Razon;

@Local
public interface RazonService {

    public List<Razon> listarRazons();

    public Razon encontrarRazonPorId(Razon razon);

    public Razon encontrarRazonPorNombre(Razon razon);

    public void registrarRazon(Razon razon);

    public void modificarRazon(Razon razon);

    public void eliminarRazon(Razon razon);
}