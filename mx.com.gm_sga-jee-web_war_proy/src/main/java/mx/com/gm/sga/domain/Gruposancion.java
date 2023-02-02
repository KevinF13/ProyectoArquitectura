/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "gruposancion")
@NamedQueries({
    @NamedQuery(name = "Gruposancion.findAll", query = "SELECT g FROM Gruposancion g"),
    @NamedQuery(name = "Gruposancion.findByIdgrupo", query = "SELECT g FROM Gruposancion g WHERE g.idgrupo = :idgrupo"),
    @NamedQuery(name = "Gruposancion.findByNombregrupo", query = "SELECT g FROM Gruposancion g WHERE g.nombregrupo = :nombregrupo"),
    @NamedQuery(name = "Gruposancion.findByDescripcionart", query = "SELECT g FROM Gruposancion g WHERE g.descripcionart = :descripcionart")})
public class Gruposancion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDGRUPO")
    private Integer idgrupo;
    @Size(max = 50)
    @Column(name = "NOMBREGRUPO")
    private String nombregrupo;
    @Size(max = 100)
    @Column(name = "DESCRIPCIONART")
    private String descripcionart;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gruposancion")
    private List<Sancion> sancionList;

    public Gruposancion() {
    }

    public Gruposancion(Integer idgrupo) {
        this.idgrupo = idgrupo;
    }

    public Integer getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(Integer idgrupo) {
        this.idgrupo = idgrupo;
    }

    public String getNombregrupo() {
        return nombregrupo;
    }

    public void setNombregrupo(String nombregrupo) {
        this.nombregrupo = nombregrupo;
    }

    public String getDescripcionart() {
        return descripcionart;
    }

    public void setDescripcionart(String descripcionart) {
        this.descripcionart = descripcionart;
    }

    public List<Sancion> getSancionList() {
        return sancionList;
    }

    public void setSancionList(List<Sancion> sancionList) {
        this.sancionList = sancionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idgrupo != null ? idgrupo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gruposancion)) {
            return false;
        }
        Gruposancion other = (Gruposancion) object;
        if ((this.idgrupo == null && other.idgrupo != null) || (this.idgrupo != null && !this.idgrupo.equals(other.idgrupo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.gm.sga.domain.Gruposancion[ idgrupo=" + idgrupo + " ]";
    }
    
}
