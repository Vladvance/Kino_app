package entities;

import javax.persistence.*;

@Entity
@Table(name = "BILET", schema = "INF136573")
public class BiletEntity {

    private long idBiletu;
    private String rodzaj;
    private byte nrMiejsca;

    @Id
    @Column(name = "ID_BILETU")
    public long getIdBiletu() {
        return idBiletu;
    }

    public void setIdBiletu(long idBiletu) {
        this.idBiletu = idBiletu;
    }

    @Basic
    @Column(name = "RODZAJ")
    public String getRodzaj() {
        return rodzaj;
    }

    public void setRodzaj(String rodzaj) {
        this.rodzaj = rodzaj;
    }

    @Basic
    @Column(name = "NR_MIEJSCA")
    public byte getNrMiejsca() {
        return nrMiejsca;
    }

    public void setNrMiejsca(byte nrMiejsca) {
        this.nrMiejsca = nrMiejsca;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        BiletEntity that = (BiletEntity)o;

        if(idBiletu != that.idBiletu) return false;
        if(nrMiejsca != that.nrMiejsca) return false;
        if(rodzaj != null ? !rodzaj.equals(that.rodzaj) : that.rodzaj != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(idBiletu ^ (idBiletu >>> 32));
        result = 31 * result + (rodzaj != null ? rodzaj.hashCode() : 0);
        result = 31 * result + (int)nrMiejsca;
        return result;
    }

}
