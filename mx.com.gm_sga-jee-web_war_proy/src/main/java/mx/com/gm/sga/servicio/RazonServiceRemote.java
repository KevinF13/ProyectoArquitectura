package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Remote;
import mx.com.gm.sga.domain.Razon;

@Remote
public interface RazonServiceRemote {

    public List<Razon> listarRazons();

    public Razon encontrarRazonPorId(Razon razon);

    //public Razon encontrarPersonaPorEmail(Razon persona);

    public void registrarRazon(Razon razon);

    public void modificarRazon(Razon razon);

    public void eliminarRazon(Razon razon);
}