package entities;

import javax.persistence.*;

@Entity
public class Bilet {

    private long idBiletu;
    private String rodzaj;
    private byte nrMiejsca;
    private Zamowienie zamowienieByZamowienieNrZamowienia;
    private Promocja promocjaByPromocjaIdProm;
    private Seans seansBySeansIdSeansu;

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

        Bilet bilet = (Bilet)o;

        if(idBiletu != bilet.idBiletu) return false;
        if(nrMiejsca != bilet.nrMiejsca) return false;
        if(rodzaj != null ? !rodzaj.equals(bilet.rodzaj) : bilet.rodzaj != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(idBiletu ^ (idBiletu >>> 32));
        result = 31 * result + (rodzaj != null ? rodzaj.hashCode() : 0);
        result = 31 * result + (int)nrMiejsca;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "ZAMOWIENIE_NR_ZAMOWIENIA", referencedColumnName = "NR_ZAMOWIENIA", nullable = false)
    public Zamowienie getZamowienieByZamowienieNrZamowienia() {
        return zamowienieByZamowienieNrZamowienia;
    }

    public void setZamowienieByZamowienieNrZamowienia(Zamowienie zamowienieByZamowienieNrZamowienia) {
        this.zamowienieByZamowienieNrZamowienia = zamowienieByZamowienieNrZamowienia;
    }

    @ManyToOne
    @JoinColumn(name = "PROMOCJA_ID_PROM", referencedColumnName = "ID_PROM")
    public Promocja getPromocjaByPromocjaIdProm() {
        return promocjaByPromocjaIdProm;
    }

    public void setPromocjaByPromocjaIdProm(Promocja promocjaByPromocjaIdProm) {
        this.promocjaByPromocjaIdProm = promocjaByPromocjaIdProm;
    }

    @ManyToOne
    @JoinColumn(name = "SEANS_ID_SEANSU", referencedColumnName = "ID_SEANSU", nullable = false)
    public Seans getSeansBySeansIdSeansu() {
        return seansBySeansIdSeansu;
    }

    public void setSeansBySeansIdSeansu(Seans seansBySeansIdSeansu) {
        this.seansBySeansIdSeansu = seansBySeansIdSeansu;
    }

}
