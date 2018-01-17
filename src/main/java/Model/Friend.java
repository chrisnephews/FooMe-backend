package Model;

import javax.persistence.*;

/**
 * Created by cknev on 10-1-2018.
 */


@Entity
public class Friend {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Location location;

    public Friend(String name, String email, Location location) {
        this.name = name;
        this.email = email;
        this.location = location;
    }

    public Friend() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


}