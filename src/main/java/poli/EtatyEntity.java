package poli;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

@Entity
@Table(name = "ETATY", schema = "INF136573")
@Cacheable
@Cache(usage= CacheConcurrencyStrategy.READ_ONLY)
public class EtatyEntity {

    private String nazwa;
    private Long placaMin;
    private Long placaMax;

    @Id
    @Column(name = "NAZWA")
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Basic
    @Column(name = "PLACA_MIN")
    public Long getPlacaMin() {
        return placaMin;
    }

    public void setPlacaMin(Long placaMin) {
        this.placaMin = placaMin;
    }

    @Basic
    @Column(name = "PLACA_MAX")
    public Long getPlacaMax() {
        return placaMax;
    }

    public void setPlacaMax(Long placaMax) {
        this.placaMax = placaMax;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        EtatyEntity that = (EtatyEntity)o;

        if(nazwa != null ? !nazwa.equals(that.nazwa) : that.nazwa != null) return false;
        if(placaMin != null ? !placaMin.equals(that.placaMin) : that.placaMin != null) return false;
        if(placaMax != null ? !placaMax.equals(that.placaMax) : that.placaMax != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nazwa != null ? nazwa.hashCode() : 0;
        result = 31 * result + (placaMin != null ? placaMin.hashCode() : 0);
        result = 31 * result + (placaMax != null ? placaMax.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EtatyEntity{" +
                "nazwa='" + nazwa + '\'' +
                ", placaMin=" + placaMin +
                ", placaMax=" + placaMax +
                '}';
    }

}
