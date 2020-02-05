package entities;

import javax.persistence.*;

@Entity
@Table(name = "ZAMOWIENIE", schema = "INF136573")
public class ZamowienieEntity {

    private long nrZamowienia;
    private KlientEntity klientByKlientIdKlienta;

    @Id
    @Column(name = "NR_ZAMOWIENIA")
    public long getNrZamowienia() {
        return nrZamowienia;
    }

    public void setNrZamowienia(long nrZamowienia) {
        this.nrZamowienia = nrZamowienia;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        ZamowienieEntity that = (ZamowienieEntity)o;

        if(nrZamowienia != that.nrZamowienia) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int)(nrZamowienia ^ (nrZamowienia >>> 32));
    }

    @ManyToOne
    @JoinColumn(name = "KLIENT_ID_KLIENTA", referencedColumnName = "ID_KLIENTA", nullable = false)
    public KlientEntity getKlientByKlientIdKlienta() {
        return klientByKlientIdKlienta;
    }

    public void setKlientByKlientIdKlienta(KlientEntity klientByKlientIdKlienta) {
        this.klientByKlientIdKlienta = klientByKlientIdKlienta;
    }

}
