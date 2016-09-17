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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ádám
 */
@Entity
@Table(name = "ertekpapir")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ertekpapir.findAll", query = "SELECT e FROM Ertekpapir e"),
    @NamedQuery(name = "Ertekpapir.findById", query = "SELECT e FROM Ertekpapir e WHERE e.id = :id"),
    @NamedQuery(name = "Ertekpapir.findByKibocsatasOrszag", query = "SELECT e FROM Ertekpapir e WHERE e.kibocsatasOrszag = :kibocsatasOrszag"),
    @NamedQuery(name = "Ertekpapir.findByTozsdeNev", query = "SELECT e FROM Ertekpapir e WHERE e.tozsdeNev = :tozsdeNev"),
    @NamedQuery(name = "Ertekpapir.findByNev", query = "SELECT e FROM Ertekpapir e WHERE e.nev = :nev"),
    @NamedQuery(name = "Ertekpapir.findByIsinCode", query = "SELECT e FROM Ertekpapir e WHERE e.isinCode = :isinCode"),
    @NamedQuery(name = "Ertekpapir.findByKategoria", query = "SELECT e FROM Ertekpapir e WHERE e.kategoria = :kategoria"),
    @NamedQuery(name = "Ertekpapir.findByLogikai1", query = "SELECT e FROM Ertekpapir e WHERE e.logikai1 = :logikai1"),
    @NamedQuery(name = "Ertekpapir.findByLogikai2", query = "SELECT e FROM Ertekpapir e WHERE e.logikai2 = :logikai2"),
    @NamedQuery(name = "Ertekpapir.findByLogikai3", query = "SELECT e FROM Ertekpapir e WHERE e.logikai3 = :logikai3"),
    @NamedQuery(name = "Ertekpapir.findByChar1", query = "SELECT e FROM Ertekpapir e WHERE e.char1 = :char1"),
    @NamedQuery(name = "Ertekpapir.findByChar2", query = "SELECT e FROM Ertekpapir e WHERE e.char2 = :char2"),
    @NamedQuery(name = "Ertekpapir.findByChar3", query = "SELECT e FROM Ertekpapir e WHERE e.char3 = :char3")})
public class Ertekpapir implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private BigDecimal id;
    @Size(max = 64)
    @Column(name = "kibocsatas_orszag")
    private String kibocsatasOrszag;
    @Size(max = 64)
    @Column(name = "tozsde_nev")
    private String tozsdeNev;
    @Size(max = 64)
    @Column(name = "nev")
    private String nev;
    @Column(name = "isin_code")
    private BigInteger isinCode;
    @Size(max = 64)
    @Column(name = "kategoria")
    private String kategoria;
    @Column(name = "logikai1")
    private BigInteger logikai1;
    @Column(name = "logikai2")
    private BigInteger logikai2;
    @Column(name = "logikai3")
    private BigInteger logikai3;
    @Size(max = 64)
    @Column(name = "char1")
    private String char1;
    @Size(max = 64)
    @Column(name = "char2")
    private String char2;
    @Size(max = 64)
    @Column(name = "char3")
    private String char3;

    public Ertekpapir() {
    }

    public Ertekpapir(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getKibocsatasOrszag() {
        return kibocsatasOrszag;
    }

    public void setKibocsatasOrszag(String kibocsatasOrszag) {
        this.kibocsatasOrszag = kibocsatasOrszag;
    }

    public String getTozsdeNev() {
        return tozsdeNev;
    }

    public void setTozsdeNev(String tozsdeNev) {
        this.tozsdeNev = tozsdeNev;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public BigInteger getIsinCode() {
        return isinCode;
    }

    public void setIsinCode(BigInteger isinCode) {
        this.isinCode = isinCode;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public BigInteger getLogikai1() {
        return logikai1;
    }

    public void setLogikai1(BigInteger logikai1) {
        this.logikai1 = logikai1;
    }

    public BigInteger getLogikai2() {
        return logikai2;
    }

    public void setLogikai2(BigInteger logikai2) {
        this.logikai2 = logikai2;
    }

    public BigInteger getLogikai3() {
        return logikai3;
    }

    public void setLogikai3(BigInteger logikai3) {
        this.logikai3 = logikai3;
    }

    public String getChar1() {
        return char1;
    }

    public void setChar1(String char1) {
        this.char1 = char1;
    }

    public String getChar2() {
        return char2;
    }

    public void setChar2(String char2) {
        this.char2 = char2;
    }

    public String getChar3() {
        return char3;
    }

    public void setChar3(String char3) {
        this.char3 = char3;
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
        if (!(object instanceof Ertekpapir)) {
            return false;
        }
        Ertekpapir other = (Ertekpapir) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tozsde.tozsdebackend.Ertekpapir[ id=" + id + " ]";
    }
    
}
