/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.eis;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Sancion;

/**
 *
 * @author Asus
 */
@Local
public interface SancionDao {

    void create(Sancion sancion);

    void edit(Sancion sancion);

    void remove(Sancion sancion);

    Sancion find(Object id);

    List<Sancion> findAll();

    List<Sancion> findRange(int[] range);

    int count();
    
}
