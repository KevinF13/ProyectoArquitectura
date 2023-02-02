/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.sga.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "razon")
@NamedQueries({
    @NamedQuery(name = "Razon.findAll", query = "SELECT r FROM Razon r"),
    @NamedQuery(name = "Razon.findByIdrazon", query = "SELECT r FROM Razon r WHERE r.idrazon = :idrazon"),
    @NamedQuery(name = "Razon.findByNombrerazon", query = "SELECT r FROM Razon r WHERE r.nombrerazon = :nombrerazon"),
    @NamedQuery(name = "Razon.findByDescripcionrazon", query = "SELECT r FROM Razon r WHERE r.descripcionrazon = :descripcionrazon")})
public class Razon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDRAZON")
    private Integer idrazon;
    @Size(max = 100)
    @Column(name = "NOMBRERAZON")
    private String nombrerazon;
    @Size(max = 300)
    @Column(name = "DESCRIPCIONRAZON")
    private String descripcionrazon;
    @JoinColumn(name = "IDSANCION", referencedColumnName = "IDSANCION")
    @ManyToOne(optional = false)
    private Sancion sancion;

    public Razon() {
    }

    public Razon(Integer idrazon) {
        this.idrazon = idrazon;
    }

    public Integer getIdrazon() {
        return idrazon;
    }

    public void setIdrazon(Integer idrazon) {
        this.idrazon = idrazon;
    }

    public String getNombrerazon() {
        return nombrerazon;
    }

    public void setNombrerazon(String nombrerazon) {
        this.nombrerazon = nombrerazon;
    }

    public String getDescripcionrazon() {
        return descripcionrazon;
    }

    public void setDescripcionrazon(String descripcionrazon) {
        this.descripcionrazon = descripcionrazon;
    }

    public Sancion getSancion() {
        return sancion;
    }

    public void setSancion(Sancion sancion) {
        this.sancion = sancion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idrazon != null ? idrazon.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Razon)) {
            return false;
        }
        Razon other = (Razon) object;
        if ((this.idrazon == null && other.idrazon != null) || (this.idrazon != null && !this.idrazon.equals(other.idrazon))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.gm.sga.domain.Razon[ idrazon=" + idrazon + " ]";
    }
    
}
