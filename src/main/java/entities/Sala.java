package entities;

import javax.persistence.*;

@Entity
@IdClass(SalaPK.class)
public class Sala {

    private long nrSali;
    private byte liczbaMiejsc;
    private String kinoNazwa;
    private Kino kinoByKinoNazwa;

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

        Sala sala = (Sala)o;

        if(nrSali != sala.nrSali) return false;
        if(liczbaMiejsc != sala.liczbaMiejsc) return false;
        if(kinoNazwa != null ? !kinoNazwa.equals(sala.kinoNazwa) : sala.kinoNazwa != null) return false;

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
    public Kino getKinoByKinoNazwa() {
        return kinoByKinoNazwa;
    }

    public void setKinoByKinoNazwa(Kino kinoByKinoNazwa) {
        this.kinoByKinoNazwa = kinoByKinoNazwa;
    }

}
