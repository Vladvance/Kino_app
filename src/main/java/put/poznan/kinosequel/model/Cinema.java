package put.poznan.kinosequel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "KINO", schema = "INF136573")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cinema {

    @Id
    @Column(name = "NAZWA")
    private String name;

    @Basic
    @Column(name = "ADRES")
    private String address;
}
