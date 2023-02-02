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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
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
@Table(name = "sancion")
@NamedQueries({
    @NamedQuery(name = "Sancion.findAll", query = "SELECT s FROM Sancion s"),
    @NamedQuery(name = "Sancion.findByIdsancion", query = "SELECT s FROM Sancion s WHERE s.idsancion = :idsancion"),
    @NamedQuery(name = "Sancion.findByArticulosancion", query = "SELECT s FROM Sancion s WHERE s.articulosancion = :articulosancion"),
    @NamedQuery(name = "Sancion.findByNombresancion", query = "SELECT s FROM Sancion s WHERE s.nombresancion = :nombresancion")})
public class Sancion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSANCION")
    private Integer idsancion;
    @Size(max = 10)
    @Column(name = "ARTICULOSANCION")
    private String articulosancion;
    @Size(max = 100)
    @Column(name = "NOMBRESANCION")
    private String nombresancion;
    @Lob
    @Size(max = 65535)
    @Column(name = "DESCRIPCIONSANCION")
    private String descripcionsancion;
    @JoinColumn(name = "IDGRUPO", referencedColumnName = "IDGRUPO")
    @ManyToOne(optional = false)
    private Gruposancion gruposancion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sancion")
    private List<Razon> razonList;

    public Sancion() {
    }

    public Sancion(Integer idsancion) {
        this.idsancion = idsancion;
    }

    public Integer getIdsancion() {
        return idsancion;
    }

    public void setIdsancion(Integer idsancion) {
        this.idsancion = idsancion;
    }

    public String getArticulosancion() {
        return articulosancion;
    }

    public void setArticulosancion(String articulosancion) {
        this.articulosancion = articulosancion;
    }

    public String getNombresancion() {
        return nombresancion;
    }

    public void setNombresancion(String nombresancion) {
        this.nombresancion = nombresancion;
    }

    public String getDescripcionsancion() {
        return descripcionsancion;
    }

    public void setDescripcionsancion(String descripcionsancion) {
        this.descripcionsancion = descripcionsancion;
    }

    public Gruposancion getGruposancion() {
        return gruposancion;
    }

    public void setGruposancion(Gruposancion gruposancion) {
        this.gruposancion = gruposancion;
    }

    public List<Razon> getRazonList() {
        return razonList;
    }

    public void setRazonList(List<Razon> razonList) {
        this.razonList = razonList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsancion != null ? idsancion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sancion)) {
            return false;
        }
        Sancion other = (Sancion) object;
        if ((this.idsancion == null && other.idsancion != null) || (this.idsancion != null && !this.idsancion.equals(other.idsancion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.com.gm.sga.domain.Sancion[ idsancion=" + idsancion + " ]";
    }
    
}
