package poli;

import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Cache;

import javax.persistence.*;

@Entity
@Table(name = "ZESPOLY", schema = "INF136573")
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class ZespolyEntity {

    @Override
    public String toString() {
        return "ZespolyEntity{" +
                "idZesp=" + idZesp +
                ", nazwa='" + nazwa + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }

    private long idZesp;
    private String nazwa;
    private String adres;

    @Id
    @Column(name = "ID_ZESP")
    public long getIdZesp() {
        return idZesp;
    }

    public void setIdZesp(long idZesp) {
        this.idZesp = idZesp;
    }

    @Basic
    @Column(name = "NAZWA")
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Basic
    @Column(name = "ADRES")
    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        ZespolyEntity that = (ZespolyEntity)o;

        if(idZesp != that.idZesp) return false;
        if(nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if(adres != null ? !adres.equals(that.adres) : that.adres != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(idZesp ^ (idZesp >>> 32));
        result = 31 * result + (nazwa != null ? nazwa.hashCode() : 0);
        result = 31 * result + (adres != null ? adres.hashCode() : 0);
        return result;
    }

}
