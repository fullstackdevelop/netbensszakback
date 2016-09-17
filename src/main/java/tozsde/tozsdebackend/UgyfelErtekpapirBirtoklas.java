/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tozsde.tozsdebackend;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ádám
 */
@Entity
@Table(name = "ugyfel_ertekpapir_birtoklas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UgyfelErtekpapirBirtoklas.findAll", query = "SELECT u FROM UgyfelErtekpapirBirtoklas u"),
    @NamedQuery(name = "UgyfelErtekpapirBirtoklas.findById", query = "SELECT u FROM UgyfelErtekpapirBirtoklas u WHERE u.id = :id"),
    @NamedQuery(name = "UgyfelErtekpapirBirtoklas.findByErtekpapirId", query = "SELECT u FROM UgyfelErtekpapirBirtoklas u WHERE u.ertekpapirId = :ertekpapirId"),
    @NamedQuery(name = "UgyfelErtekpapirBirtoklas.findByUgyfelId", query = "SELECT u FROM UgyfelErtekpapirBirtoklas u WHERE u.ugyfelId = :ugyfelId"),
    @NamedQuery(name = "UgyfelErtekpapirBirtoklas.findByDarabszam", query = "SELECT u FROM UgyfelErtekpapirBirtoklas u WHERE u.darabszam = :darabszam")})
public class UgyfelErtekpapirBirtoklas implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ertekpapir_id")
    private BigInteger ertekpapirId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ugyfel_id")
    private BigInteger ugyfelId;
    @Column(name = "darabszam")
    private BigInteger darabszam;

    public UgyfelErtekpapirBirtoklas() {
    }

    public UgyfelErtekpapirBirtoklas(BigDecimal id) {
        this.id = id;
    }

    public UgyfelErtekpapirBirtoklas(BigDecimal id, BigInteger ertekpapirId, BigInteger ugyfelId) {
        this.id = id;
        this.ertekpapirId = ertekpapirId;
        this.ugyfelId = ugyfelId;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UgyfelErtekpapirBirtoklas)) {
            return false;
        }
        UgyfelErtekpapirBirtoklas other = (UgyfelErtekpapirBirtoklas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tozsde.tozsdebackend.UgyfelErtekpapirBirtoklas[ id=" + id + " ]";
    }
    
}
