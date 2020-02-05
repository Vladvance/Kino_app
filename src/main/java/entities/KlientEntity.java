package entities;

import javax.persistence.*;

@Entity
@Table(name = "KLIENT", schema = "INF136573")
public class KlientEntity {

    private long idKlienta;
    private String imie;
    private String nazwisko;
    private String adresEMail;
    private String nrTelefonu;

    @Id
    @Column(name = "ID_KLIENTA")
    public long getIdKlienta() {
        return idKlienta;
    }

    public void setIdKlienta(long idKlienta) {
        this.idKlienta = idKlienta;
    }

    @Basic
    @Column(name = "IMIE")
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
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
    @Column(name = "adres_e-mail")
    public String getAdresEMail() {
        return adresEMail;
    }

    public void setAdresEMail(String adresEMail) {
        this.adresEMail = adresEMail;
    }

    @Basic
    @Column(name = "NR_TELEFONU")
    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        KlientEntity that = (KlientEntity)o;

        if(idKlienta != that.idKlienta) return false;
        if(imie != null ? !imie.equals(that.imie) : that.imie != null) return false;
        if(nazwisko != null ? !nazwisko.equals(that.nazwisko) : that.nazwisko != null) return false;
        if(adresEMail != null ? !adresEMail.equals(that.adresEMail) : that.adresEMail != null) return false;
        if(nrTelefonu != null ? !nrTelefonu.equals(that.nrTelefonu) : that.nrTelefonu != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(idKlienta ^ (idKlienta >>> 32));
        result = 31 * result + (imie != null ? imie.hashCode() : 0);
        result = 31 * result + (nazwisko != null ? nazwisko.hashCode() : 0);
        result = 31 * result + (adresEMail != null ? adresEMail.hashCode() : 0);
        result = 31 * result + (nrTelefonu != null ? nrTelefonu.hashCode() : 0);
        return result;
    }

}