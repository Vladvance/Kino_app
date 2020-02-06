package entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Promocja {

    private long idProm;
    private String rodzajProm;
    private long obnizka;
    private Collection<Bilet> biletsByIdProm;

    @Id
    @Column(name = "ID_PROM")
    public long getIdProm() {
        return idProm;
    }

    public void setIdProm(long idProm) {
        this.idProm = idProm;
    }

    @Basic
    @Column(name = "RODZAJ_PROM")
    public String getRodzajProm() {
        return rodzajProm;
    }

    public void setRodzajProm(String rodzajProm) {
        this.rodzajProm = rodzajProm;
    }

    @Basic
    @Column(name = "OBNIZKA")
    public long getObnizka() {
        return obnizka;
    }

    public void setObnizka(long obnizka) {
        this.obnizka = obnizka;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Promocja promocja = (Promocja)o;

        if(idProm != promocja.idProm) return false;
        if(obnizka != promocja.obnizka) return false;
        if(rodzajProm != null ? !rodzajProm.equals(promocja.rodzajProm) : promocja.rodzajProm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(idProm ^ (idProm >>> 32));
        result = 31 * result + (rodzajProm != null ? rodzajProm.hashCode() : 0);
        result = 31 * result + (int)(obnizka ^ (obnizka >>> 32));
        return result;
    }

    @OneToMany(mappedBy = "promocjaByPromocjaIdProm")
    public Collection<Bilet> getBiletsByIdProm() {
        return biletsByIdProm;
    }

    public void setBiletsByIdProm(Collection<Bilet> biletsByIdProm) {
        this.biletsByIdProm = biletsByIdProm;
    }

}
