/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.com.gm.sga.eis;

import java.util.List;
import javax.ejb.Local;
import mx.com.gm.sga.domain.Razon;

/**
 *
 * @author Asus
 */
@Local
public interface RazonDao {

    void create(Razon razon);

    void edit(Razon razon);

    void remove(Razon razon);

    Razon find(Object id);

    List<Razon> findAll();

    List<Razon> findRange(int[] range);

    int count();
    
}
