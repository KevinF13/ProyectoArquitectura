package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Sancion;
import mx.com.gm.sga.eis.SancionDao;

@Stateless
public class SancionServiceImpl implements  SancionService {
	
	@Inject
	private SancionDao sancionDao;

        @Override
	public List<Sancion> listarSancions() {
		return sancionDao.findAll();
	}

        @Override
	public Sancion encontrarSancionPorId(Sancion sancion) {
		return sancionDao.find(sancion);
	}

        /*@Override
	public Razon encontrarRazonPorNombre(Razon Razon) {
		return RazonDao.findRazonByNombre(Razon);
	}*/

        @Override
	public void registrarSancion(Sancion sancion) {
		//montón de código
                
                
                sancionDao.create(sancion);
	}

        @Override
	public void modificarSancion(Sancion sancion) {
		sancionDao.edit(sancion);
	}

        @Override
	public void eliminarSancion(Sancion sancion) {
		sancionDao.remove(sancion);
	}

}