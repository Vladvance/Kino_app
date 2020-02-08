package put.poznan.kinosequel.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class FilmPK implements Serializable {

    @Id
    @Column(name = "TYTUL")
    private String title;

    @Id
    @Column(name = "ROK_PRODUKCJI")
    private String productionYear;

    public FilmPK() {}

    public FilmPK(String title, String productionYear) {
        this.title = title;
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "FilmPK{" +
                "title='" + title + '\'' +
                ", productionYear='" + productionYear + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

}
