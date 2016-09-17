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
@Table(name = "ugyfel_egyenleg")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UgyfelEgyenleg.findAll", query = "SELECT u FROM UgyfelEgyenleg u"),
    @NamedQuery(name = "UgyfelEgyenleg.findById", query = "SELECT u FROM UgyfelEgyenleg u WHERE u.id = :id"),
    @NamedQuery(name = "UgyfelEgyenleg.findByUgyfelId", query = "SELECT u FROM UgyfelEgyenleg u WHERE u.ugyfelId = :ugyfelId"),
    @NamedQuery(name = "UgyfelEgyenleg.findByDatum", query = "SELECT u FROM UgyfelEgyenleg u WHERE u.datum = :datum"),
    @NamedQuery(name = "UgyfelEgyenleg.findByEgyenleg", query = "SELECT u FROM UgyfelEgyenleg u WHERE u.egyenleg = :egyenleg")})
public class UgyfelEgyenleg implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private BigDecimal id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ugyfel_id")
    private BigInteger ugyfelId;
    @Column(name = "datum")
    @Temporal(TemporalType.DATE)
    private Date datum;
    @Column(name = "egyenleg")
    private BigInteger egyenleg;

    public UgyfelEgyenleg() {
    }

    public UgyfelEgyenleg(BigDecimal id) {
        this.id = id;
    }

    public UgyfelEgyenleg(BigDecimal id, BigInteger ugyfelId) {
        this.id = id;
        this.ugyfelId = ugyfelId;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getUgyfelId() {
        return ugyfelId;
    }

    public void setUgyfelId(BigInteger ugyfelId) {
        this.ugyfelId = ugyfelId;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public BigInteger getEgyenleg() {
        return egyenleg;
    }

    public void setEgyenleg(BigInteger egyenleg) {
        this.egyenleg = egyenleg;
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
        if (!(object instanceof UgyfelEgyenleg)) {
            return false;
        }
        UgyfelEgyenleg other = (UgyfelEgyenleg) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tozsde.tozsdebackend.UgyfelEgyenleg[ id=" + id + " ]";
    }
    
}
