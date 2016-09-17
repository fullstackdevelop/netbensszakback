/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tozsde.tozsdebackend;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ádám
 */
@Entity
@Table(name = "ajanlattetel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ajanlattetel.findAll", query = "SELECT a FROM Ajanlattetel a"),
    @NamedQuery(name = "Ajanlattetel.findById", query = "SELECT a FROM Ajanlattetel a WHERE a.id = :id"),
    @NamedQuery(name = "Ajanlattetel.findByErtekpapirId", query = "SELECT a FROM Ajanlattetel a WHERE a.ertekpapirId = :ertekpapirId"),
    @NamedQuery(name = "Ajanlattetel.findByUgyfelId", query = "SELECT a FROM Ajanlattetel a WHERE a.ugyfelId = :ugyfelId"),
    @NamedQuery(name = "Ajanlattetel.findByDarabszam", query = "SELECT a FROM Ajanlattetel a WHERE a.darabszam = :darabszam"),
    @NamedQuery(name = "Ajanlattetel.findByAjanlatiAr", query = "SELECT a FROM Ajanlattetel a WHERE a.ajanlatiAr = :ajanlatiAr")})
public class Ajanlattetel implements Serializable {

    @Column(name = "szandek")
    private BigInteger szandek;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "ertekpapir_id")
    private BigInteger ertekpapirId;
    @Column(name = "ugyfel_id")
    private BigInteger ugyfelId;
    @Column(name = "darabszam")
    private BigInteger darabszam;
    @Column(name = "ajanlati_ar")
    private BigInteger ajanlatiAr;

    public Ajanlattetel() {
    }

    public Ajanlattetel(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigInteger getErtekpapirId() {
        return ertekpapirId;
    }

    public void setErtekpapirId(BigInteger ertekpapirId) {
        this.ertekpapirId = ertekpapirId;
    }

    public BigInteger getUgyfelId() {
        return ugyfelId;
    }

    public void setUgyfelId(BigInteger ugyfelId) {
        this.ugyfelId = ugyfelId;
    }

    public BigInteger getDarabszam() {
        return darabszam;
    }

    public void setDarabszam(BigInteger darabszam) {
        this.darabszam = darabszam;
    }

    public BigInteger getAjanlatiAr() {
        return ajanlatiAr;
    }

    public void setAjanlatiAr(BigInteger ajanlatiAr) {
        this.ajanlatiAr = ajanlatiAr;
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
        if (!(object instanceof Ajanlattetel)) {
            return false;
        }
        Ajanlattetel other = (Ajanlattetel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tozsde.tozsdebackend.Ajanlattetel[ id=" + id + " ]";
    }

    public BigInteger getSzandek() {
        return szandek;
    }

    public void setSzandek(BigInteger szandek) {
        this.szandek = szandek;
    }
    
}
