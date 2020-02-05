package poli;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name = "PRACOWNICY", schema = "INF136573")
@Cacheable
@org.hibernate.annotations.Cache(usage= CacheConcurrencyStrategy.READ_ONLY)
public class PracownicyEntity {

    private long idPrac;
    private String nazwisko;
    private Time zatrudniony;
    private Long placaPod;
    private Long placaDod;
    private EtatyEntity etatyByEtat;
    private PracownicyEntity pracownicyByIdSzefa;

    @Id
    @Column(name = "ID_PRAC")
    public long getIdPrac() {
        return idPrac;
    }

    public void setIdPrac(long idPrac) {
        this.idPrac = idPrac;
    }

    @Basic
    @Column(name = "NAZWISKO")
    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Basic
    @Column(name = "ZATRUDNIONY")
    public Time getZatrudniony() {
        return zatrudniony;
    }

    public void setZatrudniony(Time zatrudniony) {
        this.zatrudniony = zatrudniony;
    }

    @Basic
    @Column(name = "PLACA_POD")
    public Long getPlacaPod() {
        return placaPod;
    }

    public void setPlacaPod(Long placaPod) {
        this.placaPod = placaPod;
    }

    @Basic
    @Column(name = "PLACA_DOD")
    public Long getPlacaDod() {
        return placaDod;
    }

    public void setPlacaDod(Long placaDod) {
        this.placaDod = placaDod;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        PracownicyEntity that = (PracownicyEntity)o;

        if(idPrac != that.idPrac) return false;
        if(nazwisko != null ? !nazwisko.equals(that.nazwisko) : that.nazwisko != null) return false;
        if(zatrudniony != null ? !zatrudniony.equals(that.zatrudniony) : that.zatrudniony != null) return false;
        if(placaPod != null ? !placaPod.equals(that.placaPod) : that.placaPod != null) return false;
        if(placaDod != null ? !placaDod.equals(that.placaDod) : that.placaDod != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(idPrac ^ (idPrac >>> 32));
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + (zatrudniony != null ? zatrudniony.hashCode() : 0);
        result = 31 * result + (placaPod != null ? placaPod.hashCode() : 0);
        result = 31 * result + (placaDod != null ? placaDod.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ETAT", referencedColumnName = "NAZWA")
    public EtatyEntity getEtatyByEtat() {
        return etatyByEtat;
    }

    public void setEtatyByEtat(EtatyEntity etatyByEtat) {
        this.etatyByEtat = etatyByEtat;
    }

    @ManyToOne
    @JoinColumn(name = "ID_SZEFA", referencedColumnName = "ID_PRAC")
    public PracownicyEntity getPracownicyByIdSzefa() {
        return pracownicyByIdSzefa;
    }

    public void setPracownicyByIdSzefa(PracownicyEntity pracownicyByIdSzefa) {
        this.pracownicyByIdSzefa = pracownicyByIdSzefa;
    }

    @Override
    public String toString() {
        return "PracownicyEntity{" +
                "idPrac=" + idPrac +
                ", nazwisko='" + nazwisko + '\'' +
                ", zatrudniony=" + zatrudniony +
                ", placaPod=" + placaPod +
                ", placaDod=" + placaDod +
                ", etatyByEtat=" + etatyByEtat +
                ", pracownicyByIdSzefa=" + pracownicyByIdSzefa +
                '}';
    }

}
