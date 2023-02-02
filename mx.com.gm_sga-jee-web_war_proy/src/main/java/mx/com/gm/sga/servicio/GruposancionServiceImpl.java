package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Gruposancion;
import mx.com.gm.sga.eis.GruposancionDao;

@Stateless
public class GruposancionServiceImpl implements GruposancionService{
	
	@Inject
	private GruposancionDao gruposancionDao;

        @Override
	public List<Gruposancion> listarGruposancions() {
		return gruposancionDao.findAll();
	}

        @Override
	public Gruposancion encontrarGruposancionPorId(Gruposancion gruposancion) {
		return gruposancionDao.find(gruposancion);
	}

        /*@Override
	public Gruposancion encontrarGruposancionPorNombre(Gruposancion gruposancion) {
		return gruposancionDao.findGruposancionByNombre(gruposancion);
	}*/

        @Override
	public void registrarGruposancion(Gruposancion gruposancion) {
		//montón de código
                gruposancionDao.create(gruposancion);
	}

        @Override
	public void modificarGruposancion(Gruposancion gruposancion) {
		gruposancionDao.edit(gruposancion);
	}

        @Override
	public void eliminarGruposancion(Gruposancion gruposancion) {
		gruposancionDao.remove(gruposancion);
	}
    
}