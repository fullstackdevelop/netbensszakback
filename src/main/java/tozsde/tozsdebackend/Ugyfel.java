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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ádám
 */
@Entity
@Table(name = "ugyfel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ugyfel.findAll", query = "SELECT u FROM Ugyfel u"),
    @NamedQuery(name = "Ugyfel.findById", query = "SELECT u FROM Ugyfel u WHERE u.id = :id"),
    @NamedQuery(name = "Ugyfel.findByNev", query = "SELECT u FROM Ugyfel u WHERE u.nev = :nev"),
    @NamedQuery(name = "Ugyfel.findByVaros", query = "SELECT u FROM Ugyfel u WHERE u.varos = :varos"),
    @NamedQuery(name = "Ugyfel.findByOrszag", query = "SELECT u FROM Ugyfel u WHERE u.orszag = :orszag"),
    @NamedQuery(name = "Ugyfel.findByHelyseg", query = "SELECT u FROM Ugyfel u WHERE u.helyseg = :helyseg"),
    @NamedQuery(name = "Ugyfel.findByIranyitoszam", query = "SELECT u FROM Ugyfel u WHERE u.iranyitoszam = :iranyitoszam"),
    @NamedQuery(name = "Ugyfel.findByUtcaHazszam", query = "SELECT u FROM Ugyfel u WHERE u.utcaHazszam = :utcaHazszam"),
    @NamedQuery(name = "Ugyfel.findByTelefonszam", query = "SELECT u FROM Ugyfel u WHERE u.telefonszam = :telefonszam"),
    @NamedQuery(name = "Ugyfel.findBySzemIgSzam", query = "SELECT u FROM Ugyfel u WHERE u.szemIgSzam = :szemIgSzam"),
    @NamedQuery(name = "Ugyfel.findByStatusz", query = "SELECT u FROM Ugyfel u WHERE u.statusz = :statusz"),
    @NamedQuery(name = "Ugyfel.findByEMail", query = "SELECT u FROM Ugyfel u WHERE u.eMail = :eMail"),
    @NamedQuery(name = "Ugyfel.findByAnyjaNeve", query = "SELECT u FROM Ugyfel u WHERE u.anyjaNeve = :anyjaNeve"),
    @NamedQuery(name = "Ugyfel.findBySzuletesiIdo", query = "SELECT u FROM Ugyfel u WHERE u.szuletesiIdo = :szuletesiIdo"),
    @NamedQuery(name = "Ugyfel.findByAdoszam", query = "SELECT u FROM Ugyfel u WHERE u.adoszam = :adoszam"),
    @NamedQuery(name = "Ugyfel.findByUgyfelJellege", query = "SELECT u FROM Ugyfel u WHERE u.ugyfelJellege = :ugyfelJellege"),
    @NamedQuery(name = "Ugyfel.findByModifyUid", query = "SELECT u FROM Ugyfel u WHERE u.modifyUid = :modifyUid"),
    @NamedQuery(name = "Ugyfel.findByModifyDate", query = "SELECT u FROM Ugyfel u WHERE u.modifyDate = :modifyDate"),
    @NamedQuery(name = "Ugyfel.findBySzuletesiHely", query = "SELECT u FROM Ugyfel u WHERE u.szuletesiHely = :szuletesiHely"),
    @NamedQuery(name = "Ugyfel.findByLeanykoriNev", query = "SELECT u FROM Ugyfel u WHERE u.leanykoriNev = :leanykoriNev"),
    @NamedQuery(name = "Ugyfel.findByCegTelephely", query = "SELECT u FROM Ugyfel u WHERE u.cegTelephely = :cegTelephely"),
    @NamedQuery(name = "Ugyfel.findByCegNev", query = "SELECT u FROM Ugyfel u WHERE u.cegNev = :cegNev"),
    @NamedQuery(name = "Ugyfel.findByAllamp", query = "SELECT u FROM Ugyfel u WHERE u.allamp = :allamp"),
    @NamedQuery(name = "Ugyfel.findByLogikai1", query = "SELECT u FROM Ugyfel u WHERE u.logikai1 = :logikai1"),
    @NamedQuery(name = "Ugyfel.findByLogikai2", query = "SELECT u FROM Ugyfel u WHERE u.logikai2 = :logikai2"),
    @NamedQuery(name = "Ugyfel.findByLogikai3", query = "SELECT u FROM Ugyfel u WHERE u.logikai3 = :logikai3"),
    @NamedQuery(name = "Ugyfel.findByLogikai4", query = "SELECT u FROM Ugyfel u WHERE u.logikai4 = :logikai4"),
    @NamedQuery(name = "Ugyfel.findByLogikai5", query = "SELECT u FROM Ugyfel u WHERE u.logikai5 = :logikai5"),
    @NamedQuery(name = "Ugyfel.findByLogikai6", query = "SELECT u FROM Ugyfel u WHERE u.logikai6 = :logikai6"),
    @NamedQuery(name = "Ugyfel.findByLogikai7", query = "SELECT u FROM Ugyfel u WHERE u.logikai7 = :logikai7"),
    @NamedQuery(name = "Ugyfel.findByLogikai8", query = "SELECT u FROM Ugyfel u WHERE u.logikai8 = :logikai8"),
    @NamedQuery(name = "Ugyfel.findByLogikai9", query = "SELECT u FROM Ugyfel u WHERE u.logikai9 = :logikai9"),
    @NamedQuery(name = "Ugyfel.findByLogikai10", query = "SELECT u FROM Ugyfel u WHERE u.logikai10 = :logikai10"),
    @NamedQuery(name = "Ugyfel.findByCharacter1", query = "SELECT u FROM Ugyfel u WHERE u.character1 = :character1"),
    @NamedQuery(name = "Ugyfel.findByCharacter2", query = "SELECT u FROM Ugyfel u WHERE u.character2 = :character2"),
    @NamedQuery(name = "Ugyfel.findByCharacter3", query = "SELECT u FROM Ugyfel u WHERE u.character3 = :character3"),
    @NamedQuery(name = "Ugyfel.findByCharacter4", query = "SELECT u FROM Ugyfel u WHERE u.character4 = :character4"),
    @NamedQuery(name = "Ugyfel.findByCharacter5", query = "SELECT u FROM Ugyfel u WHERE u.character5 = :character5")})
public class Ugyfel implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    //@NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private BigDecimal id;
    @Size(max = 80)
    @Column(name = "nev")
    private String nev;
    @Size(max = 40)
    @Column(name = "varos")
    private String varos;
    @Size(max = 64)
    @Column(name = "orszag")
    private String orszag;
    @Size(max = 64)
    @Column(name = "helyseg")
    private String helyseg;
    @Column(name = "iranyitoszam")
    private BigInteger iranyitoszam;
    @Size(max = 80)
    @Column(name = "utca_hazszam")
    private String utcaHazszam;
    @Size(max = 30)
    @Column(name = "telefonszam")
    private String telefonszam;
    @Size(max = 20)
    @Column(name = "szem_ig_szam")
    private String szemIgSzam;
    @Column(name = "statusz")
    private BigInteger statusz;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 60)
    @Column(name = "e_mail")
    private String eMail;
    @Size(max = 50)
    @Column(name = "anyja_neve")
    private String anyjaNeve;
    @Column(name = "szuletesi_ido")
    @Temporal(TemporalType.DATE)
    private Date szuletesiIdo;
    @Size(max = 64)
    @Column(name = "adoszam")
    private String adoszam;
    @Size(max = 64)
    @Column(name = "ugyfel_jellege")
    private String ugyfelJellege;
    @Column(name = "modify_uid")
    private BigInteger modifyUid;
    @Column(name = "modify_date")
    @Temporal(TemporalType.DATE)
    private Date modifyDate;
    @Size(max = 64)
    @Column(name = "szuletesi_hely")
    private String szuletesiHely;
    @Size(max = 64)
    @Column(name = "leanykori_nev")
    private String leanykoriNev;
    @Size(max = 80)
    @Column(name = "ceg_telephely")
    private String cegTelephely;
    @Size(max = 64)
    @Column(name = "ceg_nev")
    private String cegNev;
    @Size(max = 64)
    @Column(name = "allamp")
    private String allamp;
    @Column(name = "logikai1")
    private BigInteger logikai1;
    @Column(name = "logikai2")
    private BigInteger logikai2;
    @Column(name = "logikai3")
    private BigInteger logikai3;
    @Column(name = "logikai4")
    private BigInteger logikai4;
    @Column(name = "logikai5")
    private BigInteger logikai5;
    @Column(name = "logikai6")
    private BigInteger logikai6;
    @Column(name = "logikai7")
    private BigInteger logikai7;
    @Column(name = "logikai8")
    private BigInteger logikai8;
    @Column(name = "logikai9")
    private BigInteger logikai9;
    @Column(name = "logikai10")
    private BigInteger logikai10;
    @Size(max = 64)
    @Column(name = "character1")
    private String character1;
    @Size(max = 64)
    @Column(name = "character2")
    private String character2;
    @Size(max = 64)
    @Column(name = "character3")
    private String character3;
    @Size(max = 64)
    @Column(name = "character4")
    private String character4;
    @Size(max = 64)
    @Column(name = "character5")
    private String character5;

    public Ugyfel() {
    }

    public Ugyfel(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getVaros() {
        return varos;
    }

    public void setVaros(String varos) {
        this.varos = varos;
    }

    public String getOrszag() {
        return orszag;
    }

    public void setOrszag(String orszag) {
        this.orszag = orszag;
    }

    public String getHelyseg() {
        return helyseg;
    }

    public void setHelyseg(String helyseg) {
        this.helyseg = helyseg;
    }

    public BigInteger getIranyitoszam() {
        return iranyitoszam;
    }

    public void setIranyitoszam(BigInteger iranyitoszam) {
        this.iranyitoszam = iranyitoszam;
    }

    public String getUtcaHazszam() {
        return utcaHazszam;
    }

    public void setUtcaHazszam(String utcaHazszam) {
        this.utcaHazszam = utcaHazszam;
    }

    public String getTelefonszam() {
        return telefonszam;
    }

    public void setTelefonszam(String telefonszam) {
        this.telefonszam = telefonszam;
    }

    public String getSzemIgSzam() {
        return szemIgSzam;
    }

    public void setSzemIgSzam(String szemIgSzam) {
        this.szemIgSzam = szemIgSzam;
    }

    public BigInteger getStatusz() {
        return statusz;
    }

    public void setStatusz(BigInteger statusz) {
        this.statusz = statusz;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAnyjaNeve() {
        return anyjaNeve;
    }

    public void setAnyjaNeve(String anyjaNeve) {
        this.anyjaNeve = anyjaNeve;
    }

    public Date getSzuletesiIdo() {
        return szuletesiIdo;
    }

    public void setSzuletesiIdo(Date szuletesiIdo) {
        this.szuletesiIdo = szuletesiIdo;
    }

    public String getAdoszam() {
        return adoszam;
    }

    public void setAdoszam(String adoszam) {
        this.adoszam = adoszam;
    }

    public String getUgyfelJellege() {
        return ugyfelJellege;
    }

    public void setUgyfelJellege(String ugyfelJellege) {
        this.ugyfelJellege = ugyfelJellege;
    }

    public BigInteger getModifyUid() {
        return modifyUid;
    }

    public void setModifyUid(BigInteger modifyUid) {
        this.modifyUid = modifyUid;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getSzuletesiHely() {
        return szuletesiHely;
    }

    public void setSzuletesiHely(String szuletesiHely) {
        this.szuletesiHely = szuletesiHely;
    }

    public String getLeanykoriNev() {
        return leanykoriNev;
    }

    public void setLeanykoriNev(String leanykoriNev) {
        this.leanykoriNev = leanykoriNev;
    }

    public String getCegTelephely() {
        return cegTelephely;
    }

    public void setCegTelephely(String cegTelephely) {
        this.cegTelephely = cegTelephely;
    }

    public String getCegNev() {
        return cegNev;
    }

    public void setCegNev(String cegNev) {
        this.cegNev = cegNev;
    }

    public String getAllamp() {
        return allamp;
    }

    public void setAllamp(String allamp) {
        this.allamp = allamp;
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

    public BigInteger getLogikai4() {
        return logikai4;
    }

    public void setLogikai4(BigInteger logikai4) {
        this.logikai4 = logikai4;
    }

    public BigInteger getLogikai5() {
        return logikai5;
    }

    public void setLogikai5(BigInteger logikai5) {
        this.logikai5 = logikai5;
    }

    public BigInteger getLogikai6() {
        return logikai6;
    }

    public void setLogikai6(BigInteger logikai6) {
        this.logikai6 = logikai6;
    }

    public BigInteger getLogikai7() {
        return logikai7;
    }

    public void setLogikai7(BigInteger logikai7) {
        this.logikai7 = logikai7;
    }

    public BigInteger getLogikai8() {
        return logikai8;
    }

    public void setLogikai8(BigInteger logikai8) {
        this.logikai8 = logikai8;
    }

    public BigInteger getLogikai9() {
        return logikai9;
    }

    public void setLogikai9(BigInteger logikai9) {
        this.logikai9 = logikai9;
    }

    public BigInteger getLogikai10() {
        return logikai10;
    }

    public void setLogikai10(BigInteger logikai10) {
        this.logikai10 = logikai10;
    }

    public String getCharacter1() {
        return character1;
    }

    public void setCharacter1(String character1) {
        this.character1 = character1;
    }

    public String getCharacter2() {
        return character2;
    }

    public void setCharacter2(String character2) {
        this.character2 = character2;
    }

    public String getCharacter3() {
        return character3;
    }

    public void setCharacter3(String character3) {
        this.character3 = character3;
    }

    public String getCharacter4() {
        return character4;
    }

    public void setCharacter4(String character4) {
        this.character4 = character4;
    }

    public String getCharacter5() {
        return character5;
    }

    public void setCharacter5(String character5) {
        this.character5 = character5;
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
        if (!(object instanceof Ugyfel)) {
            return false;
        }
        Ugyfel other = (Ugyfel) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "tozsde.tozsdebackend.Ugyfel[ id=" + id + " ]";
    }
    
}
