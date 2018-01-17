package Model;

import javax.persistence.*;

/**
 * Created by cknev on 15-1-2018.
 */

@Entity
public class Location {
    @Id
    @GeneratedValue
    private int id;
    private float latFloat;
    private float longFloat;
    @OneToOne
    @PrimaryKeyJoinColumn
    private Friend friend;

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }

    public Location(float latFloat, float longFloat) {
        this.latFloat = latFloat;
        this.longFloat = longFloat;
    }

    public float getLatFloat() {
        return latFloat;
    }

    public void setLatFloat(float latFloat) {
        this.latFloat = latFloat;
    }

    public float getLongFloat() {
        return longFloat;
    }

    public void setLongFloat(float longFloat) {
        this.longFloat = longFloat;
    }
}
