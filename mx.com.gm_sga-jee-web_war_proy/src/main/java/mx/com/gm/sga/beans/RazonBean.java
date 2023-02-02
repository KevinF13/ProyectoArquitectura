package mx.com.gm.sga.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import mx.com.gm.sga.domain.Razon;
import mx.com.gm.sga.servicio.RazonService;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;

@Named("gruposancionBean")
@RequestScoped
public class RazonBean {

    @Inject
    private RazonService razonService;

    private Razon razonSeleccionada;

    List<Razon> razons;

    public RazonBean() {
    }

    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        razons = razonService.listarRazons();
        razonSeleccionada = new Razon();
    }

    public void editListener(RowEditEvent event) {
        Razon razon = (Razon) event.getObject();
        razonService.modificarRazon(razon);
    }

    public List<Razon> getRazon() {
        return razons;
    }

    public void setRazons(List<Razon> razons) {
        this.razons = razons;
    }

    public Razon getRazonSeleccionada() {
        return razonSeleccionada;
    }

    public void setRazonSeleccionada(Razon razonSeleccionada) {
        this.razonSeleccionada = razonSeleccionada;
    }

    public void reiniciarRazonSeleccionada() {
        this.razonSeleccionada = new Razon();
    }

    public void agregarRazon() {
        razonService.registrarRazon(this.razonSeleccionada);
        this.razonSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public void eliminarRazon() {
        razonService.eliminarRazon(this.razonSeleccionada);
        this.razonSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public RazonService getRazonService() {
        return razonService;
    }

    public void setRazonService(RazonService razonService) {
        this.razonService = razonService;
    }
}