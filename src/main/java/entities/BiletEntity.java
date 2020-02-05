package entities;

import javax.persistence.*;

@Entity
@Table(name = "BILET", schema = "INF136573")
public class BiletEntity {

    private long idBiletu;
    private String rodzajBiletu;
    private byte nrMiejsca;
    private ZamowienieEntity zamowienieByZamowienieNrZamowienia;
    private PromocjaEntity promocjaByPromocjaIdPromocji;
    private SeansEntity seansBySeansIdSeansu;

    @Id
    @Column(name = "ID_BILETU")
    public long getIdBiletu() {
        return idBiletu;
    }

    public void setIdBiletu(long idBiletu) {
        this.idBiletu = idBiletu;
    }

    @Basic
    @Column(name = "RODZAJ_BILETU")
    public String getRodzajBiletu() {
        return rodzajBiletu;
    }

    public void setRodzajBiletu(String rodzajBiletu) {
        this.rodzajBiletu = rodzajBiletu;
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
        if(rodzajBiletu != null ? !rodzajBiletu.equals(that.rodzajBiletu) : that.rodzajBiletu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(idBiletu ^ (idBiletu >>> 32));
        result = 31 * result + (rodzajBiletu != null ? rodzajBiletu.hashCode() : 0);
        result = 31 * result + (int)nrMiejsca;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ZAMOWIENIE_NR_ZAMOWIENIA", referencedColumnName = "NR_ZAMOWIENIA", nullable = false)
    public ZamowienieEntity getZamowienieByZamowienieNrZamowienia() {
        return zamowienieByZamowienieNrZamowienia;
    }

    public void setZamowienieByZamowienieNrZamowienia(ZamowienieEntity zamowienieByZamowienieNrZamowienia) {
        this.zamowienieByZamowienieNrZamowienia = zamowienieByZamowienieNrZamowienia;
    }

    @ManyToOne
    @JoinColumn(name = "PROMOCJA_ID_PROMOCJI", referencedColumnName = "ID_PROMOCJI")
    public PromocjaEntity getPromocjaByPromocjaIdPromocji() {
        return promocjaByPromocjaIdPromocji;
    }

    public void setPromocjaByPromocjaIdPromocji(PromocjaEntity promocjaByPromocjaIdPromocji) {
        this.promocjaByPromocjaIdPromocji = promocjaByPromocjaIdPromocji;
    }

    @ManyToOne
    @JoinColumn(name = "SEANS_ID_SEANSU", referencedColumnName = "ID_SEANSU", nullable = false)
    public SeansEntity getSeansBySeansIdSeansu() {
        return seansBySeansIdSeansu;
    }

    public void setSeansBySeansIdSeansu(SeansEntity seansBySeansIdSeansu) {
        this.seansBySeansIdSeansu = seansBySeansIdSeansu;
    }

}
