package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CPUTemp {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private float temperature;

    public CPUTemp() {
    }

    public CPUTemp(float temperature) {
        this.temperature = temperature;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
}
