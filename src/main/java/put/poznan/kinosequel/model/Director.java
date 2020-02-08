package put.poznan.kinosequel.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "REZYSER", schema = "INF136573")
@IdClass(DirectorPK.class)
public class Director {

    @Id
    @Column(name = "IMIE")
    private String name;

    @Id
    @Column(name = "NAZWISKO")
    private String surname;

    @OneToMany(mappedBy = "director", cascade = CascadeType.ALL, orphanRemoval = true)
    private Collection<Film> films;

    public Director() {}

    public Director(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Director director = (Director)o;
        return Objects.equals(name, director.name) &&
                Objects.equals(surname, director.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public Collection<Film> getFilms() {
        return films;
    }

    public void setFilms(Collection<Film> films) {
        this.films = films;
    }

}
