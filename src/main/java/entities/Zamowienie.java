package entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Zamowienie {

    private long nrZamowienia;
    private long klientIdKlienta;
    private Collection<Bilet> biletsByNrZamowienia;

    @Id
    @Column(name = "NR_ZAMOWIENIA")
    public long getNrZamowienia() {
        return nrZamowienia;
    }

    public void setNrZamowienia(long nrZamowienia) {
        this.nrZamowienia = nrZamowienia;
    }

    @Basic
    @Column(name = "KLIENT_ID_KLIENTA")
    public long getKlientIdKlienta() {
        return klientIdKlienta;
    }

    public void setKlientIdKlienta(long klientIdKlienta) {
        this.klientIdKlienta = klientIdKlienta;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Zamowienie that = (Zamowienie)o;

        if(nrZamowienia != that.nrZamowienia) return false;
        if(klientIdKlienta != that.klientIdKlienta) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(nrZamowienia ^ (nrZamowienia >>> 32));
        result = 31 * result + (int)(klientIdKlienta ^ (klientIdKlienta >>> 32));
        return result;
    }

    @OneToMany(mappedBy = "zamowienieByZamowienieNrZamowienia")
    public Collection<Bilet> getBiletsByNrZamowienia() {
        return biletsByNrZamowienia;
    }

    public void setBiletsByNrZamowienia(Collection<Bilet> biletsByNrZamowienia) {
        this.biletsByNrZamowienia = biletsByNrZamowienia;
    }

}
