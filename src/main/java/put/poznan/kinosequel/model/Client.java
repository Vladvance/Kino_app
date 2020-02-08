package put.poznan.kinosequel.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "KLIENT", schema = "INF136573")
public class Client {

    private long cliientId;
    private String name;
    private String surname;
    private String email;
    private String phone;

    @Id
    @Column(name = "ID_KLIENTA")
    public long getCliientId() {
        return cliientId;
    }

    public void setCliientId(long cliientId) {
        this.cliientId = cliientId;
    }

    @Basic
    @Column(name = "IMIE")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "NAZWISKO")
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Basic
    @Column(name = "ADRES_EMAIL")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "NR_TELEFONU")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Client client = (Client)o;
        return cliientId == client.cliientId &&
                Objects.equals(name, client.name) &&
                Objects.equals(surname, client.surname) &&
                Objects.equals(email, client.email) &&
                Objects.equals(phone, client.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliientId, name, surname, email, phone);
    }

}
