package put.poznan.kinosequel.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PROMOCJA", schema = "INF136573")
public class Discount {

    private long discountId;
    private String discType;
    private long discPercent;

    @Id
    @Column(name = "ID_PROM")
    public long getDiscountId() {
        return discountId;
    }

    public void setDiscountId(long discountId) {
        this.discountId = discountId;
    }

    @Basic
    @Column(name = "RODZAJ_PROM")
    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

    @Basic
    @Column(name = "OBNIZKA")
    public long getDiscPercent() {
        return discPercent;
    }

    public void setDiscPercent(long discPercent) {
        this.discPercent = discPercent;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Discount discount = (Discount)o;
        return discountId == discount.discountId &&
                discPercent == discount.discPercent &&
                Objects.equals(discType, discount.discType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountId, discType, discPercent);
    }

}
