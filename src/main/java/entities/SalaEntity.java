package entities;

import javax.persistence.*;

@Entity
@Table(name = "SALA", schema = "INF136573")
@IdClass(SalaEntityPK.class)
public class SalaEntity {

    private long nrSali;
    private byte liczbaMiejsc;
    private String kinoNazwa;
    private KinoEntity kinoEntity;

    @Id
    @Column(name = "NR_SALI")
    public long getNrSali() {
        return nrSali;
    }

    public void setNrSali(long nrSali) {
        this.nrSali = nrSali;
    }

    @Basic
    @Column(name = "LICZBA_MIEJSC")
    public byte getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setLiczbaMiejsc(byte liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }

    @Id
    @Column(name = "KINO_NAZWA")
    public String getKinoNazwa() {
        return kinoNazwa;
    }

    public void setKinoNazwa(String kinoNazwa) {
        this.kinoNazwa = kinoNazwa;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        SalaEntity that = (SalaEntity)o;

        if(nrSali != that.nrSali) return false;
        if(liczbaMiejsc != that.liczbaMiejsc) return false;
        if(kinoNazwa != null ? !kinoNazwa.equals(that.kinoNazwa) : that.kinoNazwa != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(nrSali ^ (nrSali >>> 32));
        result = 31 * result + (int)liczbaMiejsc;
        result = 31 * result + (kinoNazwa != null ? kinoNazwa.hashCode() : 0);
        return result;
    }

    @MapsId("kinoNazwa")
    @ManyToOne
    @JoinColumn(name = "KINO_NAZWA", referencedColumnName = "NAZWA", nullable = false)
    public KinoEntity getKinoEntity() {
        return kinoEntity;
    }

    public void setKinoEntity(KinoEntity kinoByKinoNazwa) {
        this.kinoEntity = kinoByKinoNazwa;
    }

}

