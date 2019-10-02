import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sloth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer numberOfToes;
    private String name;
    private  Double hairLengthInCM;
    private Double weightInKG;
    private Double speedKPH;

    public Sloth() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumberOfToes() {
        return numberOfToes;
    }

    public void setNumberOfToes(Integer numberOfToes) {
        this.numberOfToes = numberOfToes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHairLengthInCM() {
        return hairLengthInCM;
    }

    public void setHairLengthInCM(Double hairLengthInCM) {
        this.hairLengthInCM = hairLengthInCM;
    }

    public Double getWeightInKG() {
        return weightInKG;
    }

    public void setWeightInKG(Double weightInKG) {
        this.weightInKG = weightInKG;
    }

    public Double getSpeedKPH() {
        return speedKPH;
    }

    public void setSpeedKPH(Double speedKPH) {
        this.speedKPH = speedKPH;
    }
}

