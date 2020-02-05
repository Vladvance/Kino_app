package entities;

import javax.persistence.*;

@Entity
@Table(name = "PROMOCJA", schema = "INF136573")
public class PromocjaEntity {

    private long idPromocji;
    private String rodzajPromocji;
    private long obnizka;

    @Id
    @Column(name = "ID_PROMOCJI")
    public long getIdPromocji() {
        return idPromocji;
    }

    public void setIdPromocji(long idPromocji) {
        this.idPromocji = idPromocji;
    }

    @Basic
    @Column(name = "RODZAJ_PROMOCJI")
    public String getRodzajPromocji() {
        return rodzajPromocji;
    }

    public void setRodzajPromocji(String rodzajPromocji) {
        this.rodzajPromocji = rodzajPromocji;
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

        PromocjaEntity that = (PromocjaEntity)o;

        if(idPromocji != that.idPromocji) return false;
        if(obnizka != that.obnizka) return false;
        if(rodzajPromocji != null ? !rodzajPromocji.equals(that.rodzajPromocji) : that.rodzajPromocji != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int)(idPromocji ^ (idPromocji >>> 32));
        result = 31 * result + (rodzajPromocji != null ? rodzajPromocji.hashCode() : 0);
        result = 31 * result + (int)(obnizka ^ (obnizka >>> 32));
        return result;
    }

}
