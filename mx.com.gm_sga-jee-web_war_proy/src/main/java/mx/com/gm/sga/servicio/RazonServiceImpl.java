package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Razon;
import mx.com.gm.sga.eis.RazonDao;

@Stateless
public class RazonServiceImpl implements  RazonService {
	
	@Inject
	private RazonDao razonDao;

        @Override
	public List<Razon> listarRazons() {
		return razonDao.findAll();
	}

        @Override
	public Razon encontrarRazonPorId(Razon razon) {
		return razonDao.find(razon);
	}

        /*@Override
	public Razon encontrarRazonPorNombre(Razon Razon) {
		return RazonDao.findRazonByNombre(Razon);
	}*/

        @Override
	public void registrarRazon(Razon razon) {
		//montón de código
                
                
                razonDao.create(razon);
	}

        @Override
	public void modificarRazon(Razon razon) {
		razonDao.edit(razon);
	}

        @Override
	public void eliminarRazon(Razon razon) {
		razonDao.remove(razon);
	}
    
}