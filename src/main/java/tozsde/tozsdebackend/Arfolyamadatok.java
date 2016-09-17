/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tozsde.tozsdebackend;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ádám
 */
@Entity
@Table(name = "arfolyamadatok")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arfolyamadatok.findAll", query = "SELECT a FROM Arfolyamadatok a"),
    @NamedQuery(name = "Arfolyamadatok.findById", query = "SELECT a FROM Arfolyamadatok a WHERE a.id = :id"),
    @NamedQuery(name = "Arfolyamadatok.findByErtekpapirId", query = "SELECT a FROM Arfolyamadatok a WHERE a.ertekpapirId = :ertekpapirId"),
    @NamedQuery(name = "Arfolyamadatok.findByAr", query = "SELECT a FROM Arfolyamadatok a WHERE a.ar = :ar"),
    @NamedQuery(name = "Arfolyamadatok.findByDateTol", query = "SELECT a FROM Arfolyamadatok a WHERE a.dateTol = :dateTol"),
    @NamedQuery(name = "Arfolyamadatok.findByDateIg", query = "SELECT a FROM Arfolyamadatok a WHERE a.dateIg = :dateIg")})
public class Arfolyamadatok implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private BigDecimal id;
    @Column(name = "ertekpapir_id")
    private BigInteger ertekpapirId;
    @Column(name = "ar")
    private BigInteger ar;
    @Column(name = "date_tol")
    @Temporal(TemporalType.DATE)
    private Date dateTol;
    @Column(name = "date_ig")
    @Temporal(TemporalType.DATE)
    private Date dateIg;

    public Arfolyamadatok() {
    }

    public Arfolyamadatok(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getErtekpapirId() {
        return ertekpapirId;
    }

    public void setErtekpapirId(BigInteger ertekpapirId) {
        this.ertekpapirId = ertekpapirId;
    }

    public BigInteger getAr() {
        return ar;
    }

    public void setAr(BigInteger ar) {
        this.ar = ar;
    }

    public Date getDateTol() {
        return dateTol;
    }

    public void setDateTol(Date dateTol) {
        this.dateTol = dateTol;
    }

    public Date getDateIg() {
        return dateIg;
    }

    public void setDateIg(Date dateIg) {
        this.dateIg = dateIg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arfolyamadatok)) {
            return false;
        }
        Arfolyamadatok other = (Arfolyamadatok) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tozsde.tozsdebackend.Arfolyamadatok[ id=" + id + " ]";
    }
    
}
