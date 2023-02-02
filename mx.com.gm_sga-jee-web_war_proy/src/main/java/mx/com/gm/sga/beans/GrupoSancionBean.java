package mx.com.gm.sga.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.Gruposancion;
import mx.com.gm.sga.servicio.GruposancionService;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;

@Named("gruposancionBean")
@RequestScoped
public class GrupoSancionBean {

    @Inject
    private GruposancionService gruposancionService;

    private Gruposancion gruposancionSeleccionada;

    List<Gruposancion> gruposancions;

    public GrupoSancionBean() {
    }

    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        gruposancions = gruposancionService.listarGruposancions();
        gruposancionSeleccionada = new Gruposancion();
    }

    public void editListener(RowEditEvent event) {
        Gruposancion gruposancion = (Gruposancion) event.getObject();
        gruposancionService.modificarGruposancion(gruposancion);
    }

    public List<Gruposancion> getGruposancion() {
        return gruposancions;
    }

    public void setGruposancions(List<Gruposancion> gruposancions) {
        this.gruposancions = gruposancions;
    }

    public Gruposancion getGrupoSancionSeleccionada() {
        return gruposancionSeleccionada;
    }

    public void setGrupoSancionSeleccionada(Gruposancion gruposancionSeleccionada) {
        this.gruposancionSeleccionada = gruposancionSeleccionada;
    }

    public void reiniciarGruposancionSeleccionada() {
        this.gruposancionSeleccionada = new Gruposancion();
    }

    public void agregarGruposancion() {
        gruposancionService.registrarGruposancion(this.gruposancionSeleccionada);
        this.gruposancionSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public void eliminarGruposancion() {
        gruposancionService.eliminarGruposancion(this.gruposancionSeleccionada);
        this.gruposancionSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public GruposancionService getGruposancionService() {
        return gruposancionService;
    }

    public void setGruposancionService(GruposancionService gruposancionService) {
        this.gruposancionService = gruposancionService;
    }
}