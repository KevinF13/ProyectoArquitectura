/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.eis;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.com.gm.sga.domain.Gruposancion;

/**
 *
 * @author Asus
 */
@Stateless
public class GruposancionDaoImpl extends AbstractFacade<Gruposancion> implements GruposancionDao {

    @PersistenceContext(unitName = "PersonaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GruposancionDaoImpl() {
        super(Gruposancion.class);
    }
    
}
