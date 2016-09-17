/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tozsde.tozsdebackend;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ádám
 */
@Entity
@Table(name = "arfolyamgrafikon")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arfolyamgrafikon.findAll", query = "SELECT a FROM Arfolyamgrafikon a"),
    @NamedQuery(name = "Arfolyamgrafikon.findById", query = "SELECT a FROM Arfolyamgrafikon a WHERE a.id = :id"),
    @NamedQuery(name = "Arfolyamgrafikon.findByDatum", query = "SELECT a FROM Arfolyamgrafikon a WHERE a.datum = :datum"),
    @NamedQuery(name = "Arfolyamgrafikon.findByArfolyam", query = "SELECT a FROM Arfolyamgrafikon a WHERE a.arfolyam = :arfolyam"),
    @NamedQuery(name = "Arfolyamgrafikon.findByErtekpapirId", query = "SELECT a FROM Arfolyamgrafikon a WHERE a.ertekpapirId = :ertekpapirId")})
public class Arfolyamgrafikon implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "datum")
    @Temporal(TemporalType.DATE)
    private Date datum;
    @Column(name = "arfolyam")
    private BigInteger arfolyam;
    @Column(name = "ertekpapir_id")
    private BigInteger ertekpapirId;

    public Arfolyamgrafikon() {
    }

    public Arfolyamgrafikon(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public BigInteger getArfolyam() {
        return arfolyam;
    }

    public void setArfolyam(BigInteger arfolyam) {
        this.arfolyam = arfolyam;
    }

    public BigInteger getErtekpapirId() {
        return ertekpapirId;
    }

    public void setErtekpapirId(BigInteger ertekpapirId) {
        this.ertekpapirId = ertekpapirId;
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
        if (!(object instanceof Arfolyamgrafikon)) {
            return false;
        }
        Arfolyamgrafikon other = (Arfolyamgrafikon) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tozsde.tozsdebackend.Arfolyamgrafikon[ id=" + id + " ]";
    }
    
}
